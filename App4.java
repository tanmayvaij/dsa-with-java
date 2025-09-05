import java.util.Scanner;

public class App4 {
    
    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter a code:- ");

        switch (sc.nextInt()) {
            case 1:
                System.out.println("Chalo");
                break;
            case 2:
                System.out.println("Khalo");
                break;
            default:
                System.out.println("invalid input");
                break;
        }

        sc.close();

    }

}
