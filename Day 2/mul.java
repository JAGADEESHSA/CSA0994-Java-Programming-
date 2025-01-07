import java.util.Scanner;

public class mul {
    public static void main(String[] ar)
    {
        System.out.println("enter the number\n");
        Scanner x=new Scanner(System.in);
        int n=x.nextInt();
        for(int i=1;i<=10;i++)
        {
            System.out.println("5*"+i+"="+(n*i));
        }
    }
}
