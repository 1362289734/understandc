package com.banyuan.club.polymorphic2;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/3/28 2:19 下午
 */
public class TestTool {

  public static void main(String[] args) {
    //贵州人来了
//    GuiZhou  guiZhou=new GuiZhou();
//    Tool.show1(guiZhou);
//
//
//    //广东人来了
//    GuangDong  guangDong=new GuangDong();
//    Tool.show1(guangDong);
//
//
//    //南京人来了
//    NanJing    nanJing=new NanJing();
//    Tool.show1(nanJing);


    //  一个多月  你们没来了  我给你们准备食物 全都坏了  被老婆骂了  老婆说 为什么不等他们来了再准备东西
    Person  p=new GuangDong();
            Tool.show(p);

          p=new YunNan();
          Tool.show(p);




  }

}
