import java.util.Scanner;
class Even_odd{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("Enter First Number:");
        int first = input.nextInt();
        System.out.println("Enter Second Number:");
        int second = input.nextInt();
        if(first % 2 == 0){
            System.out.println("First Number is Even");
        }else{
            System.out.println("First Number is Odd");
        }
        if(second % 2 == 0){
            System.out.println("Second Number is Even");
        }else{
            System.out.println("Second Number is Odd");
        }
        input.close();
    }
}