package com.acme.user.resource;

import lombok.Getter;
import lombok.Setter;


@Getter
@Setter
public class AccountResource {

    private Long id;

    private String email;

    private String password;

    private String identification;

    private Long accType;

    private String firstName;

    private String lastName;

    private Long phone;

    private boolean premium;
}
