package com.shoppingcart.DAO;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.shoppingportal.model.ProductBean;

@Repository
public interface ProductRepository extends JpaRepository<ProductBean, Integer> {


}
