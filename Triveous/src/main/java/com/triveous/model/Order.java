package com.triveous.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.PositiveOrZero;

import lombok.Data;

@Entity
@Data
@Table(name = "order_table")
public class Order {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @NotBlank(message = "User ID cannot be blank")
    private String userId;

    @Valid
    @NotEmpty(message = "Order items cannot be empty")
    @OneToMany(cascade = CascadeType.ALL, orphanRemoval = true)
    private List<@Valid CartItem> items;

    @PositiveOrZero(message = "Total amount must be a positive or zero value")
    private double totalAmount;

    @NotBlank(message = "Order status cannot be blank")
    private String orderStatus;

}


