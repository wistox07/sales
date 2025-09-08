package org.fernando.sales.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@Entity
public class Client {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer idClient;

    @Column(length = 100 , nullable = false)
    private String firstName;

    @Column(length = 100 , nullable = false)
    private String lastName;

    @Column(length = 10 , nullable = false, unique = true)
    private String cardId;

    @Column(length = 10 , nullable = false)
    private String phoneNumber;

    @Column(length = 50 , nullable = false)
    private String email;

    @Column(length = 100 , nullable = false)
    private String address;

    @Column(length = 35 , nullable = false)
    private String country;
}
