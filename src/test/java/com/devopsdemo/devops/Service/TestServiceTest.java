package com.devopsdemo.devops.Service;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(MockitoExtension.class)
class TestServiceTest {

    @InjectMocks
    TestService underTest;

//    @Test
//    void getTestMessage() {
//        String result = underTest.getTestMessage();
//        assertEquals("Hello World", result);
//    }


    @Test
    void getTestMessage_simulateFailure() {
        String result = underTest.getTestMessage();
        assertEquals("FAILING_PURPOSELY", result);
    }

    @Test
    void getTestGreetingMessage() {
        String name = "testName";
        String result = underTest.getTestGreetingMessage(name);
        assertEquals("Welcome to the world " + name, result);
    }
}