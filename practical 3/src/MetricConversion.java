import java.util.Scanner;

public class MetricConversion {

        public static void main(String[] args) {
        Double inch;
        Double gallon;
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter the number of inch:");
        inch = userinput.nextDouble();
        conversionCentimeter(inch);
        System.out.print("Enter the number of gallon:");
        gallon = userinput.nextDouble();
        conversionLitter(gallon);
    }
        public static void conversionCentimeter(Double inch){
        final double mul=2.54;
        double centimeter;
        centimeter=mul*inch;
        System.out.println("There are 2.54 centimeter in an inch so in "+inch+" inch have "+centimeter+" centimeters");
    }
        public static void conversionLitter(Double gallon){
        final double mul2=3.7854;
        double litter;
        litter=mul2*gallon;
        System.out.println("There are 3,7854 centimeter in an US gallon so in "+gallon+" gallon have "+litter+" litter");
    }
}
