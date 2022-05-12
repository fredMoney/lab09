package strategy;

public class MotorCriptare {
    private ModCriptare m;

    public MotorCriptare(String text) {

    }

    public MotorCriptare(ModCriptare m) {
        this.m = m;
    }

    public void obtineModCriptare(String text){
        System.out.println(m.cripteaza(text));
    }

    public void setM(ModCriptare m) {
        this.m = m;
    }
}
