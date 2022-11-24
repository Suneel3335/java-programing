import java.util.*;

public class shark4 {
    public static void main(String args[]) {
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the number you want to check: ");
        int a;
        a = obj.nextInt();

        if (a % 2 == 0) {
            System.out.println("even number");
        } else {
            System.out.println("odd number");
        }
    }

}
