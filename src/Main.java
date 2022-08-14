public class Main {
    public static void main(String[] args) {
        //Задача 1.
        int[] array = new int[3];
        array[0] = 1;
        array[1] = 2;
        array[2] = 3;
        double[] array2 = {1.57, 7.654, 9.986};
        long[] array3 = new long[2];
        array3[0] = 1;
        array3[1] = 2;

        // Задача 2.
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i]);
            if (i != array.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array2.length; i++) {
            System.out.print(array2[i]);
            if (i != array2.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int i = 0; i < array3.length; i++) {
            System.out.print(array3[i]);
            if (i != array3.length - 1) {
                System.out.print(", ");
            }
        }
        //Задача 3.
        System.out.println();
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.print(array[i]);
            if (i != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int a = array2.length - 1; a >= 0; a--) {
            System.out.print(array2[a]);
            if (a != 0) {
                System.out.print(", ");
            }
        }
        System.out.println();
        for (int b = array3.length - 1; b >= 0; b--) {
            System.out.print(array3[b]);
            if (b != 0) {
                System.out.print(", ");
            }

        }
        //Задача 4.
        System.out.println();
        int[] array4 = {1, 2, 3};
        for (int i = 0; i < array4.length; i++) {
            if (array4[i] % 2 == 1) {
                array4[i]++;
            }
            System.out.print(array4[i]);
            if (i != array4.length - 1) {
                System.out.print(", ");
            }
        }
    }
}