package br.com.fatecommerce.api.service;

import br.com.fatecommerce.api.entity.Category;
import br.com.fatecommerce.api.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryService {

    @Autowired
    private CategoryRepository categoryRepository;

    public Category saveCategory(Category category) {
        return categoryRepository.saveAndFlush(category);
    }

    public List<Category> getInfoCategories() {
        return categoryRepository.findAll();
    }

}