package org.fernando.sales.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Product {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idProduct;

    @ManyToOne
    @JoinColumn(name = "id_category" , nullable = false , foreignKey = @ForeignKey (name= "FK_PRODUCT_CATEGORY"))
    private Category category;

    @Column(length = 50, nullable = false)
    private String name;

    @Column(length = 150, nullable = false)
    private String description;

    @Column(columnDefinition = "decimal(6,2)",  nullable = false)
    private double price;

    @Column(nullable = false)
    private boolean enabled;

}
