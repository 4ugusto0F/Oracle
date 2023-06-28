package Oracle_Java.Atvdd6;

public class Art {
        public static void main(String[] args) {

        int larguraR = 5;
        int alturaR = 4;

        System.out.println("Retângulo:");
        createRectangle(larguraR, alturaR);

        int tamanhoT = 5;

        System.out.println("\nTriângulo:");
        createTriangle(tamanhoT);

    }

    public static void createRectangle(int largura, int altura) {
        if (largura < 1 || altura < 1) {
            System.out.println("As dimensões devem ser maiores ou iguais a 1.");
            return;
        }

        for (int c = 0; c < altura; c++) {
            for (int c2 = 0; c2 < largura; c2++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }

    public static void createTriangle(int tamanho) {
        if (tamanho < 1) {
            System.out.println("A dimensão do triângulo deve ser maior ou igual a 1.");
            return;
        }

        for (int c = 0; c < tamanho; c++) {
            for (int c2 = 0; c2 <= c; c2++) {
                System.out.print("#");
            }
            System.out.println();
        }
    }
}
