package com.zhougl.springbootrocketmqdemo.domain;

import lombok.Data;
import lombok.EqualsAndHashCode;

import java.io.Serializable;

@Data
@EqualsAndHashCode
public class User implements Serializable {
    private static final long serialVersionUID = 7501038860333344143L;
    private String loginName;
    private String pwd;
}
