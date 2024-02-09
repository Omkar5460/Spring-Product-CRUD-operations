package com.springmvc.mvc.Repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.springmvc.mvc.entity.ProductInfo;

public interface ProductRepository extends JpaRepository<ProductInfo, Long> {

}
