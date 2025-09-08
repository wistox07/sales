package org.fernando.sales.repo;

import org.fernando.sales.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ICategoryRepo extends JpaRepository<Category, Integer> {

}
