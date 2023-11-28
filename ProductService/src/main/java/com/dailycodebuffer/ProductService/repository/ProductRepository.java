package com.dailycodebuffer.ProductService.repository;

import com.dailycodebuffer.ProductService.entity.Product;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {
	
	@Query("select * from Product p where p.productId:=productId and p.price:=price")
	List<Product> getProduct(@Param("productId") long productId,@Param("price") long price);
	
}
