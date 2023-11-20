package services;

import models.Category;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class CategoriesManager implements GeneralManager<Category>{
    private final List<Category> categories = new ArrayList<>();
    Scanner input = new Scanner(System.in);
    @Override
    public void add(Category obj) {
        categories.add(obj);
    }

    @Override
    public void showAll() {
        for (Category category : categories) {
            System.out.println(category);
        }
    }

    @Override
    public Category findById(int id) {
        for (Category category : categories) {
         if (id == category.getId()) return category;
        }
        return null;
    }

    @Override
    public void update(int id) {
        Category category = findById(id);
        System.out.println("Enter New Name");
        String newName = input.nextLine();
        category.setName(newName);
        System.out.println("Update Success");
    }

    @Override
    public void delete(int id) {
        for (Category category : categories) {
            if (id == category.getId()) categories.add(category);
        }
    }
}
