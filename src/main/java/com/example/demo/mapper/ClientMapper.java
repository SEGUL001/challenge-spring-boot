package com.example.demo.mapper;

import com.example.demo.api.ClientRequest;
import com.example.demo.api.ClientResponse;
import com.example.demo.model.Client;

import java.util.Calendar;
import java.util.Date;

public class ClientMapper {
    public static Client mapRequest(ClientRequest clientRequest){
        return new Client(clientRequest.getName(), clientRequest.getSurname(), clientRequest.getAge(), clientRequest.getBirthDate());
    }

    public static ClientResponse mapResponse(Client client){
        return new ClientResponse(client.getId(), client.getName(), client.getSurname(), client.getAge(), client.getBirthDate(), calculateDeath(client.getAge()));
    }

    public static Date calculateDeath(Long age){
        Calendar calendar = Calendar.getInstance();
        calendar.setTime(new Date());
        calendar.add(Calendar.YEAR,  (int)(100 - age));
        return calendar.getTime();
    }
}
