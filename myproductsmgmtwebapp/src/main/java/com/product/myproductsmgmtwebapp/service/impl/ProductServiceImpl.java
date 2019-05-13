package com.product.myproductsmgmtwebapp.service.impl;

import com.product.myproductsmgmtwebapp.model.Product;
import com.product.myproductsmgmtwebapp.model.Student;
import com.product.myproductsmgmtwebapp.repository.ProductRepository;
import com.product.myproductsmgmtwebapp.repository.StudentRepository;
import com.product.myproductsmgmtwebapp.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service("productService")
public class ProductServiceImpl implements ProductService {

    @Autowired
    ProductRepository productRepository;


    public  List<Product> findProducts()
    {
        return productRepository.findAll();
    }

public  Product save(Product product)
{
    return productRepository.save(product);
}


   public  Product findOneProduct(Long id)
   {
       return  productRepository.findById(id).get();
   }

public  Product updateProduct(Product product)
{
    return productRepository.save(product);
}
    public void delete(Long id) {

        productRepository.deleteById(id);
    }

}
