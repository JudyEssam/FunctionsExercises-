import java.util.Scanner;

public class p6 {
    public static void getInterest (double amount,double rate , int years){
        for(int i =0 ; i<years; i++){
            amount=amount+(amount/rate);
            System.out.printf("Year %d its future value is %.2f \n",i+1,amount);
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the investment amount");
        double amount= sc.nextDouble();
        System.out.println("Enter the rate of interest");
        double rate = sc.nextDouble();
        System.out.println("Enter the number of years");
        int years= sc.nextInt();
        getInterest(amount,rate,years);

    }


    }
