package com.authorization.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "address")
@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class Permission extends BaseEntity {
    @Column(name="permission", nullable = false)
    private String permissionName;

    @Column(name="enabled")
    private boolean enabled = true;

    @Column(name="note")
    private String note;


}
