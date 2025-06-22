import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int age = 0;
        int MINIMUM_AGE = 21;
        System.out.print("Enter your age: ");
        age = in.nextInt();
        in.nextLine();

        if (age >= MINIMUM_AGE) {
            System.out.println("Your age is " + age + ", so you get a wristband. ");
        }
    }
}
