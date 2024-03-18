package plantas;

public class Plantas {
    public static void main(String[] args) {
        Arbol arbol = new Arbol();
        Arbusto arbusto = new Arbusto();
        Flor flor = new Flor();

        arbol.decirLoQueSoy();
        arbusto.decirLoQueSoy();
        flor.decirLoQueSoy();
    }
}
