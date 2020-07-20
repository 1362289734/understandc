package SE.prev2.ex1;

import java.io.File;
import java.io.IOException;

public class NewFile {
    public static void main(String[] args) throws IOException {
        File path = new File("D:\\project\\understandc\\projects\\javase\\src\\SE\\prev2\\ex1");
        File demo = new File(path,"demo");
        System.out.println(demo.exists());
        System.out.println(path.getCanonicalPath());
//        if (!demo.exists()) {
//            demo.createNewFile();
//        }
//        demo.delete();
//        if (!demo.exists()) {
//            System.out.println("delete succeed");
//            demo.createNewFile();
//            System.out.println("create succeed");
//        }
//
//        demo.renameTo(new File(path,"1234.txt"));
//        System.out.println(demo.mkdirs());
    }

    void delete (File file){
//        file.isDirectory()
//        file.listFiles()
//        file.delete()

    }


}
