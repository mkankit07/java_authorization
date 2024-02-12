package com.authorization.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "users")
@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class User extends BaseEntity {

    @Column(name="username", nullable = false)
    private String username;

    @Column(name="password", nullable = false)
    private String password;

    @Column(name="name", nullable = false)
    private String name;

    private String gender;

    @Column(name = "birth_date")
    private LocalDate birthDate;

    @Column(name="note")
    private String note;

    @OneToOne(mappedBy = "user")
    private Contact contact;

    @OneToOne(mappedBy = "user")
    private Address address;

    @ManyToMany(fetch = FetchType.EAGER)
    private Set<Role> roles = new HashSet<>();

}