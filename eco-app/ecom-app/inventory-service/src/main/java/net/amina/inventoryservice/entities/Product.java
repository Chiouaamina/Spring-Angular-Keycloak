package net.amina.inventoryservice.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.*;

@Entity
@NoArgsConstructor @AllArgsConstructor @Builder @Getter @Setter @ToString
public class Product {
    @Id
    private String id;
    private String name;
    private Double prix;
    private int quantity;
}
