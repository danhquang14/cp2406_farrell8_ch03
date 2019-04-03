import java.util.Scanner;

public class PaintCalculator {
    public static void main(String[] args) {
        int roomLenght;
        int roomWidth;
        int roomHeight;
        int wallArea;
        double paintGallon;
        double totalMoney;
        Scanner userinput = new Scanner(System.in);
        System.out.print("Enter the number of lenght:");
        roomLenght = userinput.nextInt();
        System.out.print("Enter the number of width:");
        roomWidth = userinput.nextInt();
        System.out.print("Enter the number of height:");
        roomHeight = userinput.nextInt();
        wallArea=calculateArea(roomLenght, roomWidth, roomHeight);
        paintGallon=calculateGallon(wallArea);
        totalMoney=paintGallon*32;
        System.out.println("The room with "+roomLenght+" lenght, "+roomWidth+" width, "+roomHeight+" height will ceiling" +
                "is $"+totalMoney);
    }

    public static int calculateArea(int lenght, int width, int height) {
        int area;
        area = lenght * width * height;
        return area;
    }
    public static double calculateGallon(int area){
        double gallon;
        gallon=area/350;
        return gallon;
    }
}
