package club.banyuan.demo.genericityInterface;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/23 10:44 上午
 */
public interface Function<T> {

  //做查询操作
  T   select(T  t);

  //做添加
  void  add(T  t);
}
