package com.exam.examproject.dto;

import jakarta.persistence.*;
import lombok.*;

@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Member {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    public int idx;


    public String name;
    public String birthday;
    public String phone;
    public String address;
    @Column(unique = true)
    public String account;
    public String password;

    public String regdate;

}
