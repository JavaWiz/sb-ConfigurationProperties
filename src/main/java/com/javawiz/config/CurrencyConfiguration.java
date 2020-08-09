package com.javawiz.config;

import com.javawiz.model.Currency;
import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.List;
import java.util.Map;

@Component
@ConfigurationProperties(prefix = "currencies")
@Data
public class CurrencyConfiguration {
    private Map<String, List<Currency>> mappings;
}