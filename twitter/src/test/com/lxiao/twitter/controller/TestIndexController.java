package com.lxiao.twitter.controller;

import org.junit.Test;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;
import static org.springframework.test.web.servlet.setup.MockMvcBuilders.*;

public class TestIndexController {
    @Test
    public void testIndex() throws Exception {
        IndexController indexController = new IndexController();
        MockMvc mockMvc = standaloneSetup(indexController).build();
        mockMvc.perform(get("/")).andExpect(view().name("index"));
    }
}
