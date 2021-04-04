package org.maldosia.springcloud.service;

/**
 * create date: 2020/5/29 17:11
 **/
public interface IPaymentService {

    String paymentInfo_OK(Integer id);

    String paymentInfo_Timeout(Integer id);

    String paymentInfo_TimeoutHandler(Integer id);

    String paymentCircuitBreaker(Integer id);
}
