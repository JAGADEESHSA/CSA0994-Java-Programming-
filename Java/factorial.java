import java.util.Scanner;

public class factorial {
    public static void main(String[] ar)
    {
        System.out.println("enter the number:\n");
        int fact=1;
        int n=5;
        for(int i=1;i<=n;i++)
        {
            fact=fact*i;
        }
        System.out.println("factorial="+fact);
    }
}
