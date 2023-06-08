package ecommerce.lbmat.mongo.entities;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.*;
import org.hibernate.validator.constraints.NotBlank;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotNull;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Date;

@Document(value = "caddie")
@Getter @Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class Caddie {
    @Id
    private String id;
    private Boolean currentStateOfLoad;
    private Boolean abandon;
    private ArrayList content;
}
