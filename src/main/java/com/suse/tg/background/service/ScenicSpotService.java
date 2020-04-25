package com.suse.tg.background.service;

import com.suse.tg.background.DO.ScenicSpot;
import com.suse.tg.background.common.vo.PageObject;

public interface ScenicSpotService {
	PageObject<ScenicSpot> findScenicSpots(String name , Integer pageCurrent);
}
