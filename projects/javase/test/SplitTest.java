import SE.prev2.ex4.Main;
import org.junit.Assert;
import org.junit.Test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.Comparator;

public class SplitTest {
    //文件的拆分和合并
    @Test
    public void splitTest() {
        Main main = new Main();
        File sourceFile = new File("D:\\project\\understandc\\projects\\javase\\src\\miscellaneous\\" +
                "J.Fla-IntheNameofLove.mp3");

        File targetFolder = new File("D:\\project\\understandc\\" +
                "projects\\javase\\src\\SE\\prev2\\ex4\\target");

        main.getSplitMethod(sourceFile, 1024000, targetFolder);

        Assert.assertTrue(targetFolder.exists());
        Assert.assertTrue(targetFolder.isDirectory());

        File[] files = targetFolder.listFiles();
        Assert.assertEquals(9, files.length);

        long totalSize = 0;
        for (int i = 0; i < files.length; i++) {
            System.out.println(files[i].getName());
            totalSize += files[i].length();
        }

//        Arrays.sort(files, (o1, o2) -> {
//            String o1Name = o1.getName();
//            String o2Name = o2.getName();
//            String o1Num = o1Name.substring(o1Name.lastIndexOf("." )+1);
//            String o2Num = o2Name.substring(o1Name.lastIndexOf("." )+1);
//            return Integer.parseInt(o1Num) - Integer.parseInt(o2Num);
//        });
        Arrays.sort(files, new Comparator<File>() {
            public int compare(File o1, File o2) {
                String o1Name = o1.getName();
                String o2Name = o2.getName();
                String o1Num = o1Name.substring(o1Name.lastIndexOf("." )+1);
                String o2Num = o2Name.substring(o1Name.lastIndexOf("." )+1);
                return Integer.parseInt(o1Num) - Integer.parseInt(o2Num);
            }
        });
//        for (File file : files) {
//            System.out.println(file.getName());
//        }
        Assert.assertEquals(sourceFile.length(), totalSize);
    }

    //将拆分后的文件合并
    @Test
    public void combineTest() {
        Main main = new Main();
        File sourceFolder = new File("D:\\project\\understandc\\projects\\javase\\src\\SE\\prev2\\ex4\\target");
        File targetFolder = new File("D:\\project\\understandc\\projects\\javase\\src\\SE\\prev2\\ex4\\CombineTarget");

        main.getCombineMethod(sourceFolder,targetFolder);

        Assert.assertTrue(targetFolder.exists());
        File[] files = targetFolder.listFiles();
        Assert.assertEquals(1,files.length);
        File file = files[0];
        File  expectFile = new File("D:\\project\\understandc\\projects\\javase\\src\\miscellaneous\\J.Fla-IntheNameofLove.mp3");
        Assert.assertEquals(expectFile.getName(),file.getName());
        Assert.assertEquals(expectFile.length(),file.length());

        try {
            FileInputStream expectStream = new FileInputStream(expectFile);
            FileInputStream actualStream = new FileInputStream(file);
            byte[] buf = new byte[1024];
            byte[] actualBuf = new byte[1024];
            int count;

            while ((count = expectStream.read(buf))>0){
                int read = actualStream.read(actualBuf);
                Assert.assertEquals(read,count);
                Assert.assertArrayEquals(buf,actualBuf);
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
