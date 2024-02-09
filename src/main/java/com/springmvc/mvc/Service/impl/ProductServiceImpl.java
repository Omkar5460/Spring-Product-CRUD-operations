package com.springmvc.mvc.Service.impl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import com.springmvc.mvc.Repository.ProductRepository;
import com.springmvc.mvc.Service.ProductService;
import com.springmvc.mvc.entity.ProductInfo;

@Service
public class ProductServiceImpl implements ProductService {

	private ProductRepository productrepo;
	
	public ProductServiceImpl(ProductRepository productrepo) {
		super();
		this.productrepo = productrepo;
	}
	

	@Override
	public List<ProductInfo> getAllOrderInfo() {
		
		return productrepo.findAll();
	}


	@Override
	public ProductInfo saveOrder(ProductInfo order) {
		
		return productrepo.save(order);
	}


	@Override
	public ProductInfo getProductById(long id) {
		 Optional< ProductInfo> opt = productrepo.findById(id);
		 ProductInfo product = null;
		 if(opt.isPresent()) {
			 product = opt.get();
		 }
		 else {
			 throw new RuntimeException("Product Not Found");
		 }
		return product;
	}


	@Override
	public ProductInfo updateProduct(ProductInfo product) {
		
		return productrepo.save(product);
	}


	@Override
	public void deleteProductById(long id) {
		productrepo.deleteById(id);
		
	}


}
