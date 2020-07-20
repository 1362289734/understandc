package club.banyuan.demo.homework;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/5/16 9:41 上午
 */
public class ReadyPlayPoker {

  // 首先要把牌确定   54张  并且是混合的
  public static int[] arr = new int[54];

  private ReadyPlayPoker() {

  }

  public static String[] getPoker() {
    String[] STR = new String[54];
    int key = 0;

    for (int i = 0; i < CardColor.C_COLOR.length; i++) {
      for (int j = 0; j < CardColor.poker.length; j++) {
        STR[key] = CardColor.C_COLOR[i] + CardColor.poker[j];
        ++key;
      }
    }
    for (int i = 0; i < CardColor.jokers.length; i++) {
      STR[key] = CardColor.jokers[i];
      ++key;
    }
    return STR;
  }

  //洗牌
  public static String[] getOutOfOrderPoker() {
    //首先需要一个数组容器
    String[] out = new String[54];

    String[] STR = getPoker();
    int key = 0;

    for (int i = 0; i < STR.length; i++) {
      arr[i] = i;
    }
    int index = -1;
    while (arr.length != 0) {
      index = getIndex(arr);  //获取到下标之后  arr里面的数据应该会少一个
      out[key++] = STR[arr[index]];
      arr = getNewArr(index);
    }

    return out;
  }

  //根据index 下标进行数组元素的删除操作
  public static int[] getNewArr(int index) {
    for (int i = index; i < arr.length - 1; i++) {
      arr[i] = arr[i + 1];
    }
    int[] newArr = new int[arr.length - 1];
    for (int j = 0; j < newArr.length; j++) {
      newArr[j] = arr[j];
    }
    arr = newArr;
    return arr;
  }


  //获取随机下标,一共54个下标  随机出来一个 还剩53个
  public static int getIndex(int[] arr) {

    int index = (int) (Math.random() * arr.length);
    //在这里移除已经取出来的下标

    return index;
  }






}
