package org.bigjava.category.dao;

import java.util.List;

import org.bigjava.category.entity.Category;

public interface CategoryDao {
	
	/**
	 * ���һ������
	 */
	public void addCategory(Category category);
	
	/**
	 * ��ѯ����һ������
	 */
	public List<Category> queryAllCategory();
	
	/**
	 * ͨ��id��ѯ��Ӧ��һ������
	 */
	public Category queryCategory(int c_id);
	
	/**
	 * ɾ��һ������
	 */
	public void deleteCategory(Category category);
	
}
