package ru.gb.trishkin.springintegration.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
@ImportResource("/integration/http-sells-integration.xml")
public class SellIntegrationConfig {
}
