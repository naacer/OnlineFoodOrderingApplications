package com.nacer.service;

import com.nacer.model.Order;
import com.nacer.response.PaymentResponse;
import com.stripe.exception.StripeException;

public interface PaymentService {

    public PaymentResponse createPaymentLink(Order order) throws StripeException;
}
