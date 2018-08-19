package cn.heyaa.heyaaBlog.model;

import java.io.Serializable;
import java.util.Date;

/**
 * 用户 model
 */
public class UserModel implements Serializable {
    private static final long serialVersionUID = 1L;

    private Long    id;         //主键id
    private String  userName;   //用户姓名
    private String  userCode;   //用户CODE（唯一）
    private String  nickName;   //用户昵称
    private String  account;    //登录账号
    private String  password;   //登录密码
    private String  mail;       //邮箱
    private Date    createTime; //注册时间
    private Integer stat;       //账号状态
    private Long    version;    //版本号

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Integer getStat() {
        return stat;
    }

    public void setStat(Integer stat) {
        this.stat = stat;
    }

    public Long getVersion() {
        return version;
    }

    public void setVersion(Long version) {
        this.version = version;
    }

    public String getUserCode() {
        return userCode;
    }

    public void setUserCode(String userCode) {
        this.userCode = userCode;
    }

    public String toString(){
        return "{userName : '"+ this.getUserName() +"',userCode : '"+ this.getUserCode() +"'}";
    }
}
