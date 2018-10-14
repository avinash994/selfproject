package com.springtest.bookingbackend.daoImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.springtest.bookingbackend.dao.CategoryDao;
import com.springtest.bookingbackend.dto.Category;

@Repository("categoryDao")
public class CategoryDaoImpl implements CategoryDao {

	private static List<Category> categories = new ArrayList<Category>();

	static {
		// First Category
		Category category = new Category();
		category.setId(1);
		category.setName("Veg");
		category.setImageURL("Veg.png");

		categories.add(category);

		// second category
		Category category2 = new Category();
		category2.setId(2);
		category2.setName("NonVeg");
		category2.setImageURL("NonVeg.png");

		categories.add(category2);
		
		Category category3 = new Category();
		category3.setId(3);
		category3.setName("Starters");
		category3.setImageURL("Starters.png");

		categories.add(category3);
		
		Category category4 = new Category();
		category4.setId(4);
		category4.setName("Beverages");
		category4.setImageURL("Beverages.png");

		categories.add(category4);
		
		Category category5 = new Category();
		category5.setId(5);
		category5.setName("Combos");
		category5.setImageURL("combos.png");

		categories.add(category5);


	}

	@Override
	public List<Category> list() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category getId(int id) {
		// enhanced for loop
		for(Category category: categories){
			
			if(category.getId()== id){
				return category;
			}
			
		}
		return null;
		
	}

}
