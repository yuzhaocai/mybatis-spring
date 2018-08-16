package com.itcast.mapper;

import com.itcast.domain.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

/**
 * 学员映射器
 * @author yuzhaocai
 * @date 2018/8/16
 */
@Repository
public interface StudentMapper extends Mapper<Student> {

    List<Student> selectByClassId(Integer classId);

    List<Student> selectAllPageable(@Param("page") int pageNum, @Param("size") int pageSize);

    List<Student> selectByClassIdPageable(@Param("classId") Integer classId, @Param("page") int pageNum, @Param("size") int pageSize);
}
