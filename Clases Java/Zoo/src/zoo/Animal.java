package zoo;

public class Animal {

    protected double peso, altura;
    protected Alimento alimentosIngeridos[];

    public Animal(double peso, double altura) {
        this.peso = peso;
        this.altura = altura;
    }

    public double getPeso() {
        return peso;
    }

    public void setPeso(double peso) {
        this.peso = peso;
    }

    public double getAltura() {
        return altura;
    }

    public double getAlimentosIngeridos() {
        double totalKil = 0;
        //recorremos el array de la clase Alimento
        for (int i = 0; i < alimentosIngeridos.length; i++) {
            //se obtiene el valor de cada objeto alimento en el array
            double n = alimentosIngeridos[i].getPeso();
            totalKil += n;
        }
        //convertimos los kilos a gramos
        double totalAl = totalKil * 1000;
        return totalAl;
    }

    public void setAlimentosIngeridos(Alimento[] alimentosIngeridos) {
        this.alimentosIngeridos = alimentosIngeridos;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

}
