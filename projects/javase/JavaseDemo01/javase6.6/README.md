```java
/**
复制多级文件夹及其子目录和子目录下面的文件 
 public   static void CopyDirectory(File   srcFile,File  targetFile) throws IOException { //复制文件夹
    //如果只是复制子目录呢
    if(srcFile.isDirectory()){//如果起始文件是文件夹
            File  file=new File (targetFile,srcFile.getName());
            file.mkdirs(); //创建多级目录

            File[] files=srcFile.listFiles(); //找到目标下面所有的文件
        for (File  f:files) {
          CopyDirectory(f,file); //使用循环重复调用本方法  如果存在多级目录
        }

      }else{  //如果传递过来的不是文件夹 而是文件
        File   file=new File(targetFile,srcFile.getName());//获取文件名  targetFile目标文件夹
        if(!file.exists()){
          file.createNewFile();
        }
        //读取文件数据
        InputStream  inputStream1=new FileInputStream(srcFile);
        OutputStream outputStream=new FileOutputStream(file);
        byte[] bytes=new  byte[(int)srcFile.length()];
        inputStream1.read(bytes);
        inputStream1.close();

        outputStream.write(bytes);
        outputStream.close();

    }

  }
*/
```