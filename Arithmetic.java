import java.util.Scanner;

public class Arithmetic {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.println("Enter the base of the triangle:");
        int base = scanner.nextInt();
        
        System.out.println("Enter the height of the triangle:");
        int height = scanner.nextInt();
        
        int triangleArea = calculateTriangleArea(base, height);
        System.out.println("Area of the triangle: " + triangleArea);

        
        System.out.println("Enter the side length of the square:");
        int sideLength = scanner.nextInt();
        
        int squareArea = calculateSquareArea(sideLength);
        System.out.println("Area of the square: " + squareArea);

        scanner.close();
    }

    public static int calculateTriangleArea(int  base, int height) {
        return (1/2) * base * height;
    }

    public static int calculateSquareArea(int sideLength) {
        return sideLength * sideLength;
    }
}
