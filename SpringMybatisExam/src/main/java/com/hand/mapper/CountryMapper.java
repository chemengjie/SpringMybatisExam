package com.hand.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hand.dto.Country;

public interface CountryMapper {
	@Select("")
	Country getCountry_id(@Param("countryId") Long countryId);
}
