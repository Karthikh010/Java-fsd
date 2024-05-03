package com.ecommerce.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ecommerce.models.ProductEntity;
import com.ecommerce.repo.ProductRepository;

@Service
public class ProductService implements ProductServiceInt{

	@Autowired
	ProductRepository productRepository;
	
	@Override
	public List<ProductEntity> getAllProduct() {
		return productRepository.findAll();
	}

	@Override
	public ProductEntity getProduct(int id) {
        return productRepository.findById(id).get();
	}

	@Override
	public void addProduct(ProductEntity pe) {
		productRepository.save(pe);
	}

	@Override
	public void updateProduct(int id, ProductEntity pe) {
		if(productRepository.findById(id).isPresent()) {
            ProductEntity oldProductEntity=productRepository.findById(id).get();
            oldProductEntity.setName(pe.getName());
            oldProductEntity.setDescription(pe.getDescription());
            productRepository.save(oldProductEntity);
        }

	}

	@Override
	public void deleteProduct(int id) {
        productRepository.deleteById(id);       
	}

}
