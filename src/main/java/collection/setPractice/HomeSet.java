package collection.setPractice;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class HomeSet {
    public static void main(String[] args) {

        Set<String> HomeSet = new HashSet<>();
        HomeSet.add("Konstantin");
        HomeSet.add("Kolya");
        String kostya = "Konstantin";
        HomeSet.add(kostya);
        HomeSet.add("Armen");
        HomeSet.add("Tony Stark");

        System.out.println("________________");

        for (String name : HomeSet) {
            System.out.println(name);
        }

        HomeSet.add("Ivan");

        System.out.println("________________");

        for (String name : HomeSet) {
            System.out.println(name);
        }

        System.out.println("________________");

        System.out.println(HomeSet.size());
        System.out.println(HomeSet.add(kostya));

        System.out.println("_______________");

        HomeSet.remove(kostya);
        HomeSet.remove("Ivan");
        HomeSet.remove("Konstantin");
        System.out.println(HomeSet.size());

        HomeSet.contains("Ivan");


        Iterator<String> iterator = HomeSet.iterator();
        while (iterator.hasNext()){
            System.out.println(iterator.next());
        }








/*

        Iterator iterator = StringSet.iterator();

        for (String s: StringSet){
            StringSet.remove(Ivan);
        }

*/









    }
}
