package com.example.demo.mapper;

//
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;

@Component
@Mapper
//@Param(変数)　SQLで使うための準備
public interface UserMapper{
    User read(@Param("id") int Id);

    void create(@Param("userDto") UserDto user);

    void update(@Param("userDto") UserDto user);

    void delete(@Param("id") int Id);
}