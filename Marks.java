import java.util.Scanner;
class Marks {
    public static void main(String[] args) {
        Scanner EX = new Scanner(System.in);
        System.out.println("Enter Your Marks ");
        float marks = EX.nextFloat();
        System.out.println("Enter Your Marks");
        float marks1 = EX.nextFloat();
        
        if(marks % 2 == 0 ){
            System.out.println("First Number Is Even");
        }else{
            System.out.println("First Number Is Odd");
        }
        if(marks1 % 2 == 0){
            System.out.println("Second Number is Even");
        }else{
            System.out.println("Second Number Is Odd");
        }
        EX.close();
    }
}