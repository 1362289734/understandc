package club.banyuan.demo;


import java.io.File;
import java.io.FileFilter;
import java.io.FilenameFilter;
import java.util.ArrayList;
import java.util.List;

public class Main {

    /**
     * 文件:存储在计算机外部介质(磁盘)中的数据叫文件
     * @param args
     */
    static List<File>  list=new ArrayList<>();


    public static void main(String[] args) {

        File file = new File("/Users/sanye/img"); //你要找的目标文件的地址
//        System.out.println(file.exists());
//        System.out.println(file.getAbsolutePath());
//        System.out.println(file.getPath());

        //编码格式 一个汉字占两个字节(gbk)   utf-8 格式一个汉字占三个字节
        //System.out.println(file.length());
       // System.out.println(file.isDirectory());
       // System.out.println(file.renameTo(new File("read.md")));
       // System.out.println(file.getParent());
       // System.out.println(file.delete());

//        File [] files=file.listFiles();  //会找到该目录下所有的文件
//        for (File  f:files) {
//            System.out.println("----"+f);
//        }

//       File[] files= file.listFiles(new FileFilter() {  //文件过滤器
//           @Override
//           public boolean accept(File pathname) {
//               if(pathname.getName().endsWith(".jpg")){
//                    return true;
//               }
//               return false;
//           }
//       });

        getAllJPGFile(file);
        System.out.println(list);

    }

    //getAllJPGFile
    public  static void getAllJPGFile(File file){

         if(file.isDirectory()){
             //第一步进行过滤
                 File[] files=file.listFiles(new FilenameFilter() {
                       @Override
                       public boolean accept(File dir, String name) {
                           return name.endsWith(".jpg");
                       }
                   });
             for (File f1:files) {
                 list.add(f1);
             }

             //拿到所有的文件  并且 判断是否是文件夹 如果是文件夹就重新递归调用这个方法
             File [] f=file.listFiles();
             for (File  file1:f) {
                 if(file1.isDirectory()){
                     getAllJPGFile(file1);
                 }
             }

         }
    }
}
