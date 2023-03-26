import java.util.Scanner;
public class p4 {
    public static void countWords(String sentence ){
        if(sentence==null || sentence.isEmpty()){
            System.out.println(0);
        }
        System.out.println("Number of words in the sentence: "+ sentence.split("\\s+").length);
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the sentence");
        String line = sc.nextLine() ;
         countWords(line);



}}

