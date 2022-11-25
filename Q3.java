import java.util.Scanner;

public class Q3 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of n: ");
        int n = input.nextInt();
        int i;
        double sum=0;
        for (i=1; i<=n; i++)
        {
            sum= sum+ (1/Math.pow(3, i));
        }
        System.out.println("Sum = "+sum);

       }
       
}
//Sum of 1/3^n series