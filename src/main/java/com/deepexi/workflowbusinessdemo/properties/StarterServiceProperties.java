package com.deepexi.workflowbusinessdemo.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

/**
 * @author by zhougl
 * @classname StarterServiceProperties
 * @desc TODO
 * @date 2019/6/22 16:30
 */
@Configuration
@ConfigurationProperties("example.service")
public class StarterServiceProperties {
    private String config;

    public void setConfig(String config) {
        this.config = config;
    }

    public String getConfig() {
        return config;
    }
}
