package com.springboot.di.factura.springbootfactura.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.springboot.di.factura.springbootfactura.Models.invoice;

@RestController
@RequestMapping("/invoices")
public class InvoiceController {

    @Autowired
    private invoice invoice;

    @GetMapping("/show")
    public invoice show()
    {
        return invoice;
    }
}
