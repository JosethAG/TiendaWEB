package com.tienda;

import java.util.Locale;
import org.springframework.context.MessageSource;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.support.ResourceBundleMessageSource;
import org.springframework.web.servlet.LocaleResolver;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;
import org.springframework.web.servlet.i18n.LocaleChangeInterceptor;
import org.springframework.web.servlet.i18n.SessionLocaleResolver;

@Configuration
public class ProjectConfig implements WebMvcConfigurer{
    
    // Los siguientes metodos son para incorporar el tema de internacionalizacion en el proyecto
    
    //LocalResolver se utiliza para crear una sesion de cambio de idioma
    
    @Bean
    public LocaleResolver localResolver(){
        var slr = new SessionLocaleResolver();
        slr.setDefaultLocale(Locale.getDefault());
        slr.setLocaleAttributeName("session.current.locale");
        slr.setTimeZoneAttributeName("session.current.timezone");
        return slr;
    }
    
    //localChangeInterceptor se usa para crear un interseptor de cambio de idioma
    
    @Bean
    public LocaleChangeInterceptor localChangeinterceptor(){
        var lci = new LocaleChangeInterceptor();
        lci.setParamName("lang");
        return lci;
    } 
    
    @Override
    public void addInterceptors(InterceptorRegistry registro){
        registro.addInterceptor(localChangeinterceptor());
    }
}
