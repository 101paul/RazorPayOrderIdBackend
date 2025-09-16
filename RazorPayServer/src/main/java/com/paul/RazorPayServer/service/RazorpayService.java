package com.paul.RazorPayServer.service;

import com.razorpay.Order;
import com.razorpay.RazorpayClient;
import org.json.JSONObject;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service //Tells Spring this is a service basically the logic part
public class RazorpayService {
    @Value("${razorpay.key_id}")
    private String keyid ;
    @Value("${razorpay.key_secret}")
    private String keysecret;

    public String createOrder(int amount, String currency, String receipt) throws Exception {
        RazorpayClient razorpay = new RazorpayClient(keyid, keysecret);  //  This line authenticates with Razorpay using your credentials .
        JSONObject orderRequest = new JSONObject();
        orderRequest.put("amount", amount * 100); // Razorpay needs paise
        orderRequest.put("currency", currency);
        orderRequest.put("receipt", receipt);

        Order order = razorpay.orders.create(orderRequest);
        return order.toString();
    }
}
