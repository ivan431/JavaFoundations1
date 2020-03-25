public class Ivan {
    public static void main(String[] args) {

        int x = Math.mult(5, 6);
        int u = Math.summ(4, 7);
        System.out.println(x);
        System.out.println(u);

        Math a = new Math();
        System.out.println(a.x);
        Math.x =22;
        System.out.println(a.x);
        Math b=new Math();
        System.out.println(b.x);


        //площадь круга
        System.out.println(Math.roundsArea(5));

        //площадь треугольника
        System.out.println(Math.threeGonArea(3,4));









    }


}
