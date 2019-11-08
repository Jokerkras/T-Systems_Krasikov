package com.krasikov.controllers;

import com.krasikov.domain.Client;
import com.krasikov.dto.ClientDto;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import com.krasikov.service.IClientService;

import java.time.LocalDate;
import java.util.List;

@Controller
@RequestMapping("/api/client")
public class ClientController {

    private final IClientService clientService;

    public ClientController(final IClientService clientService) {
        this.clientService = clientService;
    }

    @RequestMapping(method = RequestMethod.GET)
    @ResponseBody
    public List<ClientDto> getClients() {
        return clientService.getClients();
        //TODO добавить пагинацию
    }

    @RequestMapping(method = RequestMethod.GET, path = "/{id}")
    @ResponseBody
    public Client getClientById(@PathVariable Long id) {
        return clientService.getClientBuId(id);
    }

    @PostMapping
    public void addClient(@RequestBody Client client){
        clientService.addClient(client);
    }
}
