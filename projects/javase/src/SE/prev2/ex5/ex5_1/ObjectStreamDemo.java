package SE.prev2.ex5.ex5_1;

import java.io.*;

public class ObjectStreamDemo {

    public static void main(String[] args) throws IOException {
        User user = new User("zhangsan","123456");

        File file = new File("D:\\project\\understandc\\projects\\javase\\src\\SE\\prev2\\ex5\\ex5_1","user.txt");

//        try {
//            ObjectOutputStream objectOutputStream = new ObjectOutputStream(new FileOutputStream(file));
//            objectOutputStream.writeObject(user);
//
//        } catch (IOException e) {
//            e.printStackTrace();
//        }
//
        ObjectInputStream objectInputStream = new ObjectInputStream(new FileInputStream(file));

        try {
            Object o = objectInputStream.readObject();
            User u1 = (User)o;
            System.out.println(u1);
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


    }

}
