package homecollection;

import java.util.ArrayList;
import java.util.List;

public class ListPractice2 {

    public static void main(String[] args) {

        List<Person> newList = new ArrayList<>();
        List<String> newList1 = new ArrayList<>(20);
        List<String> newList2 = new ArrayList<>();
        List<Person> newList4 = new ArrayList<>();




        Person p1 = new Person("0)Alex", 27,174, 69.4);
        Person p2 = new Person("1)Salex", 30,173, 70.4);
        Person p3 = new Person("2)Dalex", 25,170, 64.4);
        Person p4 = new Person("3)Ralex", 29,169, 77.2);
        Person p5 = new Person("4)Talex", 34,180, 80.3);
        Person p6 = new Person("5)Malex", 26,181, 68.1);
        Person p7 = new Person("6)Galex", 27,180, 74.2);
        Person p8 = new Person("7)Palex", 24,174, 81.6);
        Person p9 = new Person("8)Halex", 29,175, 91.5);
        Person p10 = new Person("9)Falex", 32,171, 73.5);
        Person p11 = new Person("10)Balex", 33,168, 66.7);
        Person p12= new Person("11)Zalex", 28,181, 67.8);
        Person p13= new Person("12)Lalex", 35,182, 72.6);
        Person p14= new Person("Hax",18,167,63.4);
        Person p15= new Person("Nax",19,168,63.4);
        Person p16= new Person("Uax",20,167,64.4);
        Person p17= new Person("Jax",21,168,63.4);
        Person p18= new Person("Tax",23,167,63.4);


        newList.add(p1);
        newList.add(p2);
        newList.add(p3);
        newList.add(p4);
        newList.add(p5);
        newList.add(p6);
        newList.add(p7);
        newList.add(p8);
        newList.add(p9);
        newList.add(p10);
        newList.add(p11);
        newList.add(p12);
        newList.add(p13);
        newList4.add(p14);
        newList4.add(p15);
        newList4.add(p16);
        newList4.add(p17);
        newList4.add(p18);
        newList.addAll(13,newList4);


       // Person [] persons = new Person[]{Alex, };


        newList.toString();
        



        System.out.println(newList1.size());
        System.out.println(newList2.size());
        System.out.println(newList.size());


        System.out.println(newList.get(0));
        System.out.println(newList.get(12));

        //добавить по индексу на 2 позицию
        newList.add(2,p5);
        //добавить по индексу на 0 позицию
        newList.add(0,p6);


        //Удаление элементов
        newList.remove(p10);
        System.out.println("Del elements (name)="+newList.toString());
        System.out.println("Del elements (name)= "+newList.size());


        newList.remove(10);
        System.out.println("Del elements (name)="+newList.toString());
        System.out.println("Del elements (index)= "+newList.size());


        //размер листа newList
        System.out.println(newList.size());


        //пустой ли лист
        System.out.println(newList.isEmpty());


       //Вернуть элементы индексы которых %3, получить ***** элемент
        for (int i =0; i < newList.size(); i++) {
            if(i%3==0)
            System.out.println(i);
        }
            if(newList.contains(p1)){
                System.out.println(p1);
            }

        System.out.println(newList.get(9));



        //пропустить первые 3 элемента списка
        for (int i = 3; i <newList.size() ; i++) {
            System.out.println(newList.get(i));
        }




        //вывести список элементов с возрастом
        for (Person person: newList){
            System.out.println(person.getName());
            System.out.println(person.getAge());
        }








































    }

}
