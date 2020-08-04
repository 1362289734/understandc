package mbm.util;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class PropUtil {
    private static Properties properties = new Properties();

    // 静态代码块在被加载的时候执行
    static{
        // 获取到app.properties文件的流
        InputStream resourceAsStream = PropUtil.class.getClassLoader()
                .getResourceAsStream("app.properties");

        try {
            // 读取配置文件中所有的key value数据
            properties.load(resourceAsStream);
        } catch (IOException e) {
            System.out.println("加载配置文件失败");
            System.exit(0);
        }
    }

    public static String getProp(String key) {
        return properties.getProperty(key);
    }
}
