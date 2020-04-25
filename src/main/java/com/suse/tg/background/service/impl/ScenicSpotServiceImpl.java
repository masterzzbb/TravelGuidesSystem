package com.suse.tg.background.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.suse.tg.background.DO.ScenicSpot;
import com.suse.tg.background.common.exception.ServiceException;
import com.suse.tg.background.common.vo.PageObject;
import com.suse.tg.background.dao.ScenicSpotDao;
import com.suse.tg.background.service.ScenicSpotService;

@Service
public class ScenicSpotServiceImpl implements ScenicSpotService {

	@Autowired
	private ScenicSpotDao scenicspotDao;
	
	@Override
	public PageObject<ScenicSpot> findScenicSpots(String name , Integer pageCurrent) {
		
		//1.对参数进行校验
		if(pageCurrent==null||pageCurrent<1)
			throw new IllegalArgumentException("当前页码值无效");
		//2.查询总记录数并进行校验
		int rowCount=scenicspotDao.getRowCount();
		if(rowCount==0)
			throw new ServiceException("没有找到对应记录");
		//3.查询当前页记录
		int pageSize=2;
		int startIndex=(pageCurrent-1)*pageSize;
		List<ScenicSpot> records=
		scenicspotDao.findScenicSpots(name,startIndex, pageSize);
		//4.对查询结果进行封装并返回
		return new PageObject<>(pageCurrent, pageSize, rowCount, records);
	}

}
