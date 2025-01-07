import java.util.Scanner;

public class gcd {
    public static void main(String[] ar)
    {
        System.out.println("enter the number:\n");
        Scanner x=new Scanner(System.in);
        int a=x.nextInt();
        int b=x.nextInt();
        int lcm=a*b;
        while(b!=0)
        {
            int temp=b;
            b=a%b;
            a=temp;
        }
        System.out.println("gcd\n"+a);
        System.out.println("lcm\n"+(lcm/a));
    }
}
