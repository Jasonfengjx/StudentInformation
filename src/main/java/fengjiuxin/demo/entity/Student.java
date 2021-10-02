package fengjiuxin.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Student {
    @TableId
    private String studentId;
    private String pass;
    private String name;
    private String phone;
    private Integer sex;
    private String address;
    private String birthday;
    private String email;
    private String identity;
    private String college;
    private String dept;
    private String profession;
}
