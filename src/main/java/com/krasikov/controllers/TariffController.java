package com.krasikov.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/tariff")
public class TariffController {
    @RequestMapping(method = RequestMethod.GET)
    public String getTariffs() {
        return "check";
    }
}
