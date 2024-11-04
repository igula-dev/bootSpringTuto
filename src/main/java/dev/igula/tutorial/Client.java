package dev.igula.tutorial;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Document(collection = "clients")
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Client {
    @Id
    @JsonProperty("id")
    private String id;

    @Field
    @JsonProperty("companyName")
    private String companyName;
}
