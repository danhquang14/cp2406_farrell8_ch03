public class Percentages {

        public static void main(String[] args){
        double firstNum=2;
        double secondNum=5;
        computePercent(firstNum,secondNum);
        computePercent(secondNum,firstNum);
    }
        public static void  computePercent(double num1,double num2){
        double percentage;
        percentage=(num1/num2)*100;
        System.out.println(num1+" is " +percentage+" percent of "+ num2 );

    }
}
