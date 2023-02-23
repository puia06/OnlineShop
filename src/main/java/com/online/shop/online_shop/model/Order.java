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
@Table(name = "orders")
public class Order extends BaseEntity {
    @Column(name = "productName")
    private String productName;


}
