package com.deepexi.workflowbusinessdemo.service;

import org.springframework.util.StringUtils;

/**
 * @author by zhougl
 * @classname StarterService
 * @desc TODO
 * @date 2019/6/22 16:29
 */
public class StarterService {
    private String config;

    public StarterService(String config) {
        this.config = config;
    }

    public String[] split(String separatorChar) {
        return StringUtils.split(this.config, separatorChar);
    }
}
