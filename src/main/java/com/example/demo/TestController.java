package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Date;

@RestController
@RequestMapping("/api")
public class TestController {
    private record TestResponse (String message, String date) {}

    @GetMapping("/test")
    public TestResponse getTest() {
        DateTimeFormatter dtf = DateTimeFormatter.BASIC_ISO_DATE;
        return new TestResponse("Hello world", LocalDateTime.now().format(dtf));
    }

    @GetMapping("/test/ping")
    public TestResponse getPing() {
        DateTimeFormatter dtf = DateTimeFormatter.BASIC_ISO_DATE;
        return new TestResponse("PONG", LocalDateTime.now().format(dtf));
    }
}
