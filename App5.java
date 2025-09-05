import java.util.Scanner;

public class App5 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter n:- ");
        int n = sc.nextInt();

        System.out.println("Using for-loop");
        int sum = 0;
        for (int i = 1; i <= n; i++)
            sum += i;
        System.out.println(sum);
        System.err.println();

        sum = 0;
        System.out.println("Using while-loop");
        int i = 1;
        while (i <= n) {
            sum += i;
            i++;
        }
        System.out.println(sum);
        System.err.println();

        sum = 0;
        System.out.println("Using do-while-loop");
        int j = 1;
        do {
            sum += j;
            j++;
        } while (j <= n);
        System.out.println(sum);
        System.err.println();

        sc.close();

    }

}
