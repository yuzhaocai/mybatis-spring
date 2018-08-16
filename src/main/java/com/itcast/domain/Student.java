package com.itcast.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

/**
 * 学生
 * @author yuzhoacai
 * @date 2018/8/16
 */
@Entity
@Table(name = "tb_student")
public class Student implements Serializable {

    private static final long serialVersionUID = -5840314209441223356L;

    /**
     * 学生id
     */
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    /**
     * 学生名称
     */
    private String name;

    /**
     * 性别
     */
    private Integer sex;

    /**
     * 生日
     */
    @Temporal(TemporalType.DATE)
    private Date birthday;

    /**
     * 班级id
     */
    @Column(name = "class_id")
    private Integer classId;

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

    public Integer getSex() {
        return sex;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public Integer getClassId() {
        return classId;
    }

    public void setClassId(Integer classId) {
        this.classId = classId;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", sex=" + sex +
                ", birthday=" + birthday +
                ", classId=" + classId +
                '}';
    }
}
