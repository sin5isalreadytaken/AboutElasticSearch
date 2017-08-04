package com.example.demo.factory;

import org.elasticsearch.transport.client.PreBuiltTransportClient;
import org.slf4j.Logger;
import org.elasticsearch.client.transport.TransportClient;
import org.elasticsearch.common.settings.Settings;
import org.elasticsearch.common.transport.InetSocketTransportAddress;
import org.slf4j.LoggerFactory;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * Created by wenxiangzhou214164 on 2017/8/4.
 */
public class ClientFactory {

    private static TransportClient client;
    private static final Logger logger = LoggerFactory.getLogger(ClientFactory.class);
    private static final String ip = "127.0.0.1";
    private static final int port = 9300;
    private static final String clusterName = "sin5";

    static {
//        Settings settings = Settings.settingsBuilder()
        Settings settings = Settings.builder()
                .put("cluster.name", clusterName)
                .put("client.transport.sniff", true)//默认每5秒嗅探节点
                .build();
        try {
//            client = TransportClient.builder().settings(settings).build();
            client = new PreBuiltTransportClient(settings).addTransportAddress(new InetSocketTransportAddress(InetAddress.getByName(ip), port));
        } catch (UnknownHostException e) {
            logger.error(e.getMessage(),e);
        }
    }

    public static synchronized TransportClient getClient() {
        return client;
    }
}
