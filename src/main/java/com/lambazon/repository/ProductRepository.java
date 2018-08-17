package com.lambazon.repository;

import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import org.springframework.stereotype.Repository;

import com.lambazon.domain.Product;

@Repository
public class ProductRepository {
	
	private static Map<Integer, Product> products = new HashMap<>();
	
	private static void generateProductData() {
		int id=0;
		//adding the variable for my price inventory field value
		products.put(++id, new Product(id, 10, 92.50, "Echo Dot", "(2nd Generation) - Black",id));
		products.put(++id, new Product(id, 20, 9.99, "Anker 3ft / 0.9m Nylon Braided", "Tangle-Free Micro USB Cable",id));
		products.put(++id, new Product(id, 30, 69.99, "JVC HAFX8R Headphone", "Riptidz, In-Ear",id));
		products.put(++id, new Product(id, 40, 32.50, "VTech CS6114 DECT 6.0", "Cordless Phone",id));
		products.put(++id, new Product(id, 50, 895.00, "NOKIA OEM BL-5J", "Cell Phone ",id));
		//add two new products //
		products.put(++id, new Product(id, 60, 39.50, "SAGEM AEG", "Cordless Phone",id));
		products.put(++id, new Product(id, 70, 95.00, "HUAWEI DRT", "Cell Phone ",id));
	}
	
	public List<Product> products() {
		
		if (products.isEmpty()) {
			generateProductData();
		}
		
		return products.values()
				.stream()
				.sorted(Comparator.comparing(Product::getName))
				.collect(Collectors.toList());
	}
	
	public Product product(Integer id) {
		return products.get(id);
	}

}
