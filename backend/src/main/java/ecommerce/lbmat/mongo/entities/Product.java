package ecommerce.lbmat.mongo.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(value = "product")
@Getter @Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String id;
    private String nom;
    private String ASIN;
    private String categorie;
    private String photo;
    private Double prix;
    private String description;
}
