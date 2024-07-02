package com.mdemiguels.contactList.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Pattern;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.io.Serializable;

@Data
@Entity
public class Contact implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "contact_seq_generator")
    @SequenceGenerator(name="contact_seq_generator", sequenceName = "CONTACT_SEQ", allocationSize=1)
    private Long id;

    @NotNull
    private String name;
    @Email
    private String email;

    @Pattern(regexp="(^$|[0-9]{9})")
    private String phone;
}
