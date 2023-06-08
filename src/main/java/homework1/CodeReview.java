package homework1;
//Посмотрите на код, и подумайте сколько разных типов исключений вы тут сможете получить?
//public static int sum2d(String[][] arr){ int sum = 0; for (int i = 0; i < arr.length; i++)
//{ for (int j = 0; j < 5; j++) { int val = Integer.parseInt(arr[i][j]); sum += val; } } return sum; }
public class CodeReview {

    public static void main(String[] args) {
//        String[][] array = null;             //NullPointerException: Cannot read the array length because "arr" is null
        String[][] array = {{"1", "2", "three", }, {"2", "4", "8", "9"}};
        System.out.println ( sum2d ( array ) );

    }

    public static int sum2d(String[][] arr) {
        int sum = 0;
        for (int i = 0; i < arr.length; i++) {
            for (int j = 0; j < 5; j++) {                // ArrayIndexOutOfBoundsException: Index 3 out of bounds for length 6
                int val = Integer.parseInt ( arr[i][j] ); // NumberFormatException: For input string: "three"
                sum += val;
            }
        }
        return sum;
    }

}


