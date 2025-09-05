import java.util.Scanner;

public class App2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a message:- ");
        String msg = sc.nextLine();

        System.out.println("Enter a number:- ");
        int a = sc.nextInt();

        System.out.println("Enter another number:- ");
        int b = sc.nextInt();

        int sum = a + b;

        System.out.println(msg + " " + sum);

        sc.close();

    }

}
