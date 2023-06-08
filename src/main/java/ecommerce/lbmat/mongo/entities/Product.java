package ecommerce.lbmat.mongo.entities;

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(value = "products")
@Getter @Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Product {
    @Id
    private String id;
    private String nom;
    private String prenom;
    private String alias;
    private String email;
    private String photo;
    private Boolean activation;
    private Date date_de_creation;
    private String password;
}
