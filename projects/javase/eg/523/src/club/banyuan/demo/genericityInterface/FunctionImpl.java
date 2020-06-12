package club.banyuan.demo.genericityInterface;

import java.util.ArrayList;
import java.util.List;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/23 10:45 上午
 */
public class FunctionImpl<T> implements  Function<T> {

  //数据添加到集合里面
  List<T> list=new ArrayList<>();

  @Override
  public T select(T t) {
    //for (int i = 0; i <list.size(); i++) {
      if(list.contains(t)){  //其实在这一步就已经判断出集合里面包含了传递过来的数据
        return t; //但是在这里获取的一直是  第一个数据
      }
    //}
    return null;
  }

  @Override
  public void add(T t) {
      list.add(t);
  }


  public List<T> getList() {
    return list;
  }

  public void setList(List<T> list) {
    this.list = list;
  }
}
