import java.util.*;
import java.util.Scanner;

public class leafyear {
    public static void main(String[] ar) {
        System.out.print("enter the number:");
        Scanner x = new Scanner(System.in);
        int n = x.nextInt();
        System.out.print(n);
        if (n % 4 == 0 && n%100!=0) {
            System.out.println("\n it is a leafyear");
        } else {
            System.out.println("\n it is not a leaf yaer");
        }
    }
}
