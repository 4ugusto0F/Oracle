package Oracle_Java.Atvdd5;

import java.util.Scanner;

public class Sinalizador_S {
    public static void main(String[] args) {
        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Digite o código da cor");
            int c_Cor = input.nextInt();

            String cor;
            switch (c_Cor) {
                case 1:
                    cor = "Próximo cor do sinal de trânsito é verde";
                    break;
                case 2:
                    cor = "Próximo cor do sinal de trânsito é amarelo";
                    break;
                case 3:
                    cor = "Próximo cor do sinal de trânsito é vermelho";
                    break;
                default:
                    cor = "[COR INVÁLIDA]";
                    break;
            }

            System.out.println(cor);

        }
    }
}
