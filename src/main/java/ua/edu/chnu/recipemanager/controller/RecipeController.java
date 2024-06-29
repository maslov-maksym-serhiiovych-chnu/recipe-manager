package ua.edu.chnu.recipemanager.controller;

import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;
import ua.edu.chnu.recipemanager.model.Recipe;
import ua.edu.chnu.recipemanager.service.RecipeService;

@AllArgsConstructor
@Controller
public class RecipeController {
    private final RecipeService service;

    @GetMapping("/create")
    public String showCreateForm() {
        return "create";
    }

    @PostMapping("/create")
    public String create(@ModelAttribute Recipe created) {
        service.create(created);
        return "redirect:/";
    }

    @GetMapping("/")
    public ModelAndView readAll() {
        return new ModelAndView("index", "recipes", service.readAll());
    }

    @GetMapping("/update/{id}")
    public ModelAndView showUpdateForm(@PathVariable Integer id) {
        return new ModelAndView("update", "recipe", service.readById(id));
    }

    @PostMapping("/update/{id}")
    public String update(@PathVariable Integer id, @ModelAttribute Recipe updated) {
        service.updateById(id, updated);
        return "redirect:/";
    }

    @GetMapping("/delete/{id}")
    public ModelAndView showDeleteConfirm(@PathVariable Integer id) {
        return new ModelAndView("delete", "recipe", service.readById(id));
    }

    @PostMapping("/delete/{id}")
    public String delete(@PathVariable Integer id) {
        service.deleteById(id);
        return "redirect:/";
    }
}
