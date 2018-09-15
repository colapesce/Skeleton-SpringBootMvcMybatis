package com.dev.app.business.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.dev.app.business.service.ClientService;
import com.dev.app.persistence.bean.User;

@RestController
@RequestMapping("/client")
public class ClientController {
    
	@Autowired
	private ClientService clientService;
	
	@RequestMapping(value="/list", method=RequestMethod.GET)
    public @ResponseBody List<User> getList() {
        return clientService.getAllUsers();
    }
}