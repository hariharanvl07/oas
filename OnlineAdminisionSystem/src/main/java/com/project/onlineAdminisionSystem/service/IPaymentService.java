package com.project.onlineAdminisionSystem.service;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.project.onlineAdminisionSystem.entity.Payment;

import com.project.onlineAdminisionSystem.repository.IPaymentRepository;
@Service
public class IPaymentService implements PaymentService {
	
	Logger logger = LoggerFactory.getLogger(PaymentService.class);
	
	@Autowired
	private IPaymentRepository repository;

	@Override
	public Payment addPayment(Payment payment) {
		
		logger.info("addPayment service started");
		logger.info("addPayment service ended");

		return repository.save(payment);

	}

	@Override
	public List<Payment> viewAllPaymentDetails() {
		
		logger.info("viewAllPaymentDetails service started");
		logger.info("viewAllPaymentDetails service ended");
		
		return repository.findAll();
	}

	@Override
	public Optional<Payment> getPaymentDetailsByPaymentId(int paymentId) {
		
		logger.info("getPaymentDetailsByPaymentId service started");
		logger.info("getPaymentDetailsByPaymentId service ended");

		return repository.findById(paymentId);
	}

	@Override
	public Payment getPaymentDetailsByApplicationId(int applicationId) {
		
		logger.info("getPaymentDetailsByApplicationId service started");
		logger.info("getPaymentDetailsByApplicationId service ended");

		return repository.findPaymentByApplicationId(applicationId);
	}

	@Override
	public List<Payment> getPaymentDetailsByStatus(String paymentStatus) {
		
		logger.info("getPaymentDetailsByStatus service started");
		logger.info("getPaymentDetailsByStatus service ended");
		
		return repository.findBypaymentStatus(paymentStatus);
		
	}

	@Override
	public int deletePaymentById(int paymentById) {
		
		logger.info("deletePaymentById service started");
		
		repository.deleteById(paymentById);
		
		logger.info("deletePaymentById service ended");
		
		return paymentById;
	}

	@Override
	public Payment updatePaymentDetail(Payment payment) {
		
		logger.info("updatePaymentDetail service started");
		
		Payment accounts = repository.findById(payment.getPaymentId()).orElseThrow();
		accounts.setPaymentStatus(payment.getPaymentStatus());
		
		logger.info("updatePaymentDetail service ended");
		
		return repository.save(accounts);
	}


}
