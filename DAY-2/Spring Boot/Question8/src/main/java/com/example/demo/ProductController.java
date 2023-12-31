package com.example.demo;

import java.util.List;
import java.util.Optional;

 

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

 

@RestController
public class ProductController {
    @Autowired
    private ProductService productService;
    @RequestMapping("/product")
    public List<Product> getAllProduct(){
        return productService.getAllProduct();
    }
    @RequestMapping(method=RequestMethod.POST, value="/product")
    public void addTopic(@RequestBody Product product) {
        productService.addProduct(product);
    }
    @RequestMapping("/product/{id}")
    public Optional<Product> getOrder(@PathVariable String id){
        return (productService).getProduct(id);
    }
    @RequestMapping(method=RequestMethod.PUT, value="/product/{id}")
    public void updateOrder(@RequestBody Product product, @PathVariable String id) {
        productService.updateProduct(product);
    }
    @RequestMapping(method=RequestMethod.DELETE, value="/product/{id}")
    public void deleteOrder(@PathVariable String id) {
        productService.deleteProduct(id);
    }

 

}