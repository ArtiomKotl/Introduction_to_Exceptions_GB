package homework2;
//  Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
//  Пользователю должно показаться сообщение, что пустые строки вводить нельзя.


import java.util.Scanner;

public class NullStrException {
    public static void main(String[] args) throws Exception {
        Scanner console = new Scanner(System.in);
        System.out.println ("Please enter a line ");
        String str = console.nextLine();
        if ("".equals(str)) {
            throw new Exception("Empty string has been input. Empty lines cannot be entered.");
        } else {
            System.out.println("You entered - " + str);
        }
    }
}

