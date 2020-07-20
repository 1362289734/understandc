package SE.prev2.ex1;

import java.io.File;

public class FileDemo {
    public static void main(String[] args) {
        //绝对路径，相对路径
        File file = new File("D:\\project\\understandc\\projects\\javase\\src\\SE\\prev2\\ex1\\test.txt");
        //查询文件的长度
        System.out.println(file.length());
        System.out.println(file.getName());
        System.out.println(file.isDirectory());
        System.out.println(file.exists());

        System.out.println();

        File directory = new File("D:\\project\\understandc\\projects\\javase\\src\\SE\\prev2\\ex1");
        System.out.println(directory.getName());
        System.out.println(directory.exists());
        System.out.println(directory.length());
        System.out.println(directory.isDirectory());

        System.out.println();

        File[] files = directory.listFiles();
        for (File file1 : files) {
            System.out.println(file1.getName());
        }



    }
}
