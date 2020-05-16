package club.banyuan.demo;

import java.util.Arrays;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/25 1:33 下午
 */
public class ArrayCopyOf {

  //数组扩容
  private   int [] arr=new  int[1];
  private   int key=0;
  private   int count=0;

  //做添加操作
  public   void  add(int   number){
    int [] arr1=new int[arr.length+1];
      arr[arr.length-1]=number;
    //这里不是做了一个扩容操作嘛   但是原有的arr数组里面的元素 得从新赋值到arr1里面
    if(arr.length==1){
        arr1[arr.length-1]=arr[arr.length-1];
    }else{
      for (int i = 0; i < arr.length; i++) {
            arr1[i]=arr[i];
      }
    }
    arr=arr1;

    //数组扩容  也可以在做添加之前进行判断  如果没有数据传递过来 就不需要进行扩容
    //arr=Arrays.copyOf(arr, arr.length+1);



  }

  public  int[] get(){
    return  arr;
  }

}
class TestArray{

  public static void main(String[] args) {
    ArrayCopyOf arrayCopyOf=new ArrayCopyOf();
    arrayCopyOf.add(1231);
    arrayCopyOf.add(213);
    arrayCopyOf.add(11);
    arrayCopyOf.add(24231);
    arrayCopyOf.add(76543);

    System.out.println(Arrays.toString(arrayCopyOf.get()));


  }
}