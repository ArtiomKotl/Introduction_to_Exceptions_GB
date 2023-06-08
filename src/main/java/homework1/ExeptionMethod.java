package homework1;
//Реализуйте 3 метода, чтобы в каждом из них получить разные исключения



public class ExeptionMethod {
    public static void main(String[] args) {
//ArithmeticException

        int result;
        result = divisionByZero(5,0);

//ArrayIndexOutOfBoundsException

        int[] array = new int[10];
        recordNumberInArray(array, 100, 1);

//NullPointerException

        String str = null;
        printStringLength(str);

    }
    //ArithmeticException
    public static int divisionByZero(int a, int b) {
        return a / b;
    }

    //ArrayIndexOutOfBoundsException
    public static int[] recordNumberInArray(int[] array, int index, int number) {
        array[index] = number;
        return array;
    }
    //NullPointerException
    public static int printStringLength(String str) {
        return str.length();
    }



}


