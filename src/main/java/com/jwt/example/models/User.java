package com.jwt.example.models;

import lombok.*;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private String userId;
    private String name;
    private String email;
}
