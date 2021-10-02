package fengjiuxin.demo.service;

import com.example.springboot.config.Result;
import fengjiuxin.demo.entity.Student;
import fengjiuxin.demo.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface StudentService {
    public void test();
    public Result<Student> login(User user);
    public Result<Student> update(Student student);
    public void logout();
}
