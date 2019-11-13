package com.krasikov.config;

import com.fasterxml.jackson.databind.ObjectMapper;
import com.fasterxml.jackson.databind.SerializationFeature;
import com.krasikov.domain.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.*;
import org.springframework.core.env.Environment;
import org.springframework.http.converter.HttpMessageConverter;
import org.springframework.http.converter.json.MappingJackson2HttpMessageConverter;
import org.springframework.orm.hibernate5.LocalSessionFactoryBean;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurationSupport;

import java.util.List;
import java.util.Properties;

import static org.hibernate.cfg.Environment.*;

@Configuration
@PropertySource("classpath:application.properties")
@EnableWebMvc
@ComponentScan("com.krasikov")
public class WebConfig extends WebMvcConfigurationSupport {

    @Autowired
    Environment env;

    @Bean
    public LocalSessionFactoryBean getSessionFactory() {
        LocalSessionFactoryBean factoryBean = new LocalSessionFactoryBean();

        Properties props = new Properties();

        // Setting JDBC properties
        props.put(DIALECT, env.getProperty("hibernate.dialect"));
        props.put(DRIVER, env.getProperty("hibernate.connection.driver_class"));
        props.put(URL, env.getProperty("hibernate.connection.url"));
        props.put(USER, env.getProperty("hibernate.connection.username"));
        props.put(PASS, env.getProperty("hibernate.connection.password"));

        // Setting Hibernate properties
        props.put(SHOW_SQL, env.getProperty("show_sql"));
        props.put(HBM2DDL_AUTO, env.getProperty("hbm2ddl.auto"));

        factoryBean.setHibernateProperties(props);
        factoryBean.setAnnotatedClasses(Client.class, ContractForNumber.class, MobileNumber.class, Option.class, Tariff.class, Worker.class);

        return factoryBean;
    }

    @Override
    protected void extendMessageConverters(List<HttpMessageConverter<?>> converters) {
        converters.forEach((HttpMessageConverter<?> converter) -> {
            if (converter instanceof MappingJackson2HttpMessageConverter) {
                final MappingJackson2HttpMessageConverter jsonMessageConverter = (MappingJackson2HttpMessageConverter) converter;
                final ObjectMapper objectMapper = jsonMessageConverter.getObjectMapper();
                objectMapper.disable(SerializationFeature.WRITE_DATES_AS_TIMESTAMPS);
            }
        });
        super.configureMessageConverters(converters);
    }
}
