package com.hand.mapper;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Param;

import com.hand.dto.Customer;


public interface CustomerMapper {
	@Insert("insert into customer values()")
	Customer getCustomer_id(@Param("customerId") Long customerId);
}
