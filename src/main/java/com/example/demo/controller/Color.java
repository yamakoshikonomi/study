package com.example.demo.controller;

import static org.springframework.web.bind.annotation.RequestMethod.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.dto.ColorCode;
import com.example.demo.service.ColorService;

@CrossOrigin() // ドメイン跨がないようにする
@RestController // 情報だけを返す(ページ丸ごと返す場合はコントローラーを使う)
public class Color {
	@Autowired
    //private クラス名 変数名;
	private ColorService colorservice;


	// 接続元からのリクエストをマッピングする(パスとメソッドでどの処理が動くのかマッピングする)
	@RequestMapping(path = "/color", method = GET)
	public String paint(@RequestParam("name") String name) {
		//Serviceに渡した結果を返す
		//String resColor = colorservice.paint(name);（長い時はこっちを使うことが多い）
		return colorservice.paint(name);
	}

	// 接続元からのリクエストをマッピングする(パスとメソッドでどの処理が動くのかマッピングする)
		@RequestMapping(path = "/color", method = POST)
		public String draw(@RequestBody ColorCode colorcode) {


			return colorservice.draw(colorcode);
		}

}
