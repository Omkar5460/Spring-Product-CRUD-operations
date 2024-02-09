package com.springmvc.mvc.Service;

import java.util.List;

import com.springmvc.mvc.entity.ProductInfo;

public interface ProductService {

	List<ProductInfo> getAllOrderInfo();
	
	ProductInfo saveOrder(ProductInfo order); 
	
	ProductInfo getProductById(long id);
	
	ProductInfo updateProduct(ProductInfo product);
	
	void deleteProductById(long id);
}

