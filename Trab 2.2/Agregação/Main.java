class Jogador {
    String nome;

    Jogador(String nome) {
        this.nome = nome;
    }
}

class Time {
    String nome;
    Jogador jogador; // O Time tem um Jogador, mas ele pode existir sem o Time (agregação)

    Time(String nome, Jogador jogador) {
        this.nome = nome;
        this.jogador = jogador;
    }
}

public class Main {
    public static void main(String[] args) {
        Jogador jogador = new Jogador("Neymar");
        Time time = new Time("PSG", jogador);
        System.out.println("Time: " + time.nome + ", Jogador: " + time.jogador.nome);
    }
}
