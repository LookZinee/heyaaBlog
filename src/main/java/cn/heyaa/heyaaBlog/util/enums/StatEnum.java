package cn.heyaa.heyaaBlog.util.enums;

import cn.heyaa.heyaaBlog.common.IsEnum;

public enum StatEnum {
    VALID   (1,"有效"),
    INVALID (2,"无效");

    private Integer code;
    private String  name;
    StatEnum(Integer code,String name){
        this.code = code;
        this.name = name;
    }
}
