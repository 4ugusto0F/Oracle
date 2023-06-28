package Oracle_Java.Atvdd4;

public class ComputeMethods {

    public double f_Para_C(double grausFahrenheit) {

        double grausCelsius = 5.0 / 9.0 * (grausFahrenheit - 32);
        return grausCelsius;

    }
    
    public double hipotenusa(Double a, Double b) {

        double hipotenusa = (a * a) + (b * b);
        hipotenusa = Math.sqrt(hipotenusa);
        return hipotenusa;
    }
    
    public int r2Dados() {
        int dado1 = (int) (Math.random() * 6) + 1;
        int dado2 = (int) (Math.random() * 6) + 1;
        int soma = dado1 + dado2;
        return soma;
    }
}