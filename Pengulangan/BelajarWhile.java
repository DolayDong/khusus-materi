package Pengulangan;

import java.util.Scanner;

public class BelajarWhile {

    public static void main(String[] args) {
        boolean lapar = true;

        while (lapar) {
            System.out.println("Makan");
            System.out.print("Apakah kenyang? [y/n]");
            Scanner scan = new Scanner(System.in);
            String answer = scanner.nextLine();
            switch (answer) {
            case "y":
                lapar = false;
                break;
            default:
                lapar = true;
                break;
            }
        }
    }

}