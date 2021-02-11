import java.util.Scanner;

public class Application {
    public static void main(String s[]) {
        Scanner ob = new Scanner(System.in);
        System.out.print("Enter the string = ");
        String str_in = ob.nextLine();
        StringFunctions stringFunctions = new StringFunctions();       //class StringFunctions is called
        System.out.println("\nThe reverse of the string = " + stringFunctions.reverse(str_in));
        System.out.println("The size of the string = " + stringFunctions.size(str_in));

    }
}