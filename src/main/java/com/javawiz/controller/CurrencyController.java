package com.javawiz.controller;

import com.javawiz.config.CurrencyConfiguration;
import com.javawiz.model.Currency;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@RestController
public class CurrencyController {

    private final CurrencyConfiguration currencyConfiguration;

    @GetMapping("/currency/{code}")
    public List<Currency> getCurrency(@PathVariable("code") String code){
        log.info("Retrieving currency details with code : {}", code);
        return currencyConfiguration.getMappings().get(code);
    }

    @GetMapping("/currency")
    public List<Currency> getCurrencyRP(@RequestParam String code){
        log.info("Retrieving currency details with code : {}", code);
        return currencyConfiguration.getMappings().get(code);
    }
}
