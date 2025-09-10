package org.fernando.sales.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor

@Entity
@Table(name = "user_data")
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer userId;

    @ManyToOne
    @JoinColumn(name = "id_role" , nullable = false , foreignKey = @ForeignKey(name = "FK_USER_ROLE"))
    private Role role;
    @Column(length = 50, unique = true, nullable = false)
    private String username;

    @Column(length = 60, nullable = false)
    private String  password;

    @Column(nullable = false)
    private boolean enabled;
}
