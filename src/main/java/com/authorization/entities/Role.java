package com.authorization.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "roles")
@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class Role extends BaseEntity {

    @Column(name="role", nullable = false)
    private String roleName ;

}