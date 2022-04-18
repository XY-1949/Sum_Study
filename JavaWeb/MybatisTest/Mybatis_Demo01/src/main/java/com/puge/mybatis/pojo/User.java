package com.puge.mybatis.pojo;

import java.util.Date;
import java.util.Objects;

/**
 * @author Yinsd
 * @version 1.0
 * Only code and time last forever
 * @date 2022/4/18 5:04 PM
 */
public class User {

    private Integer id;

    private String name;

    private String sex;

    private String age;

    private String address;

    private String email;

    private String password;

    private Date gmtCreate;

    private Date gmtModifity;




    public User(Integer id, String name, String sex, String age, String address, String email, String password, Date gmtCreate, Date gmtModifity) {
        this.id = id;
        this.name = name;
        this.sex = sex;
        this.age = age;
        this.address = address;
        this.email = email;
        this.password = password;
        this.gmtCreate = gmtCreate;
        this.gmtModifity = gmtModifity;
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

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public String getAge() {
        return age;
    }

    public void setAge(String age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getGmtCreate() {
        return gmtCreate;
    }

    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    public Date getGmtModifity() {
        return gmtModifity;
    }

    public void setGmtModifity(Date gmtModifity) {
        this.gmtModifity = gmtModifity;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        User user = (User) o;
        return Objects.equals(id, user.id) && Objects.equals(name, user.name) && Objects.equals(sex, user.sex) && Objects.equals(age, user.age) && Objects.equals(address, user.address) && Objects.equals(email, user.email) && Objects.equals(password, user.password) && Objects.equals(gmtCreate, user.gmtCreate) && Objects.equals(gmtModifity, user.gmtModifity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name, sex, age, address, email, password, gmtCreate, gmtModifity);
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex='" + sex + '\'' +
                ", age='" + age + '\'' +
                ", address='" + address + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", gmtCreate=" + gmtCreate +
                ", gmtModifity=" + gmtModifity +
                '}';
    }
}
