package com.devopsdemo.devops.Controller;

import com.devopsdemo.devops.Service.TestService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@Slf4j
@RequestMapping("test")
@RestController
public class TestController {

    private final TestService testService;

    public TestController(TestService testService) {
        this.testService = testService;
    }

    @GetMapping
    public String testController() {
        return testService.getTestMessage();
    }

    @GetMapping(params = "name")
    public String testController(@RequestParam String name) {
        return testService.getTestGreetingMessage(name);
    }
}
