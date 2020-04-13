package exeptions;

public class CircleException extends Exception {



    public CircleException(String message) {// передаем с сообщением
        super(message);
    }

    public CircleException(String message, Throwable cause) {//передаем с причиной
        super(message, cause);
    }

    public CircleException(Throwable cause) {//причина
        super(cause);
    }

    public CircleException(String message, Throwable cause, boolean enableSuppression, boolean writableStackTrace) {
        super(message, cause, enableSuppression, writableStackTrace);
    }
}
