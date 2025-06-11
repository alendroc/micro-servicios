package com.una.client.service.impl;

import com.una.client.dto.ClientDto;
import com.una.client.dto.ClientResponseDto;
import com.una.client.dto.NewClientRequestDto;
import com.una.client.entity.Client;
import com.una.client.exception.ClientNotExistException;
import com.una.client.repository.ClientRepository;
import com.una.client.service.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements IClientService {

    private  ClientRepository clientRepository;

    @Override
    public void createClient(NewClientRequestDto newClientRequestDto) {
        Client client = new Client();

        client.setFirstName(newClientRequestDto.getFirstName());
        client.setLastName(newClientRequestDto.getLastName());
        client.setEmail(newClientRequestDto.getEmail());
        client.setTelephone(newClientRequestDto.getTelephone());
        clientRepository.save(client);
    }

    @Override
    public ClientResponseDto getClient(long id) {
        Client client = clientRepository.findById(id).orElseThrow(
                () -> new ClientNotExistException("Client doesn't exist")
        );
        ClientDto clientDto = new ClientDto(client.getId(), client.getFirstName(), client.getLastName(), client.getEmail(), client.getTelephone());
        return new ClientResponseDto("200", "Success", clientDto);
    }
}
