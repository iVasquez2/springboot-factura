package com.springboot.di.factura.springbootfactura.Models;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class invoice {

    @Autowired
    private Client client;
    @Value("${invoice.description.office}")
    private String description;
    @Autowired
    @Qualifier("itemsInvoiceOffice") //Permite la inyeccion de la segunda factura
    private List <Item> items;

    public Client getClient() {
        return client;
    }
    public void setClient(Client client) {
        this.client = client;
    }
    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }
    public List<Item> getItems() {
        return items;
    }
    public void setItems(List<Item> items) {
        this.items = items;
    }

    public int getTotal()
    {
        int total = 0;
        //Itineracion clasica con un ciclo for each
        for (Item item : items) {
            total += item.getImport(); 
        }

        //Itineracion con programacion funcional
        /*
         * int total = items.stream()
         * .map(item -> item.getImport())
         * .reduce(0, (sum, importe) -> sum + importe);
         */
        return total;
    }
}
