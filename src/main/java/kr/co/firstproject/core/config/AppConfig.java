package kr.co.firstproject.core.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Controller;

@Configuration
@ComponentScan(basePackages = {"kr.co.firstproject"},excludeFilters = {@ComponentScan.Filter(Controller.class)})
public class AppConfig {
}
