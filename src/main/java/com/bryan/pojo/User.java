package com.bryan.pojo;

/**
 * ClassName: User
 * Package: com.bryan.pojo
 * Description:
 *
 * @Author: Bryan Long
 * @Create: 2024/9/17 - 14:57
 * @Version: v1.0
 */

public class User {
    private int id;
    private String name;
    private String password;

    public User() {

    }

    public User(int id, String name, String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }

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
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "User [id=" + id + ", name=" + name + ", password=" + password + "]";
    }
}

