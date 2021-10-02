package fengjiuxin.demo.controller;

import com.example.springboot.config.Result;
import fengjiuxin.demo.entity.Student;
import fengjiuxin.demo.entity.Teacher;
import fengjiuxin.demo.entity.User;
import fengjiuxin.demo.service.StudentService;
import fengjiuxin.demo.service.TeacherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class UserController {
    @Autowired
    StudentService studentService;
    @Autowired
    TeacherService teacherService;
    @PostMapping("/login")
    public Result<?> login(@RequestBody User user){
        if (user.getType()=="teacher"){
            return teacherService.login(user);
        }else {
            return studentService.login(user);
        }
    }
    @PostMapping("/update")
    public Result<?> update(@RequestBody Student student){
        return studentService.update(student);
    }




    public void test(){
        studentService.test();
    }
}
