package SE.prev2.ex4;

import java.io.*;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {


    }

    /**
     * @param sourceFile   目标文件
     * @param size         拆分文件大小 byte 为单位
     * @param targetFolder 生成的拆分文件路径，如果传入的路径不存在，则创建这个路径
     *                     拆分文件的命名规则，原始文件名.编号.
     *                     eg:WIN.mp3 拆分后，变为: WIN.mp3.1  WIN.mp3.2  ...
     */
    public void getSplitMethod(File sourceFile, int size, File targetFolder) {
        this.split(sourceFile, size, targetFolder);
    }

    private void split(File sourceFile, int size, File targetFolder) {
        if (targetFolder == null) {
            throw new RuntimeException("目标路径不合法");
        }

        if (sourceFile == null) {
            throw new RuntimeException("源文件不合法");
        }

        if (!targetFolder.exists()) {
            targetFolder.mkdirs();
        }

        int splitNum = (int) (Math.ceil(sourceFile.length() / (double) size));
        String name = sourceFile.getName();

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            fileInputStream = new FileInputStream(sourceFile);
            byte[] buf = new byte[1024];
            int count = 0;
            for (int i = 0; i < splitNum; i++) {

                File file = new File(targetFolder.getCanonicalPath(), name + "." + (i + 1));
                fileOutputStream = new FileOutputStream(file);
                int finish = 0;
                while ((count = fileInputStream.read(buf, 0, Math.min(buf.length, size - finish))) > 0) {

                    fileOutputStream.write(buf, 0, count);

                    finish += count;//记录读取了多少，方便计算还剩下多少
                }
                fileOutputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            closeStream(fileInputStream);
            closeStream(fileOutputStream);
        }
    }

    private void closeStream(Closeable closeable) {
        if (closeable != null) {
            try {
                closeable.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }


    /**
     * 将指定文件夹下的拆分文件合并为一个文件，将文件保存到指定的路径下
     *
     * @param sourceFolder 拆分文件所处的路径，其下的文件名规则，同split拆分出
     * @param targetFolder 合并之后的文件保存路径，如果路径不存在，则创建这个
     */
    public void getCombineMethod(File sourceFolder, File targetFolder){
        this.combine(sourceFolder,targetFolder);
    }

    private void combine(File sourceFolder, File targetFolder) {
        if (targetFolder == null) {
            System.out.println("目标文件不合法");
        }

        if (!targetFolder.exists() || !targetFolder.isDirectory()) {
            targetFolder.mkdirs();
        }

        File[] files = sourceFolder.listFiles();

        if (files == null || files.length == 0) {
            throw new RuntimeException("源文件夹不合法");
        }

        String name = files[0].getName();
        String targetFileName = name.substring(0, name.lastIndexOf("."));


        //对拆分完成的文件进行排序
        Arrays.sort(files, (o1, o2) -> {
            String o1Name = o1.getName();
            String o2Name = o2.getName();
            String o1Num = o1Name.substring(o1Name.lastIndexOf(".") + 1);
            String o2Num = o2Name.substring(o1Name.lastIndexOf(".") + 1);
            return Integer.parseInt(o1Num) - Integer.parseInt(o2Num);
        });

        FileInputStream fileInputStream = null;
        FileOutputStream fileOutputStream = null;

        try {
            File targetFile = new File(targetFolder.getCanonicalPath(), targetFileName);
            fileOutputStream = new FileOutputStream(targetFile);
            int count;
            byte[] buf = new byte[1024];
            for (File file : files) {
                fileInputStream = new FileInputStream(file);
                while (((count = fileInputStream.read(buf))>0)){
                    fileOutputStream.write(buf,0,count);
                }

                fileInputStream.close();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            closeStream(fileInputStream);
            closeStream(fileOutputStream);
        }


    }


}
