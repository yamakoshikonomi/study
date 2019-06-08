package com.example.demo.service;

import org.springframework.stereotype.Service;

import com.example.demo.dto.ColorCode;

@Service
public class ColorService {
	//public戻す型(引数・データもらうところ)
	public String paint(String name) {
		String resColor = "";
		if (name.equals("kirishima")) {
			resColor = "黒";
		} else if (name.equals("yamakoshi")){
			resColor = "青";
		} else {
			resColor = "黄";
		}
		//戻す型と同じ型の変数返す
		return resColor;
	}
	public String draw(ColorCode colorcode) {

		return "#" + colorcode.getCodeR() + colorcode.getCodeG() + colorcode.getCodeB();
	}
}
