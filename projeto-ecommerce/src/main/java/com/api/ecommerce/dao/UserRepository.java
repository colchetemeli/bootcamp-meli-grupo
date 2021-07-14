package com.api.ecommerce.dao;

import com.api.ecommerce.entity.Order;
import com.api.ecommerce.entity.User;
import com.api.ecommerce.entity.User;
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.io.*;
import java.util.ArrayList;
import java.util.List;

@Repository
public class UserRepository {

    public void update(Integer id, User user){
        try {
            List<User> users = getList();
            for (int i = 0; i < users.size() ; i++) {
                if (users.get(i).getId().equals(id)){
                    users.remove(i);
                    user.setId(id);
                    users.add(user);
                    break;
                }
            }
            PrintWriter out = new PrintWriter(new BufferedWriter(new FileWriter(FILE)));
            mapper.writeValue(out, users);
            out.close();
        }
        catch (IOException e) {
            e.printStackTrace();
        }
    }

    private static final File FILE = new File("src/main/resources/users.json");
    @Autowired
    private ObjectMapper mapper;

    public User getUser(Integer id){
        List<User> users = this.getList();
        for (User user:users){
            if (id.equals(user.getId())){
                return user;
            }
        }
        return null;
    }

    public List<User> getList(){
        List<User> users = new ArrayList<>();
        try {
            FileInputStream is = new FileInputStream(FILE);
            TypeReference<List<User>> typeReference = new TypeReference<List<User>>() {};
            users = mapper.readValue(is, typeReference);
            is.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return users;
    }
    
}
