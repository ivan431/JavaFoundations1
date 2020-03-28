package oop;

public class WorkWithObject {
    public static void main(String[] args) {

        Object obj = new Object();
        System.out.println("obj.toString() = " + obj.toString());
        System.out.println("obj.getClass() = " + obj.getClass());
        obj.equals(new Object());

        Duck duck1 = new Duck("Хрен","red",true,1.3);
        Duck duck2 = new Duck("Херня","blue",true,1.3);
        duck1.equals(duck2);

        System.out.println(duck1);







    }
}
