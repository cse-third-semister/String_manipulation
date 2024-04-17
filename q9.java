import java.util.*;

public class q9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a sentence");
        String sen = sc.nextLine();
        System.out.println("Enter 2 word");
        String wrd1 = sc.nextLine();
        String wrd2 = sc.nextLine();
        int sindex = sen.indexOf(wrd1);
        int eindex = wrd1.length() + sindex;
        System.out.println("original word " + sen);
        System.out.println("After changing " );
        System.out.println(sen.substring(0,sindex) + wrd2 + sen.substring(eindex) );
      
        



        
    }
    
}
