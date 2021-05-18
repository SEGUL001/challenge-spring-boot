package com.example.demo.controller;

import com.example.demo.api.ClientRequest;
import com.example.demo.api.ClientResponse;
import com.example.demo.model.Client;
import com.example.demo.service.ClientService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.net.http.HttpResponse;
import java.util.List;

@RestController
public class ClientController {

    private ClientService clientService;

    @Autowired
    public ClientController(ClientService clientService) {
        this.clientService = clientService;
    }

    @PostMapping("crearcliente")
    public ResponseEntity<Client> createClient(@RequestBody ClientRequest clientRequest){
        return ResponseEntity.ok().body(clientService.saveClient(clientRequest));
    }

    @GetMapping("kpiclientes")
    public ResponseEntity<?> getClientsKpi(){
        return ResponseEntity.ok().body(clientService.getClientsKpi());
    }

    @GetMapping("listclientes")
    public ResponseEntity<List<ClientResponse>> getClientList(){
        return ResponseEntity.ok().body(clientService.getClients());
    }
}
