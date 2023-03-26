import java.util.Scanner;

public class p2 {
    public static void getMiddle (String word){
        if(word.length()%2==0){
            int middle1 = Character.getNumericValue(word.charAt((word.length()/2)-1)) ;
            int middle2 = Character.getNumericValue(word.charAt((word.length()/2)));
            System.out.println("the number is even so the 2 middle numbers is "+middle1+" " +middle2);

        }
        else{
            int middle = Character.getNumericValue(word.charAt(word.length()/2)) ;
            System.out.println("the number is odd so the middle number is "+middle);
        }

    }
    public static void main(String[] args){
        System.out.println("Enter the word ");
        Scanner sc = new Scanner(System.in);
        String word = sc.next();
        getMiddle(word);

    }

}
