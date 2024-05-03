package com.ecommerce.service;

import java.util.List;

import com.ecommerce.models.ProductEntity;

public interface ProductServiceInt {

	public List<ProductEntity> getAllProduct();
	public ProductEntity getProduct(int id);
	public void addProduct(ProductEntity pe);
	public void updateProduct(int id, ProductEntity pe);
    public void deleteProduct(int id);
}
