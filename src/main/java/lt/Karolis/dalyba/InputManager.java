package lt.Karolis.dalyba;

import java.util.InputMismatchException;
import java.util.Scanner;

public class InputManager {

    private static int insertDigit(String skaiciausSeka) {

        Scanner sc = new Scanner(System.in);
        int enterNumber = 0;
        boolean arIvestasSveikasSkaicius = false;

        do {
            try {
                System.out.println("Iveskite " + skaiciausSeka + " skaiciu");
                enterNumber = sc.nextInt();
                arIvestasSveikasSkaicius = true;
            } catch (InputMismatchException e) {
                System.out.println("Klaida! Galima ivesti tik sveika skaiciu");
            } catch (Exception e) {
                System.out.println("Klaida nezinoma");
            } finally {
                sc.nextLine();
            }
        } while (!arIvestasSveikasSkaicius);
        return enterNumber;
    }

    public static String[] askForInput() {
        Integer firstNumber = insertDigit("Pirma");
        int secondNumber = insertDigit("Antra");

        return new String[]{
                firstNumber.toString(),
                String.valueOf(secondNumber)
        };
    }
}
