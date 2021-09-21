public class StringMethods {
    /*
    kailash
    21 sept 2021
    methods in String class
     */
    public static void main(String[] args) {
        /*
        we have different methods in string in java to operate on it.
        for internal implementation we have to select then press : ctrl+alt+b to that function.
        * you have to remember that most of function will return new string
         */

        String str="kailash";
        // OR
        String st=new String("kailash");
        // these will create two reference variable of same object "kailash"
       char s=str.charAt(4);
        System.out.println("character at 4th index is : "+s);

        String st2=st.concat(" mandal"); // this will concatenate the string supplied to main string and return new string
        System.out.println(st2);

        int len=st.length(); // it returns the length of string
        System.out.println("the lenght of st is : "+len);

       boolean res= st2.equalsIgnoreCase("KAILASH MANDAL") ;// this will ignore the case of string and give ture or false
        System.out.println("result is : "+res);

       String st1= st.replace('a' ,'o');// this will replace all old char to new char in string and return new string
        System.out.println("st is : "+st1);

        String sa=str.substring(3); // provide begin index and it will give substring form supplied index to end
        System.out.println("sa is : "+sa);

        String sc=st.substring(1,4); // supply start and end index
        System.out.println("sc is : "+sc);

        String sp="  kailash   ";
        String sv=sp.trim(); // it will remove spaces from the beginning and from the ending
        System.out.println("sv is : "+sv);

        // valueOf() method is overloaded for all primitive data types like boolean char integer float double etc.
        String dval=String.valueOf(12.345); // for double
        String fval=String.valueOf(12.05f); // for float
        String Ival=String.valueOf(555); // for integers

        System.out.println("dval is : "+dval);

        String s1="mandal";
        System.out.println("comparison btw str and s1 :"+str.compareTo(s1));

        int idx=str.indexOf('k');
        System.out.println("first indxe of k in str : "+idx);
        int idx1=str.indexOf('a',3); // will give the index after 3rd index for a
        System.out.println("index of a after 3 is : "+idx1);
         int idx2=st.indexOf("man");
        System.out.println("the index of sub string man in st is : "+idx2);

        int lastidx=str.lastIndexOf('a');
        System.out.println("lats index of the string is : "+lastidx);
        String so="java is so so easy";
        int lastidx2=so.lastIndexOf("so");
        System.out.println("last index of so in so is :"+lastidx2);

        System.out.println("str is empty or not : "+str.isEmpty());

        //slit() return group of words present in string separated by space or regex
        String sr="java string slit method";
        String[] words=sr.split("\\s"); // will give words separated by space
        System.out.println("split array of string is : ");
        for(String w:words){
            System.out.println(w);
        }
    }
}
