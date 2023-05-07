package com.devstack.pos.entity;

import lombok.*;

/*Lombok*/
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
//@Data - don't use it with entity
public class Customer {
    private long customerId;
    private String name;
    private String address;
    private double salary;
}
