package com.example.event.model;


import lombok.*;

import javax.persistence.*;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@ToString
@Builder
@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(nullable = false)
    private String fullName;

    @Column(nullable = false)
    private String phone;

    @Column(nullable = false)
    private String password;

    private boolean isResident;

    private String fieldActivity;

    private String email;

    private String howDoYouKnow;

    private String qrCode;

    public User(String fullName, String phone, String password, boolean isResident, String fieldActivity, String email, String howDoYouKnow, String qrCode) {
        this.fullName = fullName;
        this.phone = phone;
        this.password = password;
        this.isResident = isResident;
        this.fieldActivity = fieldActivity;
        this.email = email;
        this.howDoYouKnow = howDoYouKnow;
        this.qrCode = qrCode;
    }
}
