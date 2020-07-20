package SE.prev2.ex3;

import java.io.*;

public class BufferedCharacterStream {

    public static void main(String[] args) throws IOException {
        File path = new File("D:\\project\\understandc\\projects\\javase\\src\\SE\\prev2\\ex3");

        File demo = new File("D:\\project\\understandc\\projects\\javase\\src\\SE\\prev2\\ex3/demo.txt");
        if (!demo.exists()) {
            demo.createNewFile();
        }

        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(demo))) {
            bufferedWriter.write("access succeed");
            bufferedWriter.newLine();
            bufferedWriter.write("access denied");
        } catch (IOException e) {
            e.printStackTrace();
        }

        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(demo))) {
            String s = bufferedReader.readLine();
            StringBuilder builder = new StringBuilder();
            while (s != null) {
                builder.append(s);
                builder.append(System.lineSeparator());
                s = bufferedReader.readLine();
            }
            System.out.println(builder.toString());

        } catch (IOException e) {
            e.printStackTrace();
        }


    }


}
