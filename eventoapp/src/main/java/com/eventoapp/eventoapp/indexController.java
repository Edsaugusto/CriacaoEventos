package com.eventoapp;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.requestmapping;

@controller
puclic class IndexController {

    @requestmapping("/")
    public String index(){
        return "Index";
    }
}