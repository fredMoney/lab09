package state;

public class ComandaPlasata implements State {
    private static ComandaPlasata instance;

    private ComandaPlasata() {
    }

    public static ComandaPlasata getInstance() {
        if (instance == null) {
            instance = new ComandaPlasata();
        }
        return instance;
    }

    @Override
    public void updateState(ComandaMancare c) {
        c.setS(PlataEfectuata.getInstance());
        System.out.println("Comanda plasata -> Plata efectuata");
    }
}
