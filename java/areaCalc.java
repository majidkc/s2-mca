import java.util.Scanner;
public class areaCalc {
    public double calculateArea(double sideLength){
        return sideLength * sideLength;
    }
    public double calculateArea(double length, double width){
        return length * width;
    }
    public double calculateArea(float radius){
        return Math.PI * radius * radius;
    }
    public double calculateArea(double a, double b, double c){
        double s = (a + b + c) / 2;
        return Math.sqrt(s * (s - a) * (s - b) * (s - c));
    }


    public static void main(String[] args) {
        areaCalc calculator = new areaCalc();
        System.out.println("Enter the length");
        Scanner sc = new Scanner(System.in);
        double sideLength = sc.nextDouble();
        double squareArea = calculator.calculateArea(sideLength);
        System.out.println("Area of square :" + squareArea); 

       
        System.out.println("Enter the length and width");
        double length = sc.nextDouble();
        double width = sc.nextDouble();
        double rectangleArea = calculator.calculateArea(length, width);
        System.out.println("Area of square :" + rectangleArea); 


        System.out.println("Enter the length and width");
        double radius = sc.nextFloat();
        double circleArea = calculator.calculateArea(radius);
        System.out.println("Area of square :" + circleArea); 


        System.out.println("Enter the length and width");
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        double c = sc.nextDouble();
        double triangleArea = calculator.calculateArea(a, b, c);
        System.out.println("Area of square :" + triangleArea); 

    }
}
