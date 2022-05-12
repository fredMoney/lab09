package state;

public class Main {
    public static void main(String[] args) {
        ComandaMancare comandaMancare = new ComandaMancare(ComandaPlasata.getInstance(), 0);
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();
        comandaMancare.nextState();
    }
}
