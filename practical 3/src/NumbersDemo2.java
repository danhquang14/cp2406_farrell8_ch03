import java.util.Scanner;

public class NumbersDemo2 {

    public static void main(String[] args)
    {
        int num1;
        int num2;
        Scanner userinput=new Scanner(System.in);
        System.out.println("Enter the number 1:");
        num1=userinput.nextInt();
        System.out.println("Enter the number 2:");
        num2=userinput.nextInt();
        displayTwiceTheNumber(num1,num2);
        displayNumberPlusFive(num1,num2);
        displayNumberSquared(num1,num2);
    }
    public static void displayTwiceTheNumber(int num1,int num2)
    {
        num1=num1*2;
        num2=num2*2;
        System.out.println("Twice number are:"+num1+"and"+num2);
    }
    public static void displayNumberPlusFive(int num1,int num2)
    {
        num1=num1+5;
        num2=num2+5;
        System.out.println("The result are:"+num1+"and"+num2);
    }
    public static void displayNumberSquared(int num1,int num2)
    {
        double num1sqrt;
        double num2sqrt;
        num1sqrt=Math.sqrt(num1);
        num2sqrt=Math.sqrt(num2);
        System.out.println("The squared of number are:"+num1sqrt+"and"+num2sqrt);

    }
}
