package com.wangyuelin.app.bean;

/**
 * 描述:演员的信息
 *
 * @outhor wangyuelin
 * @create 2018-06-11 下午2:50
 */
public class ActorBean {
    private int id;
    private String name;
    private String nickName;//翻译名
    private String avatar;//头像
    private String role;//饰演的角色

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    @Override
    public String toString() {
        StringBuffer buffer = new StringBuffer();
        buffer.append("[ name=").append(name).append("; avatar=").append(avatar).append("; role=").append(role).append("]");
        return buffer.toString();
    }
}