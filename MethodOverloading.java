public class MethodOverloading {
    public static void main(String[] args) {
        sumOfTwoNumber();
        sumOfTwoNumber(10,20);
    }

    public static void sumOfTwoNumber(int a, int b) {
        int sum = a + b;
        System.err.println("Sum of two Number " +sum);
    }

    public static void sumOfTwoNumber() {
        int a = 30;
        int b = 40;
        int sum = a + b;
        System.err.println("Sum of two Number " +sum);
    }
}
