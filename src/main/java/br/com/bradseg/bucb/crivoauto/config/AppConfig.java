package br.com.bradseg.bucb.crivoauto.config;

import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.annotation.PostConstruct;


@Slf4j
@Configuration
@EnableWebMvc
public class AppConfig implements WebMvcConfigurer {

    private final Environment env;

    @Value("${simulationMode:false}")
    private boolean simulationMode;

    @Autowired
    public AppConfig(Environment env) {
        this.env = env;
    }

    @PostConstruct
    public void logEnvironmentVariables() {
        log.info("variáveis de ambiente recuperadas...");
        log.info("bucb_experian_url: {}", env.getProperty("bucb_experian_url"));

        if (simulationMode) {
            log.warn("Serviço está sendo executado em modo simulação");
        }
    }

    @Override
    public void addResourceHandlers(ResourceHandlerRegistry registry) {
        registry.addResourceHandler("/documentation/**").addResourceLocations("classpath:/documentation/");
    }

    @Bean
    public boolean isSimulationMode() {
        return simulationMode;
    }

    public void setSimulationMode(boolean simulationMode) {
        this.simulationMode = simulationMode;
    }

}
