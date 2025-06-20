package com.licagent;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRegisterRepository extends JpaRepository<CustomerRegisterEntity, Long> {
	 List<CustomerRegisterEntity> findByName(String name);

}
