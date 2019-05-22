package com.zzd.myrpc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ImportResource;

/**
 * @author zhangzhidong
 * @since 2019/5/20
 */
@SpringBootApplication
@ImportResource(locations = {"classpath*:/rmi-rpc-server.xml"})
public class ServerStarter {

    public static void main(String[] args) {
        SpringApplication.run(ServerStarter.class);
    }
}
