package net.petrikainulainen.spring.social.signinmvc.config;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;

@SpringBootApplication
public class ExampleApplicationConfig extends SpringBootServletInitializer {

    public static void main(String[] args) {
        SpringApplication.run(ExampleApplicationConfig.class, args);
    }
    
    /*
     * This method together with inheriting SpringBootServletInitializer makes the
     * application class support Servlet 3.0 interfaces so that it can be executed
     * in the external servlet container (e.g. Tomcat provided by Amazon)
     */
    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(ExampleApplicationConfig.class);
    }

}
