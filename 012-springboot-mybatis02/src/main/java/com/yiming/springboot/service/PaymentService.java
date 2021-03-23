package com.yiming.springboot.service;


import com.yiming.springboot.entity.Payment;

public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(Long id);

}
