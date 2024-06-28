package ua.edu.chnu.recipemanager.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import ua.edu.chnu.recipemanager.model.Recipe;

@Repository
public interface RecipeRepository extends JpaRepository<Recipe, Integer> {
}
