package com.example;

import io.micronaut.http.annotation.*;

@Controller("/demo2")
public class Demo2Controller {

    @Get(uri="/", produces="text/plain")
    public String index() {
        return "Example Response";
    }
}