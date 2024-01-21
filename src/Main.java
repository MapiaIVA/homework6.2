public class Main {
    public static void main(String[] args) {
        int[] intArray = {1, 2, 3, 4, 5};
        String[] stringArray = {"apple", "banana", "cherry"};
        int[][] int2DArray = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        float[][] float2DArray = {{1.1f, 2.2f, 3.3f}, {4.4f, 5.5f, 6.6f}};

        printArray(intArray);
        printArray(stringArray);
        printArray(int2DArray);
        printArray(float2DArray);
    }

    public static void printArray(int[] array) {
        for (int value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(String[] array) {
        for (String value : array) {
            System.out.print(value + " ");
        }
        System.out.println();
    }

    public static void printArray(int[][] array) {
        for (int[] row : array) {
            for (int value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }

    public static void printArray(float[][] array) {
        for (float[] row : array) {
            for (float value : row) {
                System.out.print(value + " ");
            }
            System.out.println();
        }
    }
}