package oop;

public class Human {

    private String name;
    private String profession;
    private boolean isMale;  //мужчина?
    private double weight;


    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        } else if (getClass() != obj.getClass()) {
            return false;
        }



        Human human = (Human) obj;

        //  public double compare () {
        //if (human.weight, weight)! = 0{
        //    return false;
        //    }
        //    }

        if (Double.compare(human.weight, weight) != 0) {
            return false;
        }

        boolean forProfession;
        if (name != null) {
            forProfession = !name.equals(human.name);
        } else {
            forProfession = human.name != null;
        }
        if (forProfession) {
            return false;
        }

        //if (name != null ? !name.equals(human.name) : human.name != null)
        //    return false;
        //return profession != null ? profession.equals(human.profession) : human.profession == null;
        return forProfession;
    }


    @Override
    public int hashCode() {
        int result=profession.hashCode();
        result = name.hashCode() *31+result;
        result = 31 * result + 16;
        result = (int) (31 * result + weight);
        return result;
    }

    public Human (String name, String profession, boolean isMale, double weight){
        this.name = name;
        this.profession = profession;
        this.isMale = isMale;
        this.weight = weight;
    }





}
