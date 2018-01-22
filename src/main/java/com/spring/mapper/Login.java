package com.spring.mapper;

import com.spring.entity.User;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

public interface Login {
    @Select("select * from tb_user where username = #{username} and password = #{password}")
    public User login(@Param("username") String userName,@Param("password") String passWord);
}
