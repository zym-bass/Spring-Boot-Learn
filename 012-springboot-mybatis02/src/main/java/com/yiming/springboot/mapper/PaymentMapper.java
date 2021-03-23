package com.yiming.springboot.mapper;





import com.yiming.springboot.entity.Payment;
import org.apache.ibatis.annotations.Param;


public interface PaymentMapper {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);


}
