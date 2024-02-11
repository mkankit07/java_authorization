package com.authorization.entities;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.experimental.SuperBuilder;

@Entity
@Table(name = "address")
@Getter
@SuperBuilder(toBuilder = true)
@NoArgsConstructor
public class Address extends BaseEntity{
    private String address1;
    private String address2;
    private String city;
    private String country;

    @Column(name="zip_code")
    private String zipCode;
    private String latitude;
    private String longitude;

    @OneToOne
    @JoinColumn(name="user_id",nullable = false ,referencedColumnName = "id", foreignKey = @ForeignKey(name = "fk_users_address_users_id"))
    private User user;
}