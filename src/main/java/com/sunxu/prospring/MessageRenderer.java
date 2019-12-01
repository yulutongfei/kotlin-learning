package com.sunxu.prospring;

/**
 * @Author 孙许
 * @Date 2019/11/30 20:01
 * @Description
 */
public interface MessageRenderer {
    void render();

    void setMessageProvider(MessageProvider provider);

    MessageProvider getMessageProvider();
}
