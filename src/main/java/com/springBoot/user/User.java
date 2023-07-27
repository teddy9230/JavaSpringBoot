package com.springBoot.user;

import javax.persistence.*;

@Entity
@Table(name = "table1")
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long idx;

    @Column(name = "c_aes256")
    private String c_aes256;

    @Column(name = "c_base64")
    private String c_base64;

}