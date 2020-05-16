public class IllegalTriangleException extends Exception {
    public IllegalTriangleException(int side1, int side2, int side3) {
        System.out.println("Not a real triangle:" + " side1 = " + side1 + ", side2 = " + side2 + ", side3 = " + side3);
    }

    public IllegalTriangleException() {
        System.out.println("Side's length must be an integer bigger than 0");
    }
}

