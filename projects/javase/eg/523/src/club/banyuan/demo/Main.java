package club.banyuan.demo;

import club.banyuan.demo.genericityInterface.Function;
import club.banyuan.demo.genericityInterface.FunctionImpl;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        FunctionImpl<String> function=new FunctionImpl();
        function.add("臧三");
        function.add("王五");
        function.add("李四");
        function.add("赵六");

        System.out.println("----"+function.select("赵六"));

       List<String>  list=function.getList();
        for (String  str:list) {
            System.out.println(str);
        }


    }
}
