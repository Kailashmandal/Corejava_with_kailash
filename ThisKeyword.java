class P{
    int roll_no;
    void setRoll_no(int roll_no){
        this.roll_no=roll_no;
        /*
        when we include this keyword its means current class object reference
         */
    }
}
public class ThisKeyword {
    public static void main(String[] args) {
        P p=new P();
        p.setRoll_no(50);
        System.out.println("roll no is : "+p.roll_no);
    }

}
