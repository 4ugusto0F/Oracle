package Oracle_Java.Atvdd5;

import java.util.Scanner;

public class C_Onda {
        public static void main(String[] args) {

        try (Scanner input = new Scanner(System.in)) {

            System.out.println("Digite o valor do comprimento da onda: ");
            int comprimentoDaOnda = input.nextInt();
            
            if(comprimentoDaOnda <= 379){
                System.out.println("A cor e ULTRAVIOLETA [Não e visivel]");
            }
            else if(comprimentoDaOnda >= 380 && comprimentoDaOnda < 450){
                System.out.println("A cor é Violeta");
            }
            else if(comprimentoDaOnda >= 450 && comprimentoDaOnda < 495){
                System.out.println("A cor é Azul");
            }
            else if(comprimentoDaOnda >= 495 && comprimentoDaOnda < 570){
                System.out.println("A cor é Verde");
            }
            else if(comprimentoDaOnda >= 570 && comprimentoDaOnda < 590){
                System.out.println("A cor é Amarela");
            }
            else if(comprimentoDaOnda >= 590 && comprimentoDaOnda < 620){
                System.out.println("A cor é Laranja");
            }
            else if(comprimentoDaOnda >= 620 && comprimentoDaOnda < 750){
                System.out.println("A cor é Vermelha");
            }
            else if(comprimentoDaOnda >= 750 ){
                System.out.println("A cor e INFRAVERMELHO [Não e visivel]");
            }
            else{
                System.out.println("Entrada de valor incorreta. Tente novamente");
            }

        }
    }
}