package org.javatop.pojo;

import java.io.Serializable;

/**
 * @author : Leo
 * @version 1.0
 * @date 2023-10-17 21:22
 * @description : 用户实体类
 */
public class User  implements Serializable {
   private Integer id;

   private String name;

   private String password;


    public User() {
    }

    public User(Integer id, String name,String password) {
        this.id = id;
        this.name = name;
        this.password = password;
    }


    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
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
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
