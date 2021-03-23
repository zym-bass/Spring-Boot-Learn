package com.yiming.springboot.controller;


import com.yiming.springboot.entity.CommonResult;
import com.yiming.springboot.entity.Payment;
import com.yiming.springboot.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @PostMapping(value = "/payment/creat")
    public CommonResult create(Payment payment){
        int result = paymentService.create(payment);

        return result ==0 ? new CommonResult(200,"插入数据库成功",result) :new CommonResult(200,"插入数据库失败",null) ;
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult create(@PathVariable(value = "id") Long id){
        Payment payment = paymentService.getPaymentById(id);

        return payment!=null ? new CommonResult(200,"查询成功",payment) :new CommonResult(200,"没有对应记录+查询Id为："+id,null) ;
    }
}
