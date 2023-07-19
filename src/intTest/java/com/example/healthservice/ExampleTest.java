package com.example.healthservice;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.equalTo;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
public class ExampleTest {

    @Test
    void should_load_context() {
        assertThat(true, equalTo(true));
    }
}
