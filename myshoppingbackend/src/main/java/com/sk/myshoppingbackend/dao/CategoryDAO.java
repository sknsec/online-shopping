package com.sk.myshoppingbackend.dao;

import java.util.List;

import org.springframework.stereotype.Repository;
import org.springframework.stereotype.Service;


import com.sk.myshoppingbackend.dto.Category;

//@Service

//@Repository("categoryDAO")
public interface CategoryDAO {
	
	List<Category> listCategory();
	Category get(int id);

}
