package ua.edu.chnu.recipemanager.service;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import ua.edu.chnu.recipemanager.exception.RecipeNotFoundByIdException;
import ua.edu.chnu.recipemanager.model.Recipe;
import ua.edu.chnu.recipemanager.repository.RecipeRepository;

@AllArgsConstructor
@Service
public class RecipeService {
    private final RecipeRepository repository;

    public void create(Recipe created) {
        repository.save(created);
    }

    public Iterable<Recipe> readAll() {
        return repository.findAll();
    }

    public Recipe readById(Integer id) {
        return repository.findById(id).orElseThrow(() -> new RecipeNotFoundByIdException(id));
    }

    public void updateById(Integer id, Recipe updated) {
        Recipe recipe = readById(id);

        recipe.setTitle(updated.getTitle());
        recipe.setDescription(updated.getDescription());
        repository.save(recipe);
    }

    public void deleteById(Integer id) {
        repository.delete(readById(id));
    }
}
