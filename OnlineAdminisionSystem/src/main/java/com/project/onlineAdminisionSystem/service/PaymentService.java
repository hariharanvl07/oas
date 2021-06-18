package com.project.onlineAdminisionSystem.service;

import java.util.List;
import java.util.Optional;

import com.project.onlineAdminisionSystem.entity.Payment;

public interface PaymentService {
	public Payment addPayment(Payment payment);

	public List<Payment> viewAllPaymentDetails();

	public Optional<Payment> getPaymentDetailsByPaymentId(int paymentId);

	public Payment getPaymentDetailsByApplicationId(int applicationId);

	public List<Payment> getPaymentDetailsByStatus(String paymentStatus);

	public int deletePaymentById(int paymentById);

	public Payment updatePaymentDetail(Payment payment);


}
