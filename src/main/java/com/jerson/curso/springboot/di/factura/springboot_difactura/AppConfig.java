package com.jerson.curso.springboot.di.factura.springboot_difactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.jerson.curso.springboot.di.factura.springboot_difactura.models.Item;
import com.jerson.curso.springboot.di.factura.springboot_difactura.models.Product;

@Configuration 
@PropertySource(value = "classpath:data.properties", encoding = "UTF-8") 
public class AppConfig {

    @Bean
    List<Item> itemsInvocice(){
        Product p1 = new Product("Camara Sony", 800);
        Product p2 = new Product("Biciclete Bianchi", 1200);
        return Arrays.asList(new Item(p1,2), new Item(p2,4));
    }
}
