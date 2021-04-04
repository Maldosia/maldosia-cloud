package org.maldosia.springcloud.service;

import org.maldosia.springcloud.entities.Payment;

/**
 * create date: 2020/5/27 16:22
 **/
public interface PaymentService {
    int create(Payment payment);

    Payment getPaymentById(Long id);
}
