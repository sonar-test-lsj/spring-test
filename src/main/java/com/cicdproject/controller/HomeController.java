package com.cicdproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.net.InetAddress;
import java.net.UnknownHostException;

@Controller
public class HomeController {

    @GetMapping("/")
    public String index(Model model) {
        try {
            InetAddress inetAddress = InetAddress.getLocalHost();
            String serverIp = inetAddress.getHostAddress(); // 서버의 IP 주소 가져오기

            model.addAttribute("message", serverIp); // 뷰에 IP 주소 전달
        } catch (UnknownHostException e) {
            model.addAttribute("message", "IP 주소를 가져올 수 없습니다."); // 에러 발생 시 메시지 설정
        }

        return "index"; // index.html 파일로 이동
    }

}
