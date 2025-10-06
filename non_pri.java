public class main{
    public static void main(String[] args){
        String db_name = "meetparmarj07@gmail.com";
        String sign_in = "Meetparmarj07@gmail.com";
        String result = sign_in.toLowerCase();
        if (db_name.equals(result)) {
            System.out.println("Login Successful");
        } else {
            System.out.println("Login Failed");
        }
         boolean bankai = db_name.equals(sign_in);
            System.out.println(bankai);
    }
}
/* if (condition) {
         code to be executed if condition is true
     } else {
        code to be executed if condition is false
    list of logical operators:
    && (logical and) - returns true if both statements are true
    || (logical or) - returns true if one of the statements is true
    ! (logical not) - reverses the result, returns false if the result is true
    list of comparison operators:
    == (equal to) - returns true if the two values are equal
    != (not equal to) - returns true if the two values are not equal
    > (greater than) - returns true if the left value is greater than the right value
    < (less than) - returns true if the left value is less than the right value
    >= (greater than or equal to) - returns true if the left value is greater than or equal to the right value
    <= (less than or equal to) - returns true if the left value is less than
    methods of sring class:
    1. length() - returns the length of the string
    2. toLowerCase() - converts the string to lowercase
    3. toUpperCase() - converts the string to uppercase
    4. isequals() - compares two strings and returns true if they are equal
    5. isequalsIgnoreCase() - compares two strings and returns true if they are equal, ignoring case considerations
    6. charAt() - returns the character at the specified index
    
     } */
    