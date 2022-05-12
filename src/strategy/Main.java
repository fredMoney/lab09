package strategy;

public class Main {
    public static void main(String[] args) {
        MotorCriptare motor = new MotorCriptare(new Algoritm1());
        motor.obtineModCriptare("cripteaza");
        motor.setM(new Algoritm2());
        motor.obtineModCriptare("cripteaza");
        motor.setM(new Algoritm3());
        motor.obtineModCriptare("cripteaza");
    }
}
