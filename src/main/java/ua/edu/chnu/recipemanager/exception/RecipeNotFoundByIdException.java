package ua.edu.chnu.recipemanager.exception;

public class RecipeNotFoundByIdException extends RuntimeException {
    public RecipeNotFoundByIdException(Integer id) {
        super("Recipe with id " + id + " not found");
    }
}
