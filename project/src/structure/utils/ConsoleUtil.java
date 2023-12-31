package structure.utils;


import java.util.Scanner;

public class ConsoleUtil {
    public static int getInputNumberValue(Scanner scanner, String message, String error) {

        while (true) {
            System.out.println(message);
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.println(error);
            }
        }
    }
    public static String getInputName(Scanner scanner){
        System.out.println("Введіть ім'я пасажира: ");
        return  scanner.nextLine().toUpperCase().trim();
    }

    public static String getInputSurname(Scanner scanner){
        System.out.println("Введіть прізвище пасажира: ");
        return scanner.nextLine().toUpperCase().trim();
    }

}
