package state;

public class ComandaMancare {
    private State s;
    private int nrComanda;

    public ComandaMancare(State s, int nrComanda) {
        this.s = s;
        this.nrComanda = nrComanda;
    }

    public void setS(State s) {
        this.s = s;
    }

    public State getS() {
        return s;
    }

    public void nextState() {
        s.updateState(this);
    }
}
