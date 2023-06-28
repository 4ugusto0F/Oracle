package Oracle_Java.Atvdd5;

import java.util.Scanner;

public class Sinalizador {
    public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {
            System.out.println("Digite o código da cor");
            int c_Cor = input.nextInt();

            String cor = "xox";
            if (c_Cor == 1) {
                cor = "Próximo cor do sinal de trânsito é verde";
            } else if (c_Cor == 2) {
                cor = "Próximo cor do sinal de trânsito é amarelo";
            } else if (c_Cor == 3) {
                cor = "Próximo cor do sinal de trânsito é vermelho";
            } else {
                System.out.println("[COR INVÁLIDA]");
            }

            System.out.println(cor);
        }
    }
}