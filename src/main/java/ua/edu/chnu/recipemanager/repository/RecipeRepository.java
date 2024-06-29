package ua.edu.chnu.recipemanager.repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
import ua.edu.chnu.recipemanager.model.Recipe;

@Repository
public interface RecipeRepository extends CrudRepository<Recipe, Integer> {
}
