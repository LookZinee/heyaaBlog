package cn.heyaa.heyaaBlog.util;

import java.io.Serializable;

/**
 * 定义一个通用的返回对象
 */
public class Res implements Serializable {
    private static final long serialVersionUID = 1L;

    private final static Boolean success = true;
    private final static Boolean error   = false;

    private String  msg;    //信息
    private Boolean flag;   //是否正常

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public Boolean getFlag() {
        return flag;
    }

    public void setFlag(Boolean flag) {
        this.flag = flag;
    }

    Res(Boolean flag,String msg){
        this.flag = flag;
        this.msg  = msg;
    }

    //返回成功
    public static Res suc(String meg){
        return new Res(Res.success,meg);
    }

    //返回成功
    public static Res suc(){
        return new Res(Res.success,null);
    }

    //返回错误
    public static Res err(String meg){
        return new Res(Res.error,meg);
    }
}
