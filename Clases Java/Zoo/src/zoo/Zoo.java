package zoo;

public class Zoo {

    public static void main(String[] args) {
        //Creamos el objeto gorila y le asignamos peso y altura
        Gorila gorila = new Gorila(160, 1.7);
        //creamos los objetos alimentos con su peso
        Alimento banana = new Alimento(90);
        Alimento raices = new Alimento(120);
        Alimento platano = new Alimento(69);

        //creamos una lista de la clase alimento donde se guardan los objetos
        Alimento alimentos[] = new Alimento[3];
        alimentos[0] = banana;
        alimentos[1] = raices;
        alimentos[2] = platano;
        // le cambiamos el valor al array de la clase Alimento
        gorila.setAlimentosIngeridos(alimentos);

        // imprimimos el peso del objeto
        System.out.println(gorila.getPeso());
        // imprimimos el total de los alimentos ingeridos en gramos
        System.out.println(gorila.getAlimentosIngeridos());
        //imprimimos el IMC del objeto gorila
        System.out.println(Math.round(gorila.getIMC()));
    }

}
