package Day05_API_异常课堂练习.作业5;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class TimeDemo {
    /**
     * 在控制台上显示时间倒计时  例如: 距离2020年5月1日还有几天几个小时几分钟几秒
     */

    public static void main(String[] args){
        Date date = new Date();
        String str = "2020-05-01";
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy-MM-dd");
        try {
            Date date_1 = simpleDateFormat.parse(str);
            System.out.println(date_1.toLocaleString());
            long count = date.getTime() - date_1.getTime();
            long day = count/1000/3600/24;
            long hour = (count/1000 - day*24*3600)/3600;
            System.out.println("距离2020年5月1日还有"+day+"天 "+hour+"小时");

        } catch (ParseException e) {
            e.printStackTrace();
        }

    }
}
