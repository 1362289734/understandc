package club.banyuan.demo.date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.ZoneId;
import java.util.Calendar;
import java.util.Date;
import java.util.Locale;
import java.util.TimeZone;

/**
 * @author sanye
 * @version 1.0
 * @date 2020/4/25 4:03 下午
 */
public class Demo {

  public static void main(String[] args) {
    Date  date=new  Date();
    //Sat Apr 25 16:04:28 CST 2020
    //   1587801925252----1587801925252  1970年1月1日  是计算机元年  早上8:00
    System.out.println(date+"----"+System.currentTimeMillis());

    System.out.println(date.before(new Date()));

    //表示中央时区 时间格式 Sat Apr 25 16:10:51 CST 2020
    System.out.println(date.toLocaleString());//2020-4-25 16:10:51  本地时间


    // 转换成自己喜欢的格式
    date=new  Date();
    SimpleDateFormat  simpleDateFormat=new SimpleDateFormat("yyyy年MM月dd日 hh时mm分ss秒 SSS");

    String   str=simpleDateFormat.format(date);
    System.out.println("----"+str);


    //
    String    st_date="2019-08-09";
    //把字符串转换成时间类型
    simpleDateFormat=new SimpleDateFormat("yyyy-MM-dd");

    try {
    Date  date1=  simpleDateFormat.parse(st_date);
      System.out.println(date1.toLocaleString());
    } catch (ParseException e) {
      e.printStackTrace();
    }


    //日历类
    Calendar  calendar=Calendar.getInstance();
    //System.out.println(calendar.getTimeZone());
    //System.out.println(TimeZone.getTimeZone(ZoneId.of("Asia/Shanghai")).getDisplayName(Locale.CHINA));

    //calendar.add(Calendar.DAY_OF_MONTH, 5); //5天前
    //calendar.add(Calendar.MONTH, -2);

//    calendar.add(Calendar.MONTH, -3);
//    calendar.add(Calendar.DAY_OF_MONTH, -5);
//
//    calendar.clear();

    calendar.set(2021, 1, 1);


    System.out.println(calendar.getTime());







  }


}
