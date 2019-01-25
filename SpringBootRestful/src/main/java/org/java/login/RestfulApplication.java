package org.java.login;



import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RestfulApplication extends SpringBootServletInitializer {
	
	/**
	 * Configuracion de servlet para web
	 */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(RestfulApplication.class);
    }

    /**
     * Autorun de Spring Boot
     * @param args
     */
    public static void main(String[] args){
        SpringApplication.run(RestfulApplication.class, args);
    }
}

