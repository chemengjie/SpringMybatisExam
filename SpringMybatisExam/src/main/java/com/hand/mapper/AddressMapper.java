package com.hand.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import com.hand.dto.Address;
public interface AddressMapper {
	@Select("select * from address where id=#{addressId}")
	Address getAddress_id(@Param("addressId") Long addressId);
}
