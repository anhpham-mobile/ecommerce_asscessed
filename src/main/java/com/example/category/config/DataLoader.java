package com.example.category.config;

import com.example.category.model.Category;
import com.example.category.repository.CategoryRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements CommandLineRunner {
    @Autowired
    private CategoryRepository categoryRepository;

    public DataLoader() {
    }

    public void run(String... args) throws Exception {
        this.categoryRepository.deleteAll();
        Category electronics = new Category("1", "Điện tử", (String)null);
        Category phone = new Category("2", "Điện thoại", "1");
        Category laptop = new Category("3", "LapTop", "1");
        Category tv = new Category("4", "TV", "1");
        Category fridge = new Category("5", "Tủ lạnh", "1");
        Category iphone10 = new Category("6", "iPhone10", "2");
        Category iphone11 = new Category("7", "iPhone11", "2");
        Category iphone12 = new Category("8", "iPhone12", "2");
        Category iphone13 = new Category("9", "iPhone13", "2");
        Category samsungA10 = new Category("10", "Samsung14", "2");
        Category samsungA11 = new Category("11", "Samsung14", "2");
        Category samsungA12 = new Category("12", "Samsung14", "2");
        Category samsungA13 = new Category("13", "Samsung14", "2");
        Category macPro = new Category("14", "Mac Pro", "3");
        Category macAir = new Category("15", "Mac Air", "3");
        Category dell = new Category("16", "Dell", "3");
        Category asus = new Category("17", "Asus", "3");
        this.categoryRepository.save(electronics);
        this.categoryRepository.save(phone);
        this.categoryRepository.save(laptop);
        this.categoryRepository.save(tv);
        this.categoryRepository.save(fridge);
        this.categoryRepository.save(iphone10);
        this.categoryRepository.save(iphone11);
        this.categoryRepository.save(iphone12);
        this.categoryRepository.save(iphone13);
        this.categoryRepository.save(samsungA10);
        this.categoryRepository.save(samsungA11);
        this.categoryRepository.save(samsungA12);
        this.categoryRepository.save(samsungA13);
        this.categoryRepository.save(macPro);
        this.categoryRepository.save(macAir);
        this.categoryRepository.save(dell);
        this.categoryRepository.save(asus);
        System.out.println("Initial data loaded.");
    }
}
