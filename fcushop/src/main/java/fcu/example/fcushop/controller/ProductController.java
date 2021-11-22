package fcu.example.fcushop.controller;


import fcu.example.fcushop.model.Product;
import fcu.example.fcushop.service.ProductService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * java.
 */
@RestController
public class ProductController {

  @Autowired
  ProductService productManager;

  @GetMapping("/products")
  public List<Product> getproducts() {
    return productManager.getProducts();
  }
}
