package com.eren.graphql.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.CreationTimestamp;

import javax.persistence.*;
import java.util.Date;

@Data
@Entity
@AllArgsConstructor
@NoArgsConstructor
public class Vehicle {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;
    @Column(length = 100, name = "vehicle_type")
    private String type;
    @Column(length = 100, name = "model_code")
    private String modelCode;
    @Column(length = 100, name = "brand_name")
    private String brandName;
    @Column(name = "launch_date")
    @CreationTimestamp
    private Date launchDate;
}
