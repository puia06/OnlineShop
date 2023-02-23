package com.online.shop.online_shop.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Setter
@Getter
@Entity
@Table(name = "products")
public class Product extends BaseEntity{
    @Column(name ="name")
    private String name;
    @Column(name="description")
    private String description;
    @Column(name = "price")
    private Double price;
    @Column(name = "availability")
    private AvailabilityType availability;


}
