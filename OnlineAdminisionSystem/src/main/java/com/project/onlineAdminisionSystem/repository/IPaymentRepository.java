package com.project.onlineAdminisionSystem.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import com.project.onlineAdminisionSystem.entity.Payment;
@Repository
public interface IPaymentRepository extends JpaRepository <Payment,Integer> {

	

	List<Payment> findBypaymentStatus(String paymentStatus);
	@Query(value="SELECT * FROM payment WHERE application_id= :applicationId ;",nativeQuery=true)
	Payment findPaymentByApplicationId(@Param("applicationId")int id);

	
	
}