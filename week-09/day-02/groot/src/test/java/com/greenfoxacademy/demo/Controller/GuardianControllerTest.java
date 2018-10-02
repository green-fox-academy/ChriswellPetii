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
        .param("message","message"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("received").value("message"))
                .andExpect(jsonPath("translated").value("I am groot"));

        mockMvc.perform(get("/groot"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("error").value("I am groot"));
    }
}
