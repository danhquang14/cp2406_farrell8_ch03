import java.util.Scanner;

public class BookstoreCredit {
    public static void main(String[] args){
        String name;
        Double average;
        Scanner userinput=new Scanner(System.in);
        System.out.print("Enter the student's name:");
        name=userinput.nextLine();
        System.out.print("Enter the average of student:");
        average=userinput.nextDouble();
        calculateMoney(name,average);
    }
    public  static void calculateMoney(String stName,Double stAverage){
        double credit;
        credit=10*stAverage;
        System.out.println("Student "+stName+" with a "+stAverage+" grade point  average receives a $"+credit+" credit");
    }
}
