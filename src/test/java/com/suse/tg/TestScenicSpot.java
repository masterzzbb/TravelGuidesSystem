package com.suse.tg;

import java.util.List;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import com.suse.tg.background.DO.ScenicSpot;
import com.suse.tg.background.dao.ScenicSpotDao;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestScenicSpot {

	@Autowired
	private ScenicSpotDao dao;
	
	@Test
	public void TestFindScenicSpots() {
		List<ScenicSpot> scenicSpots = dao.findScenicSpots("", 1, 2);
		for (ScenicSpot scenicSpot : scenicSpots) {
			System.out.println(scenicSpot);
		}
	}
	@Test
	public void TestCount() {
		Integer count = dao.getRowCount();
		System.out.println(count);
	}
}
