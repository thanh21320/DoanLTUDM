package com.nuce.chatapp.config;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

@Component
public class StompConfig {

    @Autowired
    private Environment environment;

    private int disconnectDelay;

    private int httpMessageCacheSize;

    private int streamBytesLimit;

    @PostConstruct
    public void init() {
        this.disconnectDelay = environment
                .getProperty("chatapp.stomp.disconnectDelay", Integer.class, 900);

        this.httpMessageCacheSize = environment
                .getProperty("chatapp.stomp.httpMessageCacheSize", Integer.class, 1000);

        this.streamBytesLimit = environment
                .getProperty("chatapp.stomp.streamBytesLimit", Integer.class, 524288);
    }

    public int getDisconnectDelay() {
        return disconnectDelay;
    }

    public void setDisconnectDelay(int disconnectDelay) {
        this.disconnectDelay = disconnectDelay;
    }

    public int getHttpMessageCacheSize() {
        return httpMessageCacheSize;
    }

    public void setHttpMessageCacheSize(int httpMessageCacheSize) {
        this.httpMessageCacheSize = httpMessageCacheSize;
    }

    public int getStreamBytesLimit() {
        return streamBytesLimit;
    }

    public void setStreamBytesLimit(int streamBytesLimit) {
        this.streamBytesLimit = streamBytesLimit;
    }
}
