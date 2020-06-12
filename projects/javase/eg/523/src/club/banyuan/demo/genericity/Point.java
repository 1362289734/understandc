package club.banyuan.demo.genericity;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/23 9:59 上午
 */
public class Point<T,K> {

//  private Integer  x;//表示横坐标
//  private Integer  y;//表示纵坐标
//
//  public Integer getX() {
//    return x;
//  }
//
//  public void setX(Integer x) {
//    this.x = x;
//  }
//
//  public Integer getY() {
//    return y;
//  }
//
//  public void setY(Integer y) {
//    this.y = y;
//  }

//  private  Double  x;
//  private  Double  y;
//
//  public Double getX() {
//    return x;
//  }
//
//  public void setX(Double x) {
//    this.x = x;
//  }
//
//  public Double getY() {
//    return y;
//  }
//
//  public void setY(Double y) {
//    this.y = y;
//  }

//  private   String   x;
//  private   String   y;
//
//  public String getX() {
//    return x;
//  }
//
//  public void setX(String x) {
//    this.x = x;
//  }
//
//  public String getY() {
//    return y;
//  }
//
//  public void setY(String y) {
//    this.y = y;
//  }



    T  x;
    K  y;

  public T getX() {
    return x;
  }

  public void setX(T x) {
    this.x = x;
  }

  public K getY() {
    return y;
  }

  public void setY(K y) {
    this.y = y;
  }
}
