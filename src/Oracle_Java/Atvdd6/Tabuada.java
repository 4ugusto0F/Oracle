package Oracle_Java.Atvdd6;

import java.util.Scanner;

public class Tabuada {

    public static void main(String[] args) {
        try (Scanner inpt = new Scanner(System.in)) {

            System.out.print(" ]-----TABUADA------[ \n Digite um numéro: ");
            int n = inpt.nextInt();

            for (int c = 1 ; c <= 12 ;c++) {
                int r = n * c;
                System.out.println(" ]------ "+n+" x "+c+" = "+r+" ------[");               
            }
        }
    }
}
