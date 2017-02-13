package test;

import org.junit.Test;
import top.hxiao.net.server.Server;

/**
 * Created by hxiao on 16/8/14.
 */
public class TestServer {

    @Test
    public void testStartup() throws Exception {
        Server server = Server.getInstance();
        server.startup(8080);
    }
}
