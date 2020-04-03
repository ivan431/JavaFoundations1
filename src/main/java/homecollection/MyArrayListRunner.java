package homecollection;


import oop.Duck;


public class MyArrayListRunner {
    public static void main(String[] args) {
        MyArrayList myArrayList = new MyArrayList();
        myArrayList.add(new Duck("Qwerty","blue",true,35.7));
        myArrayList.add(new Duck("Harold","red",true, 45.3));
        myArrayList.add(new Duck("Donald","red",true, 44.2));
        myArrayList.add(new Duck("Don","red", true, 25.7));




        System.out.println(myArrayList);
    //    System.out.println(myArrayList.remove(1));
        System.out.println(myArrayList.toString());

        System.out.println("___________________");
        System.out.println(myArrayList.size());
        System.out.println(myArrayList.isEmpty());
        System.out.println(myArrayList.toArray());


        //System.out.println(myArrayList.indexOf());
        //System.out.println(myArrayList.containsAll());


    }


}
