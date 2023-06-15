package homework2;


//  2. Если необходимо, исправьте данный код (задание 2 https://docs.google.com/document/d/17EaA1lDxzD5YigQ5OAal60fOFKVoCbEJqooB9XfhT7w/edit)
//try {
//        int d = 0;
//        double catchedRes1 = intArray[8] / d;
//        System.out.println("catchedRes1 = " + catchedRes1);
//        } catch (ArithmeticException e) {
//        System.out.println("Catching exception: " + e);
//        }


public class RefactorArray {
    public static void main(String[] args) {
        int[] intArray = {0, 1, 2, 3, 4, 5, 6, 7, 8, 9};

        int d = 0;
        if (intArray.length - 1 < 8) {
            System.out.println("Unable to execute expression - intArray[8] / d as there is no 8th element in the given array.");
        } else if (d == 0) {
            System.out.println("Unable to execute expression - intArray[8] / d because d = 0 so you can't divide by zero.");
        } else {
            double catchedRes1 = intArray[8] / d;
            System.out.println("intArray[8] / d = " + intArray[8] + " / " + d + " = " + catchedRes1);
        }
    }
}