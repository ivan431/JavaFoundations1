package oop;

public class Cow implements Talkable, Eatble{

@Override
    public void talk(){
        System.out.println("Mmmmmmm");

    }

    @Override

    public void eat(){
        System.out.println("nyam");
    }
}
