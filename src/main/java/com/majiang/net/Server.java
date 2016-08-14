package com.majiang.net;

import io.netty.bootstrap.ServerBootstrap;
import io.netty.channel.Channel;
import io.netty.channel.ChannelInitializer;
import io.netty.channel.ChannelOption;
import io.netty.channel.EventLoopGroup;
import io.netty.channel.nio.NioEventLoopGroup;
import io.netty.channel.socket.SocketChannel;
import io.netty.channel.socket.nio.NioServerSocketChannel;
import io.netty.handler.codec.string.StringDecoder;
import io.netty.handler.codec.string.StringEncoder;
import io.netty.handler.logging.LogLevel;
import io.netty.handler.logging.LoggingHandler;

/**
 * Created by hxiao on 16/8/14.
 */
public class Server {
    private static volatile Server ourInstance = null;
    private EventLoopGroup bossGroup = null;
    private EventLoopGroup workerGroup = null;

    private Server() {

    }

    public static Server getInstance() {
        if (ourInstance == null) {
            synchronized (Server.class) {
                if (ourInstance == null) {
                    ourInstance = new Server();
                }
            }
        }

        return ourInstance;
    }

    public void startup(int port) {
        try {
            bossGroup = new NioEventLoopGroup(1);
            workerGroup = new NioEventLoopGroup(4);
            ServerBootstrap bootstrap = new ServerBootstrap().group(bossGroup, workerGroup).channel
                    (NioServerSocketChannel.class).option(ChannelOption.SO_BACKLOG, 100).handler
                    (new LoggingHandler(LogLevel.DEBUG)).childHandler(new ChannelInitializer<SocketChannel>
                    () {
                @Override
                protected void initChannel(SocketChannel ch) throws Exception {
                    ch.pipeline().addLast(new StringEncoder()).addLast(new StringDecoder()).addLast(new
                            ServerHandler());
                }
            });
            Channel channel = bootstrap.bind(port).sync().channel();
            channel.closeFuture().sync();
        } catch (InterruptedException e) {
            e.printStackTrace();
        } finally {
            bossGroup.shutdownGracefully();
            workerGroup.shutdownGracefully();
        }


    }

    public void shutdown() {

        bossGroup.shutdownGracefully();
        workerGroup.shutdownGracefully();
    }


}
