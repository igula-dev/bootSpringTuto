package dev.igula.tutorial;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.data.mongodb.core.mapping.Field;


import java.text.DateFormat;

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
    @JsonProperty("clientId")
    private Long clientId;

    @Field
    @JsonProperty("companyName")
    private String companyName;

    @Field
    @JsonProperty("adrress")
    private String adrress;

    @Field
    @JsonProperty("city")
    private String city;

    @Field
    @JsonProperty("postalCode")
    private String postalCode;

    @Field
    @JsonProperty("province")
    private String province;

    @Field
    @JsonProperty("phone")
    private String phone;

    @Field
    @JsonProperty("email")
    private String email;

    @Field
    @JsonProperty("administrator")
    private String administrator;

    @Field
    @JsonProperty("date")
    private String date;

    public void setClientId(Long clientId) {
        this.clientId = clientId;
    }
}


