package SE.prev2.ex2;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class WriteFile {


    public static void main(String[] args) throws IOException {
        File path = new File("D:\\project\\understandc\\projects\\javase\\src\\SE\\prev2\\ex2");
        File file = new File(path,"demo.txt");
        if (!file.exists()){
            file.createNewFile();
        }

        String words = "to be or not to be.";

        OutputStream os = new FileOutputStream(file);
        os.write(words.getBytes());
        os.close();


    }

}
