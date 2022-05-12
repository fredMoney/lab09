package state;

public class PlataEfectuata implements State {
    private static PlataEfectuata instance;

    private PlataEfectuata() {
    }

    public static PlataEfectuata getInstance() {
        if (instance == null) {
            instance = new PlataEfectuata();
        }
        return instance;
    }

    @Override
    public void updateState(ComandaMancare c) {
        c.setS(MancareInPreparare.getInstance());
        System.out.println("Plata efectuata -> Mancare in preparare");
    }
}
