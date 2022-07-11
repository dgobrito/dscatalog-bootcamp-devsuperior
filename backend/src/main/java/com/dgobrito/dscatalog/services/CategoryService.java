package com.dgobrito.dscatalog.services;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.dgobrito.dscatalog.dto.CategoryDTO;
import com.dgobrito.dscatalog.entities.Category;
import com.dgobrito.dscatalog.repositories.CategoryRepository;

@Service
public class CategoryService {
	
	@Autowired
	private CategoryRepository repository;
	
	/*
	public List<CategoryDTO> findAll() {
		List<Category> list = repository.findAll();
		
		List<CategoryDTO> listDto = new ArrayList<>();
		
		for (Category entity : list) {
			listDto.add(new CategoryDTO(entity));			
		}
		
		return listDto;
	}
	*/
	
	public List<CategoryDTO> findAll() {
		List<Category> list = repository.findAll();
		return list.stream().map(x -> new CategoryDTO(x)).collect(Collectors.toList());
	}	
}