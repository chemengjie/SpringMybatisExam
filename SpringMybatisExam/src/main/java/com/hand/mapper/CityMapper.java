package com.hand.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hand.dto.City;

public interface CityMapper {
	@Select("select * from city where id=#{cityId}")
	City getCity_id(@Param("cityId")Long cityId);
}
