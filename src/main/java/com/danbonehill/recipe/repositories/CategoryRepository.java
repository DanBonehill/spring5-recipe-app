package com.danbonehill.recipe.repositories;

import com.danbonehill.recipe.domain.Category;
import org.springframework.data.repository.CrudRepository;

public interface CategoryRepository extends CrudRepository<Category, Long> {
}
