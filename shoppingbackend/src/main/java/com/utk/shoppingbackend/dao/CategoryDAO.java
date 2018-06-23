package com.utk.shoppingbackend.dao;

import java.util.List;

import com.utk.shoppingbackend.dto.Category;

public interface CategoryDAO {
	
	List<Category> list();
	Category get(int id);
}
