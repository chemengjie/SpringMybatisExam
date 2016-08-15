package com.hand.mapper;

import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.hand.dto.Store;

public interface StoreMapper {
	@Select("")
	Store getStore_id(@Param("storeId") Long storeId);
}
