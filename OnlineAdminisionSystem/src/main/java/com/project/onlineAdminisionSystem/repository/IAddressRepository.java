package com.project.onlineAdminisionSystem.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.project.onlineAdminisionSystem.entity.Address;
import com.project.onlineAdminisionSystem.entity.Admission;

public interface IAddressRepository extends JpaRepository<Address , Integer>
{

}
