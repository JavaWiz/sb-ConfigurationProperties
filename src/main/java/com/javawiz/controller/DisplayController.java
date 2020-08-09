package com.javawiz.controller;

import com.javawiz.config.CurrencyConfiguration;
import com.javawiz.model.Currency;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;
import java.util.Map;

@Controller
@Slf4j
@RequiredArgsConstructor
public class DisplayController {
    private final CurrencyConfiguration currencyConfiguration;

    @RequestMapping("/")
    public String welcome(Map<String, Object> model) {
        Map<String, List<Currency>> map = currencyConfiguration.getMappings();
        log.info("{}", map);
        model.put("map", map);
        return "welcome";
    }
}
