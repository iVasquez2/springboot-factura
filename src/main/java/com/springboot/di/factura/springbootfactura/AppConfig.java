package com.springboot.di.factura.springbootfactura;

import java.util.Arrays;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.PropertySource;

import com.springboot.di.factura.springbootfactura.Models.Item;
import com.springboot.di.factura.springbootfactura.Models.Product;

@Configuration
@PropertySource(value="classpath:data.properties", encoding ="UTF-8")
public class AppConfig {

    
    @Bean    
    @Primary
    List<Item> itemsInvoice()
    {
        Product p1 = new Product("Camra de video", 800);
        Product p2 = new Product("Pantalla de 32", 1800);
       
        List<Item> items = Arrays.asList(new Item(p1, 2), new Item(p2, 3));
       
        return items;
    }

    @Bean
    List <Item> itemsInvoiceOffice()
    {
        Product p1 = new Product("Hojas impresora 100 pza", 50);
        Product p2 = new Product("Paquete lapiceros 25 pza", 100);
        Product p3 = new Product("Impresora HP", 4500);
        Product p4 = new Product("Cartuchos de tinta", 150);

        List <Item> items = Arrays.asList(
            new Item(p1,5), 
            new Item(p2, 5),
            new Item(p3, 1),
            new Item(p4, 8)
            );

        return items;
    }
}
