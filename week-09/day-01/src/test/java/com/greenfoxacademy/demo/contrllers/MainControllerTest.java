package com.greenfoxacademy.demo.contrllers;

import com.greenfoxacademy.demo.controllers.MainController;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit4.SpringRunner;
import org.springframework.test.web.servlet.MockMvc;

import java.nio.charset.Charset;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RunWith(SpringRunner.class)
@WebMvcTest(MainController.class)
public class MainControllerTest {

    private MediaType contentType = new MediaType(MediaType.APPLICATION_JSON.getType(),
            MediaType.APPLICATION_JSON.getSubtype(),
            Charset.forName("utf8"));


    @Autowired
    MockMvc mockMvc;


    @Test
    public void testMainLoad() throws Exception {
        mockMvc.perform(get("/"))
                .andExpect(status().isOk());
    }


    @Test
    public void testDoubling() throws Exception {
        mockMvc.perform(get("/doubling?input=2"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("result").value(4));
    }

    @Test
    public void testGreeter() throws Exception {
        mockMvc.perform(get("/greeter?name=Peter&title=SuperSaiyanGod"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("welcome_message").value("Oh, hi there Peter, my dear SuperSaiyanGod!"));
    }

    @Test
    public void testAppandA() throws Exception {
        mockMvc.perform(get("/appenda/{appended}", "kuty"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("appended").value("kutya"));
    }

    @Test
    public void testDoUntil()throws Exception{
        mockMvc.perform(post("/dountil/{action}","sum")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\" : \"5\"}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("result").value("15"));

        mockMvc.perform(post("/dountil/{action}","factor")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"until\" : \"5\"}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(contentType))
                .andExpect(jsonPath("result").value("120"));

    }
}
