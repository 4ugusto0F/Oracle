package Oracle_Java.Atvdd8;
import java.util.ArrayList;
import java.util.Scanner;
import javax.swing.JOptionPane;

public class Temporada {
    public static void main(String[] args) {
        
        int jogosPorSemana = 0;

        ArrayList<Time> equipes = new ArrayList<>();

        try (Scanner input = new Scanner(System.in)) {


            while (jogosPorSemana < 3) {

                System.out.println("||] ENCERRAR COM NUMEROS NEGATIVOS [|| \n ||] E NUMEROS ACIMA DE 40 GRAUS [||");
                System.out.print("\n   Qual a temperatura da semana:");

                double temperaturaDaSemana = input.nextDouble();

                if (temperaturaDaSemana < 0 || temperaturaDaSemana > 40) { break; }

                if (temperaturaDaSemana <= 0) { jogosPorSemana++; } 

                else {
                    jogosPorSemana = 0;

                    if (temperaturaDaSemana >= 20) {
                        String equipeA = Time.gerarEquipeAleatoria();
                        String equipeB = Time.gerarEquipeAleatoria();

                        while (equipeA.equals(equipeB)) {
                            equipeB = Time.gerarEquipeAleatoria();
                        }

                        Jogo jogoDeFutebol = new Jogo(equipeA, equipeB, temperaturaDaSemana);
                        equipes.add(jogoDeFutebol.getEquipe1());
                        equipes.add(jogoDeFutebol.getEquipe2());
                    }

                }

            }

        } catch(IllegalArgumentException e){
            String excecao = "Valores digitados inválidos, a temporada está encerrada. ";
            JOptionPane.showMessageDialog(null, excecao);
        }


        ArrayList<Jogo> temporadaAtual = Jogo.getTemporada();
        equipes.sort(Time.ComparadorNomeDasEquipes);

        for (Jogo partida : temporadaAtual) {
            partida.imprimirEstatisticas();
        }

        System.out.println("Estatísticas Gerais das Equipes:");
        Time equipeAtual = null;

        for (Time equipe : equipes) {
            if (equipeAtual == null || !equipe.getNomeDoTime().equals(equipeAtual.getNomeDoTime())) {

                if (equipeAtual != null) {
                    equipeAtual.imprimirEstatisticas();
                }
                equipeAtual = equipe;
            } 
            else {
                equipeAtual.atualizarEstatisticas(equipe.getGolsMarcados(), equipe.getGolsSofridos());
            }
        }
        
        if (equipeAtual != null) {
            equipeAtual.imprimirEstatisticas();
        }

        double temperaturaMaisQuente = 0.0;
        double temperaturaTotal = 0.0;

        for (Jogo partida : temporadaAtual) {
            temperaturaTotal += partida.getTemperatura();
            if (partida.getTemperatura() > temperaturaMaisQuente) {
                temperaturaMaisQuente = partida.getTemperatura();
            }
        }

        double temperaturaMedia = temperaturaTotal / temporadaAtual.size();

        System.out.printf("Temperatura mais quente: %.1f\n", temperaturaMaisQuente);
        System.out.printf("Temperatura média: %.1f\n", temperaturaMedia);

    }


}



