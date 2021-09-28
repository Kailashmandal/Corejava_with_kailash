/*
Multiple inheritance :
      java doesn't support multiple inheritance but a class can implements
      more than one interface thus multiple inheritance is possible through interfaces.

      example:-
 */
interface java{
    void StudyJava();
    void ImplementJava();
}
interface Sql{
    void LearnSql();
    void ImplementDBMS();
}
public class Interface3 implements java,Sql {  // class is implementing both interfaces
    public void StudyJava() {
        System.out.println("Learn java ");
    }

    public void LearnSql() {
        System.out.println("Learn Sql ");
    }
    public void ImplementJava(){
        System.out.println("Make a simple application !");
    }
    public void ImplementDBMS(){
        System.out.println("Connect Data base with Application !");
    }

    public static void main(String[] args) {
        Interface3 in=new Interface3();
        in.StudyJava();
        in.ImplementJava();

        in.LearnSql();
        in.ImplementDBMS();
    }
}
