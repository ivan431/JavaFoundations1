package serialization;

import java.io.*;
import java.util.Scanner;

public class Serializator {
    public static void main(String[] args) {

        User user = new User("User2020", "jhbvulj1232");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Save.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

             objectOutputStream.writeObject(user);
             objectOutputStream.flush();


        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }




        File file = new File("Save1.txt");
        String str = new Scanner(System.in).next();
        try {
            FileWriter fileWriter = new FileWriter(file, true);

            fileWriter.write(str);
            fileWriter.flush();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }



        try(FileInputStream fileInputStream1=new FileInputStream("Save1.txt");
            FileOutputStream fileOutputStream1=new FileOutputStream("Save3.txt"))
        {
            byte[] buffer = new byte[fileInputStream1.available()];//засовываю содержимое в буфер
            // считываю буфер (в скобках указываю, что буду читать!
            fileInputStream1.read(buffer);
            // записываю из буфера в файл
            fileOutputStream1.write(buffer);

            FileInputStream fileInputStream2 = new FileInputStream("Save3.txt");
            FileOutputStream fileOutputStream2 = new FileOutputStream("Save1.txt");

            byte[] buffer1 = new byte[fileInputStream1.available()];
            fileInputStream2.read(buffer1);
            fileOutputStream2.write(buffer1);

        }
        catch(IOException ex){
            System.out.println(ex.getMessage());
        }

/*

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Save2.txt");
            String thisString = "Эта строка лежит здесь";
            //if(fileOutp)

            fileOutputStream.flush();


        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }












        try { FileInputStream fileOutputStream = new FileInputStream("Save.txt");
            ObjectInputStream objectInputStream = new ObjectInputStream(fileOutputStream);

            User user1 = (User) objectInputStream.readObject();
            System.out.println(user1.getLogin());
            System.out.println(user.getPassword());
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        } catch (ClassNotFoundException ex){
            ex.printStackTrace(System.out);
        }

 */






    }
}
