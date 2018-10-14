package com.springtest.bookingbackend.dao;

import java.util.List;

import com.springtest.bookingbackend.dto.Category;


public interface CategoryDao {

	public List<Category> list();
	Category getId(int id);
}
