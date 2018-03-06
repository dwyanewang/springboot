/**
 * CopyRight (C)  2017-2018   武汉文思特信息工程有限公司
 * Author : WangWei
 * CreateTime : 2018/02/12 15:40
 * ProjectName : springboot
 * Description : 学生实体类
 * Version : V1.0
 */
package com.example.springboot;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class Student {
    @Id
    @GeneratedValue
    @Column(name = "sid")
    private Integer id;
    @Column(name = "sname",length = 20)
    private String name;
    @Column(length = 2)
    private String sex;

    public Student() {
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

}
