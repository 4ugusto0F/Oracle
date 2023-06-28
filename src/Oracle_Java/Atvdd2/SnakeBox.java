package Oracle_Java.Atvdd2;

import java.util.Scanner;

public class SnakeBox {
    public static void main(String[] args) {

        Scanner inpt = new Scanner (System.in);
        Pacote p1 = new Pacote(inpt);
        p1.vRemetido();
        p1.vLacrado();
        p1.vEnviado();
        inpt.close();
        
    }
}
class Pacote {
    private boolean remetido = false;
    private boolean lacrado = false;
    private boolean enviado = false;
    // instanciando uma classe como propriedade para essa classe depdender das outras classes
    private Caixa caixa;
    private Remetente remetente;

    //construtor
    public Pacote(Scanner inpt){
        caixa = new Caixa(inpt);
        remetente = new Remetente(inpt);
    }
    //Validadores (FUNCIONAM COMO SET COM CONDIÇÃO)
    public void vRemetido() {
        if(caixa.vCaixa() & remetente.vRemetente()){
            this.remetido = true;
            System.out.println("Seu pacote foi remetido com sucesso");
        }
        else{
            System.out.println("A caixa ou o remetente tem alguma propriedade invalida");
        }
    }
    public void vLacrado(){
        if (remetido){
            this.lacrado = true;
            System.out.println("Seu pacote foi lacrado");
        }
        else {
            System.out.println("Seu pacote não foi remetido");
        }
    }
    public void vEnviado() {
        if(lacrado){
            this.enviado = true;
            System.out.println("Seu pacote foi enviado ao remetente");
        }
        else{
            System.out.println("O pacote não esta lacrado");
        }
    }
}
class Caixa {
    
    //Propriedades :
    private double altura, largura, profundidade;
    private int quantidade;

    //construtor
    public Caixa (Scanner inpt){
        System.out.println("[---CAIXA---]");
        System.out.print("ALTURA: "); altura = inpt.nextDouble();
        System.out.print("LARGURA:"); largura = inpt.nextDouble();
        System.out.print("PROFUNDIDADE: "); profundidade = inpt.nextDouble();
        System.out.print("Digite a Quantidade: "); quantidade = inpt.nextInt();
    }
    //informativo
        public void info(){
            System.out.printf("  ALTURA--[%.2f]  \n  LARGURA--[%.2f]  \n  PROFUNDIDADE--[%.2f]  \n  QUANTIDADE--[%d]  ",altura,largura,profundidade,quantidade);
    }
    //metodos set
    public void setQuantidade(Scanner inpt) { this.quantidade = inpt.nextInt(); }
    public void setProfundidade(Scanner inpt) { this.profundidade = inpt.nextDouble(); }
    public void setLargura(Scanner inpt) { this.largura = inpt.nextDouble(); }
    public void setAltura(Scanner inpt) { this.altura = inpt.nextDouble(); }

    //metodos get
    public double getAltura(){ return altura; }
    public double getLargura(){ return largura; }
    public double getProfundidade(){ return profundidade; }
    public Integer getQuantidade(){ return quantidade; }
    public Boolean vCaixa() {
        if(altura != 0 & largura != 0 & profundidade != 0 & quantidade != 0){
            return true;
        }
        else{
            return false;
        }
    }
}
class Remetente{

    //propriedades
    private String nome, sobrenome;
    private String cpf;
    private String endereco;

    //construtor
    public Remetente(Scanner inpt){
        System.out.println("[---REMETENTE---]");
        System.out.print("Nome: "); this.nome = inpt.nextLine();
        System.out.print("Sobrenome: "); this.sobrenome = inpt.nextLine();
        System.out.print("CPF: "); this.cpf = inpt.nextLine();
        System.out.print("Endereço: "); this.endereco = inpt.nextLine();
    }
    //informativo
    public void info() {
        System.out.printf("NOME [%s %s] \nCPF: [%s] \nENDEREÇO: [%s]",nome, sobrenome,cpf,endereco);
    }

    //metodos set
    public void setNome (Scanner inpt){ this.nome = inpt.nextLine(); }
    public void setSobrenome (Scanner inpt){ this.sobrenome = inpt.nextLine(); }
    public void setCpf(Scanner inpt) { this.cpf = inpt.nextLine(); }
    public void setEndereco(Scanner inpt) {this.endereco = inpt.nextLine(); }
    
    //metodos get
    public String getNome(){ return nome;}
    public String getSobrenome(){ return sobrenome;}
    public String getCpf(){ return cpf;}  
    public String getEndereco(){ return endereco;}
    public Boolean vRemetente(){
        if(nome != null & sobrenome != null & cpf != null & endereco != null){
            return true;
        }
        else{
            return false;
        }
    }
}