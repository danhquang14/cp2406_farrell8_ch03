import java.util.Scanner;

public class CraftPricing {
    public static void main(String[] args){
        String productName;
        double materialPrice;
        int hoursRequired;
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter the name of product:");
        productName = userinput.nextLine();
        System.out.print("Enter the price of material:");
        materialPrice = userinput.nextDouble();
        System.out.print("Enter the number of hours required:");
        hoursRequired = userinput.nextInt();
        System.out.println("The retail price is: $"+computePrice(materialPrice,hoursRequired));
    }
    public static double computePrice(double materialCost,int hours)
    {
        double retailPrice;
        retailPrice=(materialCost+12)*hours+7;
        return retailPrice;
    }
}
