package oop;

public class NewSubject implements Swimable, Flyable{

    @Override
 public void fly() {
     System.out.println("i can fly");
 }

 @Override
 public void swim(){
     System.out.println("i can swim");
 }

}
