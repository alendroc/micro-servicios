package com.una.client.service;

import com.una.client.dto.ClientResponseDto;
import com.una.client.dto.NewClientRequestDto;

public interface IClientService {
    void createClient(NewClientRequestDto newAccountRequestDto);

    ClientResponseDto getClient(long id);
}
