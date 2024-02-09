package com.springmvc.mvc.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import com.springmvc.mvc.Service.ProductService;
import com.springmvc.mvc.entity.ProductInfo;

@Controller
public class ProductController {
	
	private ProductService productser;

	public ProductController(ProductService productser) {
		super();
		this.productser = productser;
	}
	
	
	@GetMapping("/GetOrders")
	public String getorders(Model mod) {
		mod.addAttribute("orders",productser.getAllOrderInfo());
		return "orders";
		
	}
	
	//access Insert form .
	@GetMapping("/products/new")
	public String createProduct(Model mod)
		{
			ProductInfo product = new ProductInfo();
			mod.addAttribute("product",product);
			return "create_product";
		}
	
	//Insert API method 
	//@ModelAttribute is an annotation that binds a method parameter or method return value to a named model attribute,
	//and then exposes it to a web view.
	@PostMapping("/products/save")
	public String saveProduct(@ModelAttribute("product") ProductInfo product)
		{
			productser.saveOrder(product);
			
			return "redirect:/GetOrders";
			
		}
	@GetMapping("/showUpdateForm/{id}")
	public String showUpdateForm(@PathVariable (value="id") long id , Model mod) {
		ProductInfo product = productser.getProductById(id);
		mod.addAttribute("product", product);
		return "edit_product";
		
	}
	 
//	public String editProductForm(@PathVariable int id , Model mod)
//	{
//		mod.addAttribute("product", productser.getProductById(id));
//		return "edit_product";
//		
//	}
	
//	@PostMapping("/products/{id}")
//	public String updateProduct(@PathVariable long id , @ModelAttribute("product") ProductInfo product , Model mod)
//	{
//		ProductInfo existingProduct = productser.getProductById(id);
//		existingProduct.getId();
//		existingProduct.setPname(product.getPname());
//		existingProduct.setCustId(product.getCustId());
//		existingProduct.setLocation(product.getLocation());
//		existingProduct.setOrderStatus(product.getOrderStatus());
//		existingProduct.setCost(product.getCost());
//		
//		productser.updateProduct(existingProduct);
//		return "redirect:/GetOrders";
//		
//	}
	
	    //Delete Data by id
	    @GetMapping("/deleteProduct/{id}")
		public String deleteProduct(@PathVariable (value="id")long id) {
	    	productser.deleteProductById(id);
	    	return "redirect:/GetOrders";
	    }
		
}
