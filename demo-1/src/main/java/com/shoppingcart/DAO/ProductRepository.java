package com.shoppingcart.DAO;

import org.springframework.data.jpa.repository.JpaRepository;

import com.shoppingportal.model.ProductBean;

public interface ProductRepository extends JpaRepository<ProductBean, String> {

}
