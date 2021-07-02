package com.vitalmix.model.spring_config;

import org.springframework.web.servlet.support.AbstractAnnotationConfigDispatcherServletInitializer;

public class SpringMvcDispatcherServletInitializer extends AbstractAnnotationConfigDispatcherServletInitializer {

    protected Class<?>[] getRootConfigClasses() {
        return null;
    }

    protected Class<?>[] getServletConfigClasses() { return new Class[] { com.vitalmix.model.spring_config.AppConfig.class };
    }

    protected String[] getServletMappings() {
        return new String[] { "/" };
    }
}
