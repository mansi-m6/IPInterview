package com.jpa.test.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.jpa.test.Entity.Product;
import com.jpa.test.Services.ProductService;

@RestController
@EntityScan("com.jpa.test.Entity")
public class ProductController {
	@Autowired
	ProductService service;
	
	@PostMapping("/SaveProductItem")
	public String saveProduct(@RequestBody Product p)
	{
		
		service.addProduct(p);
		return "Product is added";
	}
	@GetMapping("/Products")
	public List<Product> getAllProducts()
	{
		return service.getAllProducts();
	}
	
	@GetMapping("/Product/{id}")
	public Product getProductItem(@PathVariable int id)
	{
		Product p1 = service.getProductById(id);
		return p1;
	}
	
	@DeleteMapping("/Product/{id}")
	public String deleteProductItem(@PathVariable int id)
	{
		return service.deleteProductById(id);
		
	}
	
	@PutMapping("/UpdateProduct/{id}")
	public String updateProductItem(@PathVariable int id,@RequestBody Product p)
	{
		return service.updateProduct(id, p);
		
	}
	
}
