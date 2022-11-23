import java.util.*;

import javax.lang.model.util.ElementScanner14;

public class shark6 {
    public static void main(String[] args) {
        int a, b, c;
        Scanner obj = new Scanner(System.in);
        System.out.println("Enter the input of a:");
        a = obj.nextInt();
        System.out.println("Enter the input of b:");
        b = obj.nextInt();
        System.out.println("Enter the input of c:");
        c = obj.nextInt();
        if (a > b && b > c && a > c) {
            System.out.println("Largest number is:" + a);
        } else if (b > c) {
            System.out.println("Largest number is:" + b);
        } else {
            System.out.println("Largest number is:" + c);
        }

    }

}
