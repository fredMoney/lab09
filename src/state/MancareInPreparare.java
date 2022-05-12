package state;

public class MancareInPreparare implements State {
    private static MancareInPreparare instance;

    private MancareInPreparare() {
    }

    public static MancareInPreparare getInstance() {
        if (instance == null) {
            instance = new MancareInPreparare();
        }
        return instance;
    }

    @Override
    public void updateState(ComandaMancare c) {
        c.setS(MancareGataDeLivrare.getInstance());
        System.out.println("Mancare in preparare -> Mancare gata de livrare");
    }
}
