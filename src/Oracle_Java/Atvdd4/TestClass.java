package Oracle_Java.Atvdd4;

public class TestClass {
        public static void main(String[] args) {

        ComputeMethods computeMethods = new ComputeMethods();

        //Convertendo temperatura
        double tEmF = 94.5;
        double tEmC = computeMethods.f_Para_C(tEmF);
        System.out.println("Temperatura em Celsius é " + tEmC);
        
        //Calculando Hipotenusa
        double catetoA = 8.5;
        double catetoB = 8.5;
        double hipotenusa = computeMethods.hipotenusa(catetoA, catetoB);
        System.out.println("Hipotenusa é " + hipotenusa);
        
        int somaDosDados = computeMethods.r2Dados();
        System.out.println("A soma dos valores dos dados é " + somaDosDados);
    }

}
