package com.example.reactcalisma.entiti;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import lombok.Data;

@Data
@Entity
public class User {
    @Id
    @GeneratedValue
    private long id;
    private  String isim;
    private String soyisim;
    private  String mail;
    private String sifre;
}
