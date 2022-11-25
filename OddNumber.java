import java.util.Scanner;

public class OddNumber
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter your 2 integers: ");
        int firstInteger = input.nextInt();
        int secondInteger = input.nextInt();
        int i;
        System.out.print("All odd numbers between "+firstInteger+" & "+secondInteger+" : ");
        for (i=firstInteger; i<=secondInteger; i++)
        {
            if (i%2 != 0)
            {
                System.out.print(i+" ");
            }
        }
    }
}
