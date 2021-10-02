package fengjiuxin.demo.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import fengjiuxin.demo.entity.Student;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface StudentMapper extends BaseMapper<Student> {
}
