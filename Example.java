public class student{
    static String a = "Parul University";// static variable
    String b = "Meet Parmar";// instance Variable
    public static void main(String[] args) {
       float marks = 7.64f;// loacal  variable
      System.out.println(" University Name : " + a); 
      student MP = new student();//object for Student name
      System.out.println(" Student Name : " + MP.b);
      System.out.println("Marks: "+ marks);
    } 
}