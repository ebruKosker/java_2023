package demo.dataAccess;

import demo.entity.Category;

public class CategoryDao {
	

	public void add(Category category) {
		System.out.println("Kategori eklendi : "+category.getCategoryName());
		
	}

	public void delete(Category category) {
		System.out.println("Kategori silindi : "+category.getCategoryName());
		
	}

	public void update(Category category) {
		System.out.println("Kategori guncellendi : "+category.getCategoryName());
		
	}

}
