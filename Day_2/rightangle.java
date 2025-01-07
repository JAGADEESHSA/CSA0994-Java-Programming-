import java.util.Scanner;

public class rightangle {
    public static void main(String[] ar)
    {
        System.out.print("enter the number\n");
        Scanner x=new Scanner(System.in);
        int r=x.nextInt();
        for(int i=0;i<r;i++)
        {
            for(int j=0;j<i;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
