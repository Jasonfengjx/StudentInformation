package fengjiuxin.demo.service;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.core.toolkit.Wrappers;
import com.example.springboot.config.Result;
import fengjiuxin.demo.entity.Student;
import fengjiuxin.demo.entity.Teacher;
import fengjiuxin.demo.entity.User;
import fengjiuxin.demo.mapper.TeacherMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class TeacherServiceImp implements TeacherService{
    @Autowired
    TeacherMapper teacherMapper;
    @Override
    public Result<Teacher> login(User user) {
        LambdaQueryWrapper<Teacher> wrapper = Wrappers.<Teacher>lambdaQuery();
        wrapper.eq(Teacher::getTeacherId,user.getID()).eq(Teacher::getPass,user.getPass());
        Teacher teacher= (Teacher) teacherMapper.selectOne(wrapper);
        if (teacher==null){
            Result<Teacher> result=new Result<Teacher>();
            result.setCode("1");
            result.setMsg("失败");
            return result;
        }else {
            Result<Teacher> result=new Result<Teacher>();
            result.setCode("0");
            result.setMsg("成功");
            return result;
        }
    }


}
