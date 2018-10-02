package com.greenfoxacademy.demo.Controller;

import com.greenfoxacademy.demo.controller.GuardianController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.jsonPath;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@RunWith(SpringRunner.class)
@WebMvcTest(GuardianController.class)
public class GuardianControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void grootTranslate_test() throws Exception {
        mockMvc.perform(get("/groot")
                .param("message", "message"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("received").value("message"))
                .andExpect(jsonPath("translated").value("I am groot"));

        mockMvc.perform(get("/groot"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("error").value("I am groot"));
    }

    @Test
    public void youndusArrowTest() throws Exception {
        mockMvc.perform(get("/yondu")
                .param("distance", String.valueOf(100.0))
                .param("time", String.valueOf(10.0)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("speed").value(10.0));

        mockMvc.perform(get("/yondu")
                .param("distance", String.valueOf(100.0)))
                .andExpect(status().isOk())
                .andExpect(jsonPath("error").value("Something went wrong!"));


        mockMvc.perform(get("/yondu"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("error").value("Something went wrong!"));
    }
}
