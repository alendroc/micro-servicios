package com.una.client.dto;

import lombok.Data;

@Data
public class NewClientRequestDto {
    private String firstName;
    private String lastName;
    private String email;
    private String telephone;
}
