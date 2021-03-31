package com.backlabs.projects.shoppingstore.core.modules.user.document;

import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.index.Indexed;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.validation.constraints.NotBlank;
import java.io.Serializable;
import java.sql.Timestamp;

@Data
@Document(collection = "user")
public class User implements Serializable {

    @Id
    private String id;

    @NotBlank
    @Indexed(unique = true)
    private String email;

    @NotBlank
    private String password;

    @NotBlank
    @Indexed(unique = true)
    private String phoneNumber;

    @NotBlank
    private String areaCode;

    @CreationTimestamp
    private Timestamp createdAt;

    @UpdateTimestamp
    private Timestamp updatedAt;
}
