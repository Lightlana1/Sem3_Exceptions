package Sem3;

// методы ввода информации с консоли пользователем
import java.util.Scanner;

public class User_input {

    public static String userInput(String msg) {
        Scanner scanner = new Scanner(System.in);
        String user_input;


        while (true) {
            System.out.println(msg);
            try {
                user_input = scanner.nextLine();
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }

        }


        return user_input;

    }

    public static int userIntInput(String msg) {
        Scanner scanner = new Scanner(System.in);
        int user_input;


        while (true) {
            System.out.println(msg);
            try {
                user_input = Integer.parseInt(scanner.nextLine());
                break;
            } catch (NumberFormatException e) {
                System.out.println("Неверный ввод!");
            }

        }


        return user_input;

    }

}