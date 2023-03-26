import java.util.Scanner;

public class p8 {
    public static boolean checkMiddle (int n1,int n2, int n3){
        int mid1,mid2,mid3 ;
        mid1=(n2+n3)/2 ;
        mid2=(n1+n3)/2 ;
        mid3=(n1+n2)/2 ;
        if(mid1==n1||mid2==n2||mid3==n3){
          return true;
        }
        else{
            return false;
        }
    }
    public static void main(String[] args){
        int num1,num2,num3 ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter first integer");
        num1=sc.nextInt();
        System.out.println("Enter second integer");
        num2=sc.nextInt();
        System.out.println("Enter third integer");
        num3=sc.nextInt();
        Boolean result ;
        result = checkMiddle(num1,num2,num3);
        System.out.println("check whether the three said numbers has a midpoint! "+result);

    }}

