import java.util.*;

public class shark1 {
    public static void main(String args[]) {
        String name, reverse = "";
        int len;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the name: ");
        name = obj.nextLine();
        len = name.length();
        for (int i = len - 1; i >= 0; i--)
            reverse = reverse + name.charAt(i);
        {
            if (name.equals(reverse))
                System.out.println("This is palindrome");

            else {
                System.out.println("This is not palindrome");
            }
        }
    }
}