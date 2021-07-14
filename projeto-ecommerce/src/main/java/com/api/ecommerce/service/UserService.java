package com.api.ecommerce.service;

import com.api.ecommerce.dao.UserRepository;
import com.api.ecommerce.exception.UnauthorizedException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.HttpClientErrorException;

@Service
public class UserService {

    @Autowired
    UserRepository repository;

    public void auth(Integer userId){
        System.out.println(repository.getUser(userId));
        if(!repository.getUser(userId).getIsAdmin()){
            throw new UnauthorizedException("Este usuário não tem permissão");
        }
    }

}
