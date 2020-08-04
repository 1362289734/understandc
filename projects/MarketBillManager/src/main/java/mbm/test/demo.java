package mbm.test;

import java.net.URL;

public class demo {

    public static void main(String[] args) {
        URL resource = demo.class.getResource("/");
        System.out.println(resource);
    }
}
