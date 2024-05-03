package com.ecommerce.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ecommerce.models.ProductEntity;

@Repository
public interface ProductRepository extends JpaRepository<ProductEntity, Integer>
{ 

}
