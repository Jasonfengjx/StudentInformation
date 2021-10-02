package fengjiuxin.demo.entity;

import com.baomidou.mybatisplus.annotation.TableId;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class Teacher {
    @TableId
    private String teacherId;
    private String teacherName;
    private String pass;
    private String phone;
    private Integer sex;
    private String college;
}
