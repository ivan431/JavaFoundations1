package factory;

public class Main {
    public static void main(String[] args) {
        PhoneFactory phoneFactory  = new PhoneFactory();


        Phone honor = phoneFactory.create(EnumFactory.HONOR);
        Phone iphone = phoneFactory.create(EnumFactory.IPHONE);
        Phone samsung = phoneFactory.create(EnumFactory.SAMSUNG);

        honor.call();
        iphone.call();
        samsung.call();
    }
}
