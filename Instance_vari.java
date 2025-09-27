public class InstanceVari {
    String name = "Meet Parmar"; // Instance variable
    int instanceV = 5; // Instance variable
    static String subject = "Java"; // Static variable
    public static void main(String[] args) {
        InstanceVari obj = new InstanceVari();
        System.out.println("Instance variable: " + obj.instanceV);
        String University = "PU"; // Local variable
        System.out.println("Local variable: " + University);
        // Removed undefined 'main' class usage
        // main obj = new main();
        // main obj1 = new main();
        // main obj2 = new main();
        
        
    }
}