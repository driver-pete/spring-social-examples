package net.petrikainulainen.spring.social.signinmvc.config;


import java.util.EnumSet;

import javax.servlet.DispatcherType;
import javax.servlet.Filter;
import javax.servlet.FilterRegistration;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.web.filter.CharacterEncodingFilter;
import org.sitemesh.config.ConfigurableSiteMeshFilter;

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
    
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        
//        if (true)
//        {
//            throw new ServletException("sdfsdfsd");
//        }
//        
//        super.onStartup(servletContext);
//
//        EnumSet<DispatcherType> dispatcherTypes = EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD);
//        
//        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//        characterEncodingFilter.setEncoding("UTF-8");
//        characterEncodingFilter.setForceEncoding(true);
//
//        FilterRegistration.Dynamic characterEncoding = servletContext.addFilter("characterEncoding", characterEncodingFilter);
//        characterEncoding.addMappingForUrlPatterns(dispatcherTypes, true, "/*");
//
//        FilterRegistration.Dynamic sitemesh = servletContext.addFilter("sitemesh", new ConfigurableSiteMeshFilter());
//        sitemesh.addMappingForUrlPatterns(dispatcherTypes, true, "*.jsp");
//        
//    }

}

//import org.sitemesh.config.ConfigurableSiteMeshFilter;
//import org.springframework.web.WebApplicationInitializer;
//import org.springframework.web.context.ContextLoaderListener;
//import org.springframework.web.context.support.AnnotationConfigWebApplicationContext;
//import org.springframework.web.context.support.XmlWebApplicationContext;
//import org.springframework.web.filter.CharacterEncodingFilter;
//import org.springframework.web.filter.DelegatingFilterProxy;
//import org.springframework.web.servlet.DispatcherServlet;
//
//import javax.servlet.*;
//import java.util.EnumSet;
//
///**
// * @author Petri Kainulainen
// */
//public class ExampleApplicationConfig implements WebApplicationInitializer {
//    private static final String DISPATCHER_SERVLET_NAME = "dispatcher";
//    private static final String DISPATCHER_SERVLET_MAPPING = "/";
//
//    @Override
//    public void onStartup(ServletContext servletContext) throws ServletException {
//        //If you want to use the XML configuration, comment the following two lines out.
//        AnnotationConfigWebApplicationContext rootContext = new AnnotationConfigWebApplicationContext();
//        rootContext.register(ExampleApplicationContext.class);
//
//        //If you want to use the XML configuration, uncomment the following lines.
//        //XmlWebApplicationContext rootContext = new XmlWebApplicationContext();
//        //rootContext.setConfigLocation("classpath:exampleApplicationContext.xml");
//
//        ServletRegistration.Dynamic dispatcher = servletContext.addServlet(DISPATCHER_SERVLET_NAME, new DispatcherServlet(rootContext));
//        dispatcher.setLoadOnStartup(1);
//        dispatcher.addMapping(DISPATCHER_SERVLET_MAPPING);
//
//        EnumSet<DispatcherType> dispatcherTypes = EnumSet.of(DispatcherType.REQUEST, DispatcherType.FORWARD);
//
//        CharacterEncodingFilter characterEncodingFilter = new CharacterEncodingFilter();
//        characterEncodingFilter.setEncoding("UTF-8");
//        characterEncodingFilter.setForceEncoding(true);
//
//        FilterRegistration.Dynamic characterEncoding = servletContext.addFilter("characterEncoding", characterEncodingFilter);
//        characterEncoding.addMappingForUrlPatterns(dispatcherTypes, true, "/*");
//
//        FilterRegistration.Dynamic security = servletContext.addFilter("springSecurityFilterChain", new DelegatingFilterProxy());
//        security.addMappingForUrlPatterns(dispatcherTypes, true, "/*");
//
//        FilterRegistration.Dynamic sitemesh = servletContext.addFilter("sitemesh", new ConfigurableSiteMeshFilter());
//        sitemesh.addMappingForUrlPatterns(dispatcherTypes, true, "*.jsp");
//
//        servletContext.addListener(new ContextLoaderListener(rootContext));
//    }
//}


