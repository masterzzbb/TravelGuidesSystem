package com.suse.tg.background.dao;


import java.util.List;

import org.apache.ibatis.annotations.Param;

import com.suse.tg.background.DO.ScenicSpot;

public interface ScenicSpotDao {
	
	public List<ScenicSpot> findScenicSpots(@Param("name") String username,
											@Param("startIndex") Integer startIndex,
											@Param("pageSize") Integer pageSize);
	
	public Integer getRowCount();
}
