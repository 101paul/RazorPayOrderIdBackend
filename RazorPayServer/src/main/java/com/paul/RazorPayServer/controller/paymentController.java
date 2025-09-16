package com.paul.RazorPayServer.controller;

import com.paul.RazorPayServer.service.RazorpayService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Map;

@RestController
@RequestMapping("/api/payment")
@CrossOrigin(origins = "*") //  Allow Android to call from outside
public class paymentController {
    @Autowired
    private RazorpayService razorpayService;

    @PostMapping("/createOrder")
    public String createOrder(@RequestBody Map<String, Object> data) throws Exception {
        int amount = (int) data.get("amount"); // In rupees
        String currency = (String) data.getOrDefault("currency", "INR");
        String receipt = (String) data.getOrDefault("receipt", "order_rcptid_11");

        return razorpayService.createOrder(amount, currency, receipt);
    }

}
