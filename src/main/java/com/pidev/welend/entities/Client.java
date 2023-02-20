package com.pidev.welend.entities;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
@Table( name = "Client")
public class Client implements Serializable {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name="clientID")
    private Integer clientID;
    private String UserName;
    private Date birthDate;
    private long phoneNum;
    private String adress;
    private String email;
    private String employement;
    private Float income;
    private Float expenses;
    private String userRole;
    private String pwd;
    private Integer score;

@Enumerated(EnumType.STRING)
    private statusLog statuslog;
}
