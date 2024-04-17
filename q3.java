import java.util.Scanner;

public class q3 {
     static StringBuffer text = new StringBuffer("hello");

    public static void append(String str) {
       text.append(str);
       
    }

    public static void insert(int index, String str) {
        text.insert(index, str);
        
    }

    public static void delete(int startIndex, int endIndex) {
       text.delete(startIndex, endIndex);
        
    }

    public static void reverse() {
        text.reverse();
    }

    public static void replace(int startIndex, int endIndex, String str) {
        text.replace(startIndex, endIndex, str);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(text.capacity());
        System.out.println("Enter word to append");
        String s = sc.nextLine();
        text.append(s);
        System.out.println(text);
        System.out.println(text.capacity());
        System.out.println(text.length());


        System.out.println("Enter word to insert");
        String s1 = sc.nextLine();
        System.out.println("Enter index to insert");
        int index = sc.nextInt();
        insert(index, s1);
        System.out.println(text);
        System.out.println(text.capacity());



        System.out.println("Enter strat index to delete");
        index = sc.nextInt();
        System.out.println("Enter end index to delete");
        int index2 = sc.nextInt();
        delete(index,index2);
        System.out.println(text);

        // text.reverse();

        System.out.println("Enter strat index to replace");
        index = sc.nextInt();
        System.out.println("Enter end index to replace");
        index2 = sc.nextInt();
        replace(index,index2,"ok");
        System.out.println(text);

        



       
        }
    }


