import com.github.pagehelper.Page;
import com.itcast.domain.Student;
import com.itcast.service.StudentService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.List;

/**
 * 学生业务逻辑层测试
 * @author yuzhaocai
 * @date 2018/8/16
 */
@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(value = {"classpath:applicationContext-core.xml"})
public class StudentServiceTest {

    @Autowired
    private StudentService studentService;

    @Test
    public void createStudentTest() {
        Student student = new Student();
        student.setName("zhengli");
        student.setSex(2);
        student.setBirthday(new Date());
        student.setClassId(1);
        int affected = studentService.createStudent(student);
        Assert.assertEquals(1, affected);
    }

    @Test
    public void getStudentTest() {
        Student student = studentService.getStudent(1);
        Assert.assertNotNull(student);
        Assert.assertEquals(Integer.valueOf(1), student.getClassId());
    }

    @Test
    public void getAllStudentTest() {
       List<Student> studentList = studentService.getAllStudents();
       Assert.assertEquals(1, studentList.size());
    }

    @Test
    public void getStudentsForClassTest() {
        List<Student> studentList = studentService.getStudentsForClass(1);
        System.out.println("size:" + studentList.size());
        studentList.forEach(student -> {
            System.out.println("student:" + student);
        });
    }

    @Test
    public void getAllStudentsPageable() {
        int pageNum = 1;int pageSize = 10;
        List<Student> list = studentService.getAllStudents(pageNum, pageSize);
        long total = ((Page)list).getTotal();
        System.out.println(list);
        System.out.println("total:" + total);
        list.forEach(s -> {
            System.out.println("s:" + s);
        });
    }

    @Test
    public void getStudentByClassIdPageable() {
        int pageNum = 1, pageSize = 10;
        int classId = 1;
        List<Student> list = studentService.getStudentsForClass(classId, pageNum, pageSize);
        System.out.println(list.size());
        System.out.println(list);
    }
}
