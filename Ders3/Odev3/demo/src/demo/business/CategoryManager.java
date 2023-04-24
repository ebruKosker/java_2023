package demo.business;

import java.util.ArrayList;

import demo.dataAccess.CategoryDao;
import demo.entity.Category;
import demo.loggers.BaseLogger;
import demo.tools.ORM;


public class CategoryManager  {

	   private final ORM oRM;
	    private final BaseLogger[] loggers;
	    private ArrayList<Category> categories;

	    public CategoryManager(ORM oRM, BaseLogger[] loggers, ArrayList<Category> categories) {
	        this.oRM = oRM;
	        this.loggers = loggers;
	        this.categories = categories;
	    }

	    public void add(Category category) throws Exception {
	        for (Category category1 : categories) {
	            if (category1.getCategoryName() == category.getCategoryName()) {
	                throw new Exception("Kategori zaten var !");
	            }
	        }
	        oRM.creating();;
	        categories.add(category);

	        for (BaseLogger logger : loggers) {
	            logger.log(category.getCategoryName());
	        }
	    }


}