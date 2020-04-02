package homecollection;

public class Person implements Comparable <Person>{

    public String name;
    public int age;
    public int height;   //рост
    public double weight;


    public Person(String name, int age, int height, double weight){
        this.name = name;
        this.age = age;
        this.height = height;
        this.weight = weight;
    }


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public int getAge() {
        return age;
    }


    public void setAge(int age) {
        this.age = age;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }


    public double getWeight() {
        return weight;
    }


    public void setWeight(double weight) {
        this.weight = weight;
    }


    @Override
    public String toString(){
        return "Person("+"name="+name+")";

    }


    @Override
    public int compareTo(Person o) {
        return name.compareTo(o.getName());
    }
}
