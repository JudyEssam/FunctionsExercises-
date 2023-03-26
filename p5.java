import java.util.Scanner;

public class p5 {
    public static void getSum (int number){
        int sum=0;
        int lastDigit =0 ;
        while (number != 0){
            lastDigit=number%10;
            sum+=lastDigit;
            number/=10;
        }
        System.out.println("the sum of digits : " + sum );


    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter the number");
        int number = sc.nextInt();
        getSum(number);
    }

}
