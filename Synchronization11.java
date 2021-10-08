/*
Cooperation (Inter-thread communication) is a mechanism in which a thread
 is paused running in its critical section and another thread is allowed
 to enter (or lock) in the same critical section to be executed.
 It is implemented by following methods of Object class: wait() , notify(), notifyAll()
 */

// this is a simple consumer problem : if amount is lower than the amount he wants to withdraw then he has to wait
// and deposit first.
class Consumers {
    int amount=1000;
    synchronized void withDraw(int amount){ // creating synchronized method
        if(this.amount<amount){
            try {
                System.out.println("Balance is low !! Waiting for deposit..");
                wait();//calling wait method because amount is lower
            }catch (Exception e){
                System.out.println("Exception handled !!!");
            }
        }else {
            this.amount-=amount;
            System.out.println("withdrawal is completed !");
        }

    }
    synchronized void Deposit(int amount){
        this.amount+=amount;
        System.out.println("Deposit is complete ! ");
        notifyAll(); // invoking all threads which is waiting 
    }
}
public class Synchronization11 {
    public static void main(String[] args) {
        Consumers c=new Consumers();
        new Thread(() -> c.withDraw(2000)).start();
        System.out.println("Current amount is : "+c.amount);
        new Thread(()->c.Deposit(2000)).start();
    }
}
