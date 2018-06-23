package com.utk.shoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.utk.shoppingbackend.dao.CategoryDAO;
import com.utk.shoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO {
	
	private static List<Category> categories = new ArrayList<>(); 
	
	static {
		Category category = new Category();
		
		//adding first category
		category.setId(1);
		category.setName("Saree");
		category.setDescription("This is some description for Saree");
		category.setImageURL("CAT-1.png");
		
		categories.add(category);
		
		//adding second category
		category=new Category();
		category.setId(2);
		category.setName("Kurti");
		category.setDescription("This is some description for kurti");
		category.setImageURL("CAT-2.png");
		
		categories.add(category);
		
		//adding third category
		category=new Category();
		category.setId(3);
		category.setName("Lehenga");
		category.setDescription("This is some description for lehenga");
		category.setImageURL("CAT-3.png");
		
		categories.add(category);		
	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		
		// enhanced for loop
		for(Category category : categories) {
			if(category.getId()==id) return category;
		}
		return null;
	}

}
