package fengjiuxin.demo.service;

import com.example.springboot.config.Result;
import fengjiuxin.demo.entity.Teacher;
import fengjiuxin.demo.entity.User;
import org.springframework.stereotype.Service;

@Service
public interface TeacherService {
    public Result<Teacher> login(User user);
}
