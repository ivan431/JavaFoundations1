package factory;

public class Samsung implements Phone {
    @Override
    public void call() {
        System.out.println("You using Samsung");
    }
}
