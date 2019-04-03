import java.util.Scanner;

public class Percentages2 {
    public static void main(String[] args){
        double firstNum;
        double secondNum;
        Scanner userinput=new Scanner(System.in);
        System.out.print("Enter the first number:");
        firstNum=userinput.nextDouble();
        System.out.print("Enter the second number");
        secondNum=userinput.nextDouble();
        computePercent(firstNum,secondNum);
        computePercent(secondNum,firstNum);
    }
    public static void  computePercent(double num1,double num2){
        double percentage;
        percentage=(num1/num2)*100;
        System.out.println(num1+" is " +percentage+" percent of "+ num2 );

    }
}
