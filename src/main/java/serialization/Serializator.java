package serialization;

import java.io.*;

public class Serializator {
    public static void main(String[] args) {

        User user = new User("User2020", "jhbvulj1232");

        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Save.txt");
            ObjectOutputStream objectOutputStream = new ObjectOutputStream(fileOutputStream);

             objectOutputStream.writeObject(user);
             objectOutputStream.close();


        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }




        File file = new File("Save1.txt");
        try { PrintWriter printWriter = new PrintWriter(file);

            printWriter.println("vgvgvgv11");
            printWriter.close();
        } catch (IOException ex) {
            ex.printStackTrace(System.out);
        }



        try {
            FileOutputStream fileOutputStream = new FileOutputStream("Save2.txt");
            fileOutputStream.write(45454);
            fileOutputStream.write(412121);

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






    }
}
