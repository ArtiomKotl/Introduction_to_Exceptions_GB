package homework1;
//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//и возвращающий новый массив, каждый элемент которого равен частному элементов двух входящих массивов в той же ячейке.
//Если длины массивов не равны, необходимо как-то оповестить пользователя.
//Важно: При выполнении метода единственное исключение, которое пользователь может увидеть - RuntimeException, т.е. ваше

import java.util.Arrays;

public class DivisionOfTwoArrays {
    static String exceptionString = "An exception occurred.";

    public static int[] divisionOfTwoArrays(int[] arrayA, int[] arrayB) {
        if (arrayA == null || arrayB == null) {
            System.out.println(exceptionString  + "  One of the arrays is null.");
            return null;
        }

        if (arrayA.length != arrayB.length) {
            System.out.println(exceptionString  + "  The length of one array is not equal to length of another array.");
            return null;
        }

        int[] arrayResult = new int[arrayA.length];
        for (int i = 0; i < arrayA.length; i++) {
            if (arrayB[i] == 0) {
                System.out.println( exceptionString  + "  At least one of the divisors is equal to zero.");
                return null;
            }
            arrayResult[i] = arrayA[i] / arrayB[i];
        }
        return arrayResult;
    }

    public static void printResultOfDivisionOfTwoArrays(int[] arrayA, int[] arrayB) {

        if (divisionOfTwoArrays ( arrayA, arrayB ) != null){
            System.out.println ( Arrays.toString ( arrayA ) + " / " + Arrays.toString ( arrayB ) + " = "
                    + Arrays.toString ( divisionOfTwoArrays ( arrayA, arrayB ) ) );
        }

    }
    public static void main(String[] args) {


        int[] arrayA = {0, 1, 2};
        int[] arrayB = {1, 2, 3};
        int[] arrayC = {0, 1, 2, 3, 4};
        int[] arrayD = {0, 0, 0};
        int[] arrayE = null;

        printResultOfDivisionOfTwoArrays(arrayA, arrayB);
        printResultOfDivisionOfTwoArrays(arrayA, arrayC);
        printResultOfDivisionOfTwoArrays(arrayA, arrayD);
        printResultOfDivisionOfTwoArrays(arrayA, arrayE);
    }
}