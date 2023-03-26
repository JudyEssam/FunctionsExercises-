import java.util.Scanner;

public class p3 {
    public static Scanner sc = new Scanner(System.in) ;
    public static void getVowels (String word){
        int count=0 ;
        for (int i =0 ; i<word.length();i++){
            if(word.charAt(i)=='i'||word.charAt(i)=='a'||word.charAt(i)=='u'||word.charAt(i)=='o'||word.charAt(i)=='e'){
                count++ ;
            }
        }
        System.out.println("Number of vowels "+ count);
    }
    public static void main(String[] args){
        System.out.println("enter the word");
        String word = sc.next();
        getVowels(word);
    }
}
