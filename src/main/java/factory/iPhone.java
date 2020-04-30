package factory;

public class iPhone implements Phone{
    @Override
    public void call() {
        System.out.println("You using IPhone");
    }
}
