package state;

public class MancareGataDeLivrare implements State {
    private static MancareGataDeLivrare instance;

    private MancareGataDeLivrare() {
    }

    public static MancareGataDeLivrare getInstance() {
        if (instance == null) {
            instance = new MancareGataDeLivrare();
        }
        return instance;
    }

    @Override
    public void updateState(ComandaMancare c) {
        c.setS(ComandaInCursDeLivrare.getInstance());
        System.out.println("Mancare gata de livrare -> Comanda in curs de livrare");
    }
}
