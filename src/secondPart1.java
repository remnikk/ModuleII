
public class secondPart1 {
    public static void main(String[] args) {
        int[] intArray = {3, 18, 54, 93, 27, 125, 37, 243, 81};
        double[] doubleArray = {19.18, 11.53, 17.69, 19.71, 128.53, 211.69, 54.27, 69.73, 274.21, 513.23};
        System.out.println("Sum of arrays: int " + sum(intArray) + ", double " + sum(doubleArray));
        System.out.println("Min of arrays: int " + min(intArray) + ", double " + min(doubleArray));
        System.out.println("Max of arrays: int " + max(intArray) + ", double " + max(doubleArray));
        System.out.println("MaxPositive of arrays: int " + maxPositive(intArray) + ", double " + maxPositive(doubleArray));
        System.out.println("Multuplication of arrays: int " + multiplication(intArray) + ", double " + multiplication(doubleArray));
        System.out.println("Modulus of arrays: int " + modulus(intArray) + ", double " + modulus(doubleArray));
        System.out.println("SecondLargest of arrays: int " + secondLargest(intArray) + ", double " + secondLargest(doubleArray));
    }

    //int

    static private int sum(int[] array) {
        int sum = array[0];
        for (int item : array) sum += item;
        return sum;
    }

    static private int min(int[] array) {

        int min = array[0];

        for (int i = 1; i < array.length; i++) if (min > array[i]) min = array[i];

        return min;

    }

    static private int max(int array[]) {

        int max = array[0];

        for (int i = 1; i < array.length; i++) if (max < array[i]) max = array[i];

        return max;

    }

    static private int maxPositive(int[] array) {

        int maxPositive = array[0];

        for (int i = 1; i < array.length; i++) if (maxPositive < array[i] && array[i] > 0) maxPositive = array[i];

        return maxPositive;

    }

    static private long multiplication(int[] array) {

        long multiplication = 1;

        for (int item : array) multiplication *= item;

        return multiplication;

    }

    static private int modulus(int[] array) {

        int modulus = array[0];

        modulus %= array.length - 1;

        return modulus;

    }

    static private int secondLargest(int[] array) {

        int k = max(array);

        int secondLargest = array[0];

        for (int i = 1; i < array.length; i++) if (secondLargest < array[i] && array[i] < k) secondLargest = array[i];

        return secondLargest;

    }

    //double

    static private double sum(double[] array) {

        double sum = 0;

        for (double item : array) sum += item;

        return sum;

    }

    static private double min(double[] array) {

        double min = array[0];

        for (int i = 1; i < array.length; i++) if (min > array[i]) min = array[i];

        return min;

    }

    static private double max(double[] array) {

        double max = array[0];

        for (short i = 1; i < array.length; i++) if (max < array[i]) max = array[i];

        return max;

    }

    static private double maxPositive(double[] array) {

        double maxPositive = array[0];

        for (short i = 1; i < array.length; i++) if (maxPositive < array[i] && array[i] > 0) maxPositive = array[i];

        return maxPositive;

    }

    static private double multiplication(double[] array) {

        double multiplication = 1;

        for (double item : array) multiplication *= item;

        return multiplication;

    }

    static private double modulus(double[] array) {

        double modulus = array[0];

        modulus %= array.length - 1;

        return modulus;

    }

    static private double secondLargest(double[] array) {

        double x = max(array);

        double secondLargest = array[0];

        for (short i = 1; i < array.length;i++) if (secondLargest < array[i] && array[i] < x) secondLargest = array[i];

        return secondLargest;

    }
}