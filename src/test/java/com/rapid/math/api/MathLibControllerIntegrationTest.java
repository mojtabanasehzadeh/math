package com.rapid.math.api;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.result.MockMvcResultMatchers;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class MathLibControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetFactorial() throws Exception {
        mockMvc.perform(get("/rapid/api/factorial/5"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("120"));
    }

    @Test
    public void testGetFactorialWithZero() throws Exception {
        mockMvc.perform(get("/rapid/api/factorial/0"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("1"));
    }

    @Test
    public void testGetUnevenFactorial() throws Exception {
        mockMvc.perform(get("/rapid/api/factorial/uneven/9"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("945"));
    }

    @Test
    public void testGetSquareFactorial() throws Exception {
        mockMvc.perform(get("/rapid/api/factorial/square/4"))
                .andExpect(status().isOk())
                .andExpect(MockMvcResultMatchers.content().string("576"));
    }
}