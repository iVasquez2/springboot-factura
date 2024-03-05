package com.springboot.di.factura.springbootfactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

import com.springboot.di.factura.springbootfactura.Models.Item;
import com.springboot.di.factura.springbootfactura.Models.Product;

@Configuration
@PropertySource("classpath:data.properties")
public class AppConfig {

    @Bean
    List<Item> itemsInvoice()
    {
        Product p1 = new Product("Camra de video", 800);
        Product p2 = new Product("Pantalla de 32", 1800);
       
        List<Item> items = Arrays.asList(new Item(p1, 2), new Item(p2, 3));
       
        return items;
    }
}
