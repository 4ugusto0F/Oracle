package Oracle_Java.Atvdd3;

import javax.swing.JOptionPane;

public class H_Interativa {
    public static void main(String[] args) {

        String km = JOptionPane.showInputDialog("???-  Olá! Sou um viajante e estou perdido. Quantos km para Salvador?");

        Distancia d = new Distancia();
        int f_Santana = d.localizacao(Integer.parseInt(km));

        JOptionPane.showMessageDialog(null,"[ESTRANHO]-  Se eu estou a " + km +"KM de Salvador e para lá e o norte então estou á "+f_Santana+"KM de Feira de Santana");
        String nome = JOptionPane.showInputDialog("[ESTRANHO]-  Desculpa, acabei me esquecendo de você qual o seu nome afinal ?");
        JOptionPane.showMessageDialog(null,"[ESTRANHO]-  Prazer em conhece-lo "+nome+" me chamo Alex e viajo perante o tem..., Enfim preciso de um transporte Sr(a)."+nome);
        String trocados = JOptionPane.showInputDialog("["+nome+"]-  Olha Sr. Alex estou de bicicleta e ainda por cima com bagagem, mas tenho uns trocados, deixa eu ver eu tenho___");     
        String valor = JOptionPane.showInputDialog("[Alex]-  Muito obrigado, pelos "+trocados+"Reais, mas quanto custa uma passagem ?");
        Passagem p = new Passagem();
        double restante = p.preco(Double.parseDouble(trocados),Double.parseDouble(valor));
        String veiculo = JOptionPane.showInputDialog("["+nome+"]- Vejamos "+restante+"Reais, a proposito o veiculo que eu irei mandar será um___" );
        JOptionPane.showMessageDialog(null,"[Alex]-  Já estava pensando em como iria encontrar um veiculo mesmo, agora preciso que me diga as informações do "+veiculo+" para eu ter certeza que foi você, ok?");
       
        String[] informacoes = {"cor", "Quantidade de Portas", "Quantidade de Assentos", "É barulhento", "É veloz"};
        String[] propriedades = new String[informacoes.length];

        propriedades[0] = JOptionPane.showInputDialog(informacoes[0] + "?");
        propriedades[1] = JOptionPane.showInputDialog(informacoes[1] + "?");
        propriedades[2] = JOptionPane.showInputDialog(informacoes[2] + "?");
        propriedades[3] = JOptionPane.showInputDialog(informacoes[3] + "?");
        propriedades[4] = JOptionPane.showInputDialog(informacoes[4] + "?");
       
        JOptionPane.showMessageDialog(null,"[Alex]- Muito obrigado ja anotei tudo aqui, até breve majestade, quer dizer "+nome);
    }
}
 