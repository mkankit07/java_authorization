package com.authorization.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;
import org.springframework.security.core.parameters.P;

@Entity
@Table(name = "contacts")
@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class Contact extends BaseEntity {

    @Column(name="email", nullable = false)
    private String email;
    private String phone;
    private String skype;
    private String facebook;
    private String linkedin;
    private String website;
    private String note;

    @OneToOne
    @JoinColumn(name="user_id",nullable = false ,referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_users_contact_users_id"))
    private User user;
}