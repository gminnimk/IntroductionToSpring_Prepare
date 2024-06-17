package com.sparta.spring_prepare.controller;


// HTTP GET 요청을 매핑하기 위해 Spring의 GetMapping 애노테이션을 임포트합니다.
import org.springframework.web.bind.annotation.GetMapping;

// 이 클래스가 RESTful 웹 서비스의 컨트롤러임을 나타내기 위해 Spring의 RestController 애노테이션을 임포트합니다.
import org.springframework.web.bind.annotation.RestController;


// 이 클래스를 RESTful 웹 서비스의 컨트롤러로 지정합니다.
@RestController

public class HelloController {

    // "/api/hello" 경로로 들어오는 HTTP GET 요청을 처리하는 메서드를 정의합니다.
    @GetMapping("/api/hello")
    public String hello() {

        // 요청이 들어오면 "Hello World" 문자열을 응답으로 반환합니다.
        return "Hello World";
    }
}
