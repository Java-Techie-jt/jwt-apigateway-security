package com.javatechie.dao;

import com.javatechie.dto.OrderResponseDTO;
import org.springframework.stereotype.Component;

import java.util.Date;
import java.util.HashMap;
import java.util.Map;

@Component
public class RestaurantOrderDAO {


    public OrderResponseDTO getOrders(String orderId) {
        return generateRandomOrders().get(orderId);
    }

    private Map<String, OrderResponseDTO> generateRandomOrders() {
        Map<String, OrderResponseDTO> orderMap = new HashMap<>();
        orderMap.put("35fds631", new OrderResponseDTO("35fds63", "VEG-MEALS", 1, 199, new Date(), "READY", 15));
        orderMap.put("9u71245h", new OrderResponseDTO("9u71245h", "HYDERABADI DUM BIRYANI", 2, 641, new Date(), "PREPARING", 59));
        orderMap.put("37jbd832", new OrderResponseDTO("37jbd832", "PANEER BUTTER MASALA", 1, 325, new Date(), "DELIVERED", 0));
        return orderMap;
    }

    public static void main(String[] args) {
        System.out.println("hyderabadi dum biryani".toUpperCase());
    }


}
