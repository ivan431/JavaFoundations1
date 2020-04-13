package exeptions;

public class Circle {

    public double r;


    public double getR() {
        return r;
    }

    public void setR(double r) throws CircleException {//перекинулись выше - подтянули как сигнатуру
        if(r<0){
            throw new CircleException("r<0");
        }
        this.r = r;
    }
















}
