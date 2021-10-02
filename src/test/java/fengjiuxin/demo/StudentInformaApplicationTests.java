package fengjiuxin.demo;

import fengjiuxin.demo.controller.UserController;
import fengjiuxin.demo.entity.User;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class StudentInformaApplicationTests {

    @Autowired
    UserController userController;
    @Test
    void contextLoads() {
    }
    @Test
    public void TestMethod(){
        userController.login(new User("201900303043","123","student"));
    }

}
