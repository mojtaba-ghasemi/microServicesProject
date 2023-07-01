package com.example.microserviceproject2.model;

import jdk.nashorn.internal.objects.annotations.Setter;
import org.hibernate.annotations.GenericGenerator;
import org.hibernate.annotations.Type;

import javax.persistence.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

@Entity
@Table(name = "COMPANY")
public class Company {
    @Id
    @GeneratedValue
    @Column(name = "ID")
    private Long id;


    @Column(name = "UUID", nullable = false, updatable = false, columnDefinition = "VARCHAR(36)")
    @Type(type = "uuid-char")
    private UUID uuid;


    @Column(name = "NAME")
    private String name;

    @Column(name = "FIELD_OF_ACTIVITY")
    private String fieldOfActivity;

}
