package fengjiuxin.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.springboot.config.Result;
import fengjiuxin.demo.entity.Student;
import fengjiuxin.demo.entity.User;
import fengjiuxin.demo.mapper.StudentMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class StudentServiceImp implements StudentService{
    @Autowired
    StudentMapper studentMapper;
    @Override
    public void test() {
        System.out.println("this is studentservicetest,successfull!!");
    }

    @Override
    public Result<Student> login(User user) {
        LambdaQueryWrapper<Student> wrapper = Wrappers.<Student>lambdaQuery();
        wrapper.eq(Student::getStudentId,user.getID()).eq(Student::getPass,user.getPass());
        Student student=studentMapper.selectOne(wrapper);
        if (student==null){
            Result<Student> result=new Result<Student>();
            result.setCode("1");
            result.setMsg("失败");
            return result;
        }else {
            Result<Student> result=new Result<Student>();
            result.setCode("0");
            result.setMsg("成功");
            System.out.println("学生登录成功");
            return result;
        }
    }

    @Override
    public Result<Student> update(Student student) {
        LambdaQueryWrapper<Student> wrapper = Wrappers.<Student>lambdaQuery();
        wrapper.eq(Student::getStudentId,student.getStudentId());
        Student student1 = studentMapper.selectOne(wrapper);
        if (student1!=null){
            studentMapper.updateById(student);
        }
        return  Result.success();

    }

    @Override
    public void logout() {
        System.out.println("恭喜退出成功");
    }

}
