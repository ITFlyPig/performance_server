package com.wangyuelin.app;

import org.springframework.boot.web.servlet.ServletContextInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.socket.config.annotation.EnableWebSocket;
import org.springframework.web.socket.server.standard.ServerEndpointExporter;

import javax.servlet.ServletContext;


/**
 * 开启WebSocket支持websocket自动断开连接
 */
@Configuration
@EnableWebSocket
public class WebSocketConfig implements ServletContextInitializer {

    @Bean
    public ServerEndpointExporter serverEndpointExporter() {
        return new ServerEndpointExporter();
    }


    @Override
    public void onStartup(ServletContext servletContext) {
        //解决客户端发送文本有点长，使用默认的textBufferSize  Springboot会直接断开连接的问题
        servletContext.setInitParameter("org.apache.tomcat.websocket.textBufferSize","402400");

    }
}
