package com.jpa.test.Services;

import java.util.List;
import java.util.NoSuchElementException;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jpa.test.Entity.Product;
import com.jpa.test.Repository.ProductRepository;

@Service
@Transactional
public class ProductService {
	
	@Autowired
	ProductRepository repo;
	
	public Product addProduct(Product pro)
	{
		return repo.save(pro);
	}
	
	public String deleteProductById(int pid)
	{
		Product pObj = getProductById(pid);
		if(pObj==null)
		{
			return "Product is not found";
		}
		else
		{
		repo.deleteById(pid);
		return "Record is deleted";
		}
	}
	
	public Product getProductById(int pid)
	{
		 Product pro=null;
		 try {
			 Optional<Product> pr =repo.findById(pid);
			 if(pr.isPresent())
			 {
				 return pr.get();
			 }
		 }
		 catch(NoSuchElementException e)
		 {
			 System.out.println("No such record found");
		 }
		 
		 return pro;
	}
	
	
	
	public List<Product> getAllProducts()
	{
		return repo.findAll();
	}
	
	public String updateProduct(int pid, Product pro)
	{
		Product existingProduct = getProductById(pid);
		if(existingProduct==null)
		{
			return "Product is not found for updation...";
		}
		else
		{
			repo.save(pro);
			return "Product is Updated";
		}
		
	}

}
