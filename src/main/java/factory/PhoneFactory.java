package factory;

public class PhoneFactory {


    public Phone create(EnumFactory typeOfPhone) {
        switch (typeOfPhone) {
            case HONOR:
                return new Honor();
            case SAMSUNG:
                return new Samsung();
            case IPHONE:
                return new iPhone();
            default: return null;
        }


    }
}
