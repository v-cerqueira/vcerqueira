class Processador {
    String modelo;

    Processador(String modelo) {
        this.modelo = modelo;
    }
}

class Computador {
    String marca;
    Processador processador;

    Computador(String marca, String modeloProcessador) {
        this.marca = marca;
        this.processador = new Processador(modeloProcessador);
    }
}

public class Main {
    public static void main(String[] args) {
        Computador pc = new Computador("Dell", "Intel i7");
        System.out.println("Computador: " + pc.marca + ", Processador: " + pc.processador.modelo);
    }
}
