package com.project.onlineAdminisionSystem.controller;

import java.util.List;
import java.util.Optional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.project.onlineAdminisionSystem.entity.Payment;

import com.project.onlineAdminisionSystem.service.PaymentService;

@RestController
@RequestMapping("/payment")
public class PaymentController {

	Logger logger = LoggerFactory.getLogger(PaymentController.class);

	@Autowired
	private PaymentService paymentservice;

	@PostMapping("/addPayment")
	public Payment addPayment(@RequestBody Payment payment) {

		logger.info("addPayment controller started");
		logger.info("addPayment controller ended");

		return paymentservice.addPayment(payment);
	}

	@GetMapping("/viewAllPaymentDetails")
	public List<Payment> getAllPaymentDetails() {
		
		logger.info("getAllPaymentDetails controller started");
		logger.info("getAllPaymentDetails controller ended");
		
		return paymentservice.viewAllPaymentDetails();
	}

	@GetMapping("/getPaymentDetailsByPaymentId/{id}")
	public Optional<Payment> getPaymentDetailsByPaymentId(@PathVariable("id") int paymentId) {
		
		logger.info("getPaymentDetailsByPaymentId controller started");
		logger.info("getPaymentDetailsByPaymentId controller ended");
		
		return paymentservice.getPaymentDetailsByPaymentId(paymentId);
	}
	
	@GetMapping("/getPaymentDetailsByApplicationId/{applicationId}")
	public Payment getPaymentDetailsByApplicationId(@PathVariable("applicationId") int applicationId) {
		
		logger.info("getPaymentDetailsByApplicationId controller started");
		logger.info("getPaymentDetailsByApplicationId controller ended");
		
		return paymentservice.getPaymentDetailsByApplicationId(applicationId);
	}

	@GetMapping("/getPaymentDetailsByStatus/{Status}")
	public List<Payment> findPaymentDetailbypaymentStatus(@PathVariable("Status") String paymentStatus) {
		
		logger.info("getPaymentDetailsByStatus controller started");
		logger.info("getPaymentDetailsByStatus controller ended");
		
		return paymentservice.getPaymentDetailsByStatus(paymentStatus);
	}

	@DeleteMapping("/deletePaymentById/{id}")
	public int deletePaymentById(@PathVariable("id") int paymentById) {
		
		logger.info("deletePaymentById controller started");
		logger.info("deletePaymentById controller ended");
		
		return paymentservice.deletePaymentById(paymentById);
	}

	@PutMapping("/updatePaymentDetail/{id}")
	public Payment updatePaymentDetail(@PathVariable int id, @RequestBody Payment payments) {
		
		logger.info("updatePaymentDetail controller started");
		
		Payment amount = paymentservice.getPaymentDetailsByPaymentId(id).orElseThrow();
		amount.setPaymentStatus(payments.getPaymentStatus());
		
		logger.info("updatePaymentDetail controller ended");
		
		return paymentservice.updatePaymentDetail(amount);
	}

}
