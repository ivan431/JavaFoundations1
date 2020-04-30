package factory;

public class Honor implements Phone {
    @Override
    public void call() {
        System.out.println("You using Honor");
    }
}
