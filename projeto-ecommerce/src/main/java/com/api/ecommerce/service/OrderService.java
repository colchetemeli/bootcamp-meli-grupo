package com.api.ecommerce.service;

import com.api.ecommerce.dao.OrderRepository;
import com.api.ecommerce.dao.UserRepository;
import com.api.ecommerce.entity.Order;
import com.api.ecommerce.entity.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OrderService {

    @Autowired
    OrderRepository orderRepository;
    @Autowired
    UserRepository userRepository;

    public Order create(Order order){
        orderRepository.add(order);
        User user = userRepository.getUser(order.getClientId());
        user.getOrderList().add(order);
        userRepository.update(order.getClientId(), user);
        return order;
    }

    public List<Order> getList(){
        return orderRepository.getList();
    }
    
}
