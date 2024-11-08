package zoo;

public class Gorila extends Animal {

    private double IMC;

    public Gorila(double peso, double altura) {
        super(peso, altura);
    }

    public double getIMC() {
        IMC = peso / Math.pow(altura, 2);
        return IMC;
    }

    public void setIMC(double IMC) {
        this.IMC = IMC;
    }

}
