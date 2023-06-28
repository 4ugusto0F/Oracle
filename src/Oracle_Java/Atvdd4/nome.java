package Oracle_Java.Atvdd4;

import java.util.Scanner;

public class nome {

        public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Digite seu nome e sobrenome: ");
        String nomeCompleto = input.nextLine();
        input.close();

        String[] nomes = nomeCompleto.split(" ");
        String nome = nomes[0];
        String sobrenome = nomes[1];

        String nomeFormatado = String.format("%s, %s.", sobrenome, nome.charAt(0));

        System.out.printf("Seu nome é: %s \n", nomeFormatado);
        
    }
}
