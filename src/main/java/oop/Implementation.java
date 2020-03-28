package oop;

public class Implementation {
    public static void main(String[] args) {

        Object newObj = new Object();
        int hashC;
        hashC = newObj.hashCode();
        System.out.println(hashC);



        Object ass = new Object();
        ass.hashCode();
        System.out.println(ass.hashCode());

        Object hand = new Object();
        long myHand;
        myHand = hand.hashCode();
        System.out.println(myHand);


        Duck durDuck = new Duck("Kurica", "yellow", false, 4.4);
        Duck durDuck1 = new Duck("Kurica", "yellow", false, 4.4);
        Duck durDuck2 = new Duck("Kurica", "yellow", true, 4.4);
        Duck durDuck3 = new Duck("Kura", "yellow", false, 4.5);
        Duck durDuck4 = new Duck("Kuric", "blue", false, 4.2);
        Duck durDuck5 = new Duck("Kurana", "red", true, 4.7);


        System.out.println(durDuck.hashCode());
        System.out.println(durDuck1.hashCode());
        System.out.println(durDuck2.hashCode());
        System.out.println(durDuck3.hashCode());
        System.out.println(durDuck4.hashCode());
        System.out.println(durDuck5.hashCode());

        System.out.println(durDuck.equals(durDuck1));

        Human h1 = new Human("Duh", "driver", true, 78.5);
        Human h2 = new Human("Duh", "driver", true, 74.4);
        Human h3 = new Human("Duhina", "cleaner", false, 62.8);
        Human h4 = new Human("Duhina", "cleaner", true, 62.8);

        System.out.println("h1="+h1.hashCode());
        System.out.println("h2="+h2.hashCode());
        System.out.println("h3="+h3.hashCode());
        System.out.println("h4="+h4.hashCode());


        Swimable somebody = new NewSubject();
        somebody.swim();

        Flyable somebody2 = new NewSubject();
        somebody2.fly();
















    }

}
