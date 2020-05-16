import java.util.Scanner;

public class TestTriangle {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            System.out.print("First side length: ");
            int side1 = sc.nextInt();
            checkValidInput(side1);

            System.out.print("Second side length: ");
            int side2 = sc.nextInt();
            checkValidInput(side2);

            System.out.print("Third side length: ");
            int side3 = sc.nextInt();
            checkValidInput(side3);

            checkValidTriangle(side1, side2, side3);
            System.out.println("Perimeter of triangle = " + (side1 + side2 + side3));

        } catch (IllegalTriangleException e) {
            System.out.println();
        }
    }

    public static void checkValidTriangle(int side1, int side2, int side3) throws IllegalTriangleException {
        if ((side1 + side2 <= side3) || (side1 + side3 <= side2) || (side3 + side2 <= side1))
            throw new IllegalTriangleException(side1, side2, side3);
    }

    public static void checkValidInput(int side) throws IllegalTriangleException {
        if (side <= 0)
            throw new IllegalTriangleException();
    }
}
