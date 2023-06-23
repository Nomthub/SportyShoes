package com.ecommerce.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;

import com.ecommerce.Entity.*;
import com.ecommerce.Repository.*;

@Controller
public class ProductControl {
	@Autowired
	ProductRepo productRepository;
	
	 
	@GetMapping("/listProducts")
	public String getAllProducts(ModelMap map) {
		
		List<ProductEntity> list= productRepository.getAllProducts();
		map.addAttribute("list",list);
		
		return "products";
	}
}
