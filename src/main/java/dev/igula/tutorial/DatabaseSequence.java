package dev.igula.tutorial;

import lombok.Getter;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;

@Setter
@Getter
@Document(collection = "database_sequences")
public class DatabaseSequence {
    // Getters and Setters
    @Id
    private String id;
    @Field
    private long seq;

}
