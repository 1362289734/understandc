import java.io.IOException;
import java.util.Properties;

public class PropUtil {

    private static final Properties properties = new Properties();

    static{
        try {
            properties.load(PropUtil.class.getClassLoader().getResourceAsStream("video.properties"));
        } catch (IOException e) {
            throw new RuntimeException("加载配置文件失败");
        }
    }



    public static String getProp(String key){
        return properties.getProperty(key);
    }

    public static String getPath(){
        return properties.getProperty("path");
    }

    public static void main(String[] args) throws IOException {
        System.out.println(PropUtil.class.getClassLoader().getResource("video.properties").getPath());;
        Properties properties = new Properties();
        properties.load(PropUtil.class.getClassLoader().getResourceAsStream("video.properties"));
        System.out.println("PATH:"+properties.getProperty("path"));
    }

}
