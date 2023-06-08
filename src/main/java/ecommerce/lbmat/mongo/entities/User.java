package ecommerce.lbmat.mongo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

@Document(value = "user")
@Getter @Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {
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
