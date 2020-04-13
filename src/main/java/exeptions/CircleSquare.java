package exeptions;

public class CircleSquare {

    public void getSqueare (){
        Circle circle = new Circle();
        try {//обработка места где может произойти ошибка (блока кода)
            circle.setR(-1);
        } catch (CircleException e) {//обработка исключения (блока кода)
            e.printStackTrace();
        } finally {
            System.out.println("finally"); //закрываем ресурс
        }
    }





















}
