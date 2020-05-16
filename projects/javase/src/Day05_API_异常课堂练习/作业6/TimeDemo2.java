package Day05_API_异常课堂练习.作业6;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDemo2 {
    /**
     * 请计算出自己的出生年月日距离现在已经过去了多少天
     * 1997年5月2号     2020年4月25号  过去了多少天
     */

    public static void main(String[] args) {
        String str = "1999-12-29";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        Date date = new Date();
        try {
            Date date1 = simpleDateFormat.parse(str);
            long count1 = date.getTime()-date1.getTime();
            long day1 = count1 / 1000 / 3600 / 24;
            long hour1 = (count1 / 1000 - day1 * 24 * 3600) / 3600;
            System.out.println("距离我出生：" + date1.toLocaleString()+"已经过去了"+day1+"天"+hour1+"小时");
            System.out.println(day1/365+"年");
        } catch (ParseException e) {
            e.printStackTrace();
        }
    }
}
