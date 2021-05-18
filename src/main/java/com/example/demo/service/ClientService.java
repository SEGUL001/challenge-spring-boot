package com.example.demo.service;

import com.example.demo.api.ClientRequest;
import com.example.demo.api.ClientResponse;
import com.example.demo.api.KpiReponse;
import com.example.demo.mapper.ClientMapper;
import com.example.demo.model.Client;
import com.example.demo.repository.ClientRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ClientService {

    private ClientRepository clientRepository;
    private Logger logger = LoggerFactory.getLogger(ClientService.class);

    @Autowired
    public ClientService(ClientRepository clientRepository) {
        this.clientRepository = clientRepository;
    }

    public Client saveClient(ClientRequest clientRequest){
        try{
            return clientRepository.save(ClientMapper.mapRequest(clientRequest));
        } catch (Exception e){
            logger.error("Error while trying to save client with name: {}", clientRequest.getName());
            throw new RuntimeException("Error while trying to save client", e);
        }
    }

    public KpiReponse getClientsKpi(){
        KpiReponse kpiReponse = new KpiReponse();
        kpiReponse.setClientAgeMid(clientRepository.getAgeAverage());
        kpiReponse.setClientStd(clientRepository.getStd());
        return kpiReponse;
    }


    public List<ClientResponse> getClients(){
        return clientRepository.findAll().stream().map(ClientMapper::mapResponse).collect(Collectors.toList());
    }

}
