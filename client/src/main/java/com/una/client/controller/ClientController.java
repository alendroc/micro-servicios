package com.una.client.controller;

import com.una.client.dto.ClientResponseDto;
import com.una.client.dto.ResponseDto;
import com.una.client.dto.NewClientRequestDto;
import com.una.client.service.IClientService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping(path = "/api/v1",produces = {MediaType.APPLICATION_JSON_VALUE})
@AllArgsConstructor
public class ClientController {
    private IClientService clientService;
    @PostMapping("/client")
    public ResponseEntity<ResponseDto> createAccount(@RequestBody NewClientRequestDto newClientRequestDto){
        clientService.createClient(newClientRequestDto);
        return ResponseEntity.status(HttpStatus.CREATED).body(new ResponseDto("201","Created successfully."));
    }
    @GetMapping("/client")
    public ResponseEntity<ClientResponseDto> getAccount(@RequestParam long id){
        ClientResponseDto response=clientService.getClient(id);
        return ResponseEntity.status(HttpStatus.OK).body(response);
    }
}
