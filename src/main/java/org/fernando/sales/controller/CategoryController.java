package org.fernando.sales.controller;

import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.servlet.http.PushBuilder;
import lombok.RequiredArgsConstructor;
import org.fernando.sales.model.Category;
import org.fernando.sales.repo.ICategoryRepo;
import org.fernando.sales.service.ICategoryService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Locale;

@RestController
@RequestMapping("/categories")
@RequiredArgsConstructor
@Tag(name = "Category", description = "Operaciones con categoria")

public class CategoryController {

    private final ICategoryService service;

    @GetMapping
    public ResponseEntity<List<Category>>  readAll() throws Exception {
        List<Category> categorias = service.readAll();
        return ResponseEntity.ok(categorias);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Category> readById(@PathVariable Integer id) throws Exception{
        Category category = service.readById(id);
        return ResponseEntity.ok(category);
    }

    @PostMapping
    public ResponseEntity<Category> create(@RequestBody Category category) throws Exception {
        Category obj = service.save(category);
        return ResponseEntity.status(HttpStatus.CREATED).body(obj);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Category> update(@RequestBody Category category ,@PathVariable  Integer id) throws Exception {
        Category obj = service.update(category, id);
        return ResponseEntity.ok(obj);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> delete(@PathVariable  Integer id) throws Exception {
        service.delete(id);
        return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
    }

}
