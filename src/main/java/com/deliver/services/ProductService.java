package com.deliver.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.deliver.dto.ProductDTO;
import com.deliver.model.Product;
import com.deliver.repositories.ProductRepository;

@Service
public class ProductService {

	private final ProductRepository productRepository = null;
	
	@Transactional(readOnly = true)
	public List<ProductDTO> findAll(){
		List<Product> list = productRepository. findAllByOrderByNameAsc();
		return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
	}
}
