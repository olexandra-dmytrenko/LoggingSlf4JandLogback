package slf4jmain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Main {

    public static void main(String[] args) {
        Logger LOG = LoggerFactory.getLogger(Main.class);
        System.out.println("Hello World!");
        LOG.info("Hello World!");
    }
}
