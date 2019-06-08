package com.example.demo.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.UserDto;
import com.example.demo.entity.User;
import com.example.demo.service.UserService;

@CrossOrigin() // ドメイン跨がないようにする
@RestController // 情報だけを返す(ページ丸ごと返す場合はコントローラーを使う)
public class UserCntoroller {
	@Autowired
    //private クラス名 変数名;
	private UserService userService;


	// 接続元からのリクエストをマッピングする(パスとメソッドでどの処理が動くのかマッピングする)
	@RequestMapping(path = "/user", method = GET)
	public User read(@RequestParam("id") int id) {
		//Serviceに渡した結果を返す
		//String resColor = colorservice.paint(name);（長い時はこっちを使うことが多い）
		return userService.read(id);
	}

	@RequestMapping(path = "/user", method = POST)
	public void create(@RequestBody UserDto userDto) {
		userService.create(userDto);
		//戻すものなくて終了したい時
		//return;
	}

	@RequestMapping(path = "/user", method = PATCH )
	public void update(@RequestBody UserDto userDto) {
		userService.update(userDto);
		//戻すものなくて終了したい時
		//return;
	}

	@RequestMapping(path = "/user", method = DELETE )
	public void delete(@RequestParam("id") int id) {
		userService.delete(id);
		//戻すものなくて終了したい時
		//return;
	}

}
