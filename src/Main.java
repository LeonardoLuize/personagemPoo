import Personagem.*;

public class Main {
    public static void main(String[] args) {

        Batman bat = new Batman(1);
        Coringa coring = new Coringa(2);
        Pinguim ping = new Pinguim(2);

        JamesBond james = new JamesBond (1);
        DrNo dr = new DrNo (2);
        Goldfinger gold = new Goldfinger(2);

        bat.atirar(); // chamada de método do Bataman
        bat.correr(20, 30); // chamada de método herdado
        bat.camuflar(2); // chamada de método do Bataman
        bat.saltar(20); // chamada de método herdado
        System.out.println("\n----------------------");

        coring.correr(20, 30);
        coring.atirar();
        coring.saltar(5);
        System.out.println("\n----------------------");

        ping.correr(20, 30);
        ping.atirar();
        ping.saltar(4);
        System.out.println("\n----------------------");

        james.atirar();
        james.correr(20, 30);
        james.saltar(5);
        System.out.println("\n----------------------");

        dr.correr(20, 30);
        dr.atirar();
        dr.saltar(3);
        System.out.println("\n----------------------");

        gold.personificar(james);
        gold.camuflar(1);
        gold.correr(20, 30);
        gold.atirar();
        gold.saltar(2);
    }
}
