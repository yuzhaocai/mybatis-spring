package com.itcast.service.impl;

import com.itcast.domain.Student;
import com.itcast.mapper.StudentMapper;
import com.itcast.service.StudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * 学生业务逻辑层
 * @author yuzhaocai
 * @date 2018/8/16
 */
@Service
@Transactional
public class StudentServiceImpl implements StudentService {

    @Autowired
    private StudentMapper studentMapper;

    @Override
    public int createStudent(Student student) {
        return studentMapper.insert(student);
    }

    @Override
    public int updateStudent(Student student) {
        return studentMapper.updateByPrimaryKey(student);
    }

    @Override
    public int deleteStudent(Integer id) {
        return studentMapper.deleteByPrimaryKey(id);
    }

    @Override
    @Transactional(readOnly = true)
    public Student getStudent(Integer id) {
        return studentMapper.selectByPrimaryKey(id);
    }

    @Override
    @Transactional(readOnly = true)
    public List<Student> getAllStudents() {
        return studentMapper.selectAll();
    }

    @Override
    @Transactional
    public List<Student> getAllStudents(int pageNum, int pageSize) {
        return studentMapper.selectAllPageable(pageNum, pageSize);
    }

    @Override
    public List<Student> getStudentsForClass(Integer classId) {
        return studentMapper.selectByClassId(classId);
    }

    @Override
    public List<Student> getStudentsForClass(Integer classId, int pageNum, int pageSize) {
        return studentMapper.selectByClassIdPageable(classId, pageNum, pageSize);
    }
}
