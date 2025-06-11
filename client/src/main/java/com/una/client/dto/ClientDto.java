package com.una.client.dto;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class ClientDto {
    private long id;
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
}
