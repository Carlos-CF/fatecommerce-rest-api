package br.com.fatecommerce.api.entity;

import jakarta.persistence.*;
import lombok.*;
@Entity
@AllArgsConstructor
@NoArgsConstructor
//@Getter
//@Setter
@Data
public class Category {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column
    private Long id;

    @Column(nullable = false, length = 300, unique = true)
    private String name;

    @Column(length = 1000)
    private String description;
}
