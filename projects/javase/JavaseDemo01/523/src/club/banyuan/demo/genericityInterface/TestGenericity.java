package club.banyuan.demo.genericityInterface;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/23 10:47 上午
 */
public class TestGenericity {

  public static void main(String[] args) {
    Function<String>  function=new FunctionImpl();
    function.add("臧三");
    function.add("王五");
    function.add("李四");
    function.add("赵六");

    System.out.println(function.select("田七"));


  }

}
