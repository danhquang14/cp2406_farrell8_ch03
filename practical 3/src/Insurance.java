import java.util.Scanner;

public class Insurance {
    public static void main(String[] args) {
        int userAge,decade,premium;
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter your age:");
        userAge = userinput.nextInt();
        decade=userAge/10;
        premium=(decade+15)*20;
        System.out.println("User now are in "+userAge+" years old would pay $"+premium);
    }
}
