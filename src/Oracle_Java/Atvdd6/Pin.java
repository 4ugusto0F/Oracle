package Oracle_Java.Atvdd6;

import java.util.Scanner;

public class Pin {
        public static void main(String[] args) {

            Scanner input = new Scanner (System.in);

            System.out.println("Insira o PIN cadastrado: ");
            int PIN = input.nextInt();

            while( PIN != 8888){
                System.out.println("[PIN INVÁLIDO]. Tente novamente");
                PIN = input.nextInt();
            }
            System.out.println("[PIN VÁLIDO], Seja Bem Vindo.");
    
            input.close();
        
    }
}
