package com.sk.myshoppingbackend.daoimpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sk.myshoppingbackend.dao.CategoryDAO;
import com.sk.myshoppingbackend.dto.Category;

@Repository("categoryDAO")
public class CategoryDAOImpl implements CategoryDAO{
	
	private static List<Category> categories= new ArrayList<>();
	
	static
	{
		Category category1 = new Category();
		category1.setId(101);
		category1.setName("Television");
		category1.setImageURL("CAT_1.png");
		category1.setDescription("Description for TV");
		
		Category category2 = new Category();
		category2.setId(102);
		category2.setName("Phone");
		category2.setImageURL("phone_1.png");
		category2.setDescription("Description for Phone");
		
		Category category3 = new Category();
		category3.setId(101);
		category3.setName("Camera");
		category3.setImageURL("CAM_1.png");
		category3.setDescription("Description for CAM");
		
		categories.add(category1);
		categories.add(category2);
		categories.add(category3);
		
	}

	@Override
	public List<Category> listCategory() {
		// TODO Auto-generated method stub
		return categories;
	}

	@Override
	public Category get(int id) {
		// TODO Auto-generated method stub
		
		for(Category category : categories)
		{
			if(category.getId()==id)
				return category;
		}
		
		return null;
		
	}

}
