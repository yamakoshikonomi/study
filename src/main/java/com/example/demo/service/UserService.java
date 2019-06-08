package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.mapper.UserMapper;

@Service

public class UserService {

	@Autowired
	//private クラス名 変数名;
	private UserMapper userMapper;

	//public戻す型(引数・データもらうところ)
	public User read(int id) {
		return userMapper.read(id);

	}


	public void create(UserDto userDto) {
		userMapper.create(userDto);

	}

	public void update(UserDto userDto) {
		userMapper.update(userDto);

	}

	public void delete(int id) {
		userMapper.delete(id);

	}

}
