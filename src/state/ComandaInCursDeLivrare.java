package state;

public class ComandaInCursDeLivrare implements State {
    private static ComandaInCursDeLivrare instance;

    private ComandaInCursDeLivrare() {
    }

    public static ComandaInCursDeLivrare getInstance() {
        if (instance == null) {
            instance = new ComandaInCursDeLivrare();
        }
        return instance;
    }

    @Override
    public void updateState(ComandaMancare c) {
        c.setS(Livrat.getInstance());
        System.out.println("Comanda in curs de livrare -> Livrat");
    }
}
