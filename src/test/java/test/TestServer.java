package test;

import com.majiang.net.Server;
import org.junit.Test;

/**
 * Created by hxiao on 16/8/14.
 */
public class TestServer {

    @Test
    public void testStartup() {
        Server server = Server.getInstance();
        server.startup(8080);
    }
}
