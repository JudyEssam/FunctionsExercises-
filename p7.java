import java.util.Scanner;
public class p7 {
    public static void checkValid(String password) {
        if (password.length() < 10) {
            System.out.println("password invalid Please Enter at least ten characters");
        } else {
            int count = 0;
            boolean x = true;
            for (int i = 0; i < password.length(); i++) {
                if (Character.isLetterOrDigit(password.charAt(i)) != true) {
                    System.out.println("password invalid please enter only digits and letters");
                    x=false ;
                }
                else if (Character.isDigit(password.charAt(i))) {
                    count++;
                }
            }
            while(x) {

                if (count < 2) {
                    System.out.println("password invalid , please enter at least two digits");
                    break;
                } else {
                    System.out.println("password is valid " + password);
                    break;
                }
            }
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the password");
        String password = sc.next();
        checkValid(password);
    }}

