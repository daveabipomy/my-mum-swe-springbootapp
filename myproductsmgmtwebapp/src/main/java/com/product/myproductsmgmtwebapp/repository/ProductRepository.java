package com.product.myproductsmgmtwebapp.repository;

import com.product.myproductsmgmtwebapp.model.Product;
import com.product.myproductsmgmtwebapp.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {
}
