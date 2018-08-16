package com.itcast.service;

import com.itcast.domain.Student;

import java.util.List;

/**
 * @author yuht
 * @date 2018/8/16
 */
public interface StudentService {

    /**
     * 保存学生
     * @param student
     */
    int createStudent(Student student);

    /**
     * 更新学生
     * @param student
     * @return
     */
    int updateStudent(Student student);

    /**
     * 删除学生
     * @param id
     * @return
     */
    int deleteStudent(Integer id);

    /**
     * 查询学生
     * @param id
     * @return
     */
    Student getStudent(Integer id);

    /**
     * 获取所有的学生
     * @return
     */
    List<Student> getAllStudents();

    /**
     * 分页查询学生
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<Student> getAllStudents(int pageNum, int pageSize);

    /**
     * 获取班级的所有学生
     * @param classId
     * @return
     */
    List<Student> getStudentsForClass(Integer classId);

    /**
     * 分页获取班级的学生
     * @param classId
     * @param pageNum
     * @param pageSize
     * @return
     */
    List<Student> getStudentsForClass(Integer classId, int pageNum, int pageSize);

}
