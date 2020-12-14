package com.jbd.apis.model;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import javax.persistence.*;

@Getter
@NoArgsConstructor
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int user_id;

    @Column(length = 40, nullable = false)
    private String email;
    @Column(length = 20, nullable = false)
    private String name;
    @Column(length = 12)
    private String phone;
}
