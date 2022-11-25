import java.util.Scanner;

public class Q2 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the 'Base' & 'Power' :");
        int a = input.nextInt();
        int b = input.nextInt();
        int i;
        int pow=1;
        for (i=0; i<b; i++)
        {
            pow=pow*a;
        }
        System.out.println(a+"^"+b+"="+pow);
    }
    
}
