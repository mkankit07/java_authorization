package com.authorization.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "roles")
@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class Role extends BaseEntity {

    @Column(name="role", nullable = false)
    private String roleName ;


    @ManyToMany(fetch=FetchType.EAGER)
    @JoinTable(name = "permissions_roles",
            joinColumns = @JoinColumn(name = "role_id"),
            inverseJoinColumns = @JoinColumn(name = "permission_id"),
            foreignKey = @ForeignKey(name = "fk_permission_roles_permission_id")
    )
    private List<Permission> permissions= new ArrayList<>();
}