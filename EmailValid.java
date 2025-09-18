import java.util.Scanner;
public class EmailValid {
    public static void main(String[] args) {
        System.out.println("Enter your email: ");
        Scanner sc = new Scanner(System.in);
        String email = sc.nextLine();

        if (email.contains("@") && email.endsWith(".com")) {
            System.out.println("Email is valid");
        }else{
            System.out.println("email is not valid");
        }
    }
}