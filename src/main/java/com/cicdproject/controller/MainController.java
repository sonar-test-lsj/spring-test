package com.cicdproject.controller;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import java.net.InetAddress;
import java.net.InetSocketAddress;
import java.net.UnknownHostException;

@RestController
public class MainController {

	@GetMapping("/hello")
	public String helloWorld(){
		return "CICD test";
	}

//	@GetMapping("/")
//	@ResponseStatus(HttpStatus.OK)
//	public String index(){
//
//		try {
//
//			// 서버의 호스트 이름과 IP 주소를 가져옴
//			InetAddress inetAddress = InetAddress.getLocalHost();
//			String serverIp = inetAddress.getHostAddress(); // 서버의 IP 주소
//			return "Server IP Address: " + serverIp;
//		} catch (UnknownHostException e) {
//			return "Unable to retrieve server IP address";
//		}
//
//	}


}
