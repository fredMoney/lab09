package state;

public class Livrat implements State {
    private static Livrat instance;

    private Livrat() {
    }

    public static Livrat getInstance() {
        if (instance == null) {
            instance = new Livrat();
        }
        return instance;
    }

    @Override
    public void updateState(ComandaMancare c) {
        System.out.println("Comanda livrata.");
    }
}
