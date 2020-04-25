package com.suse.tg.background.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.suse.tg.background.common.vo.JsonResult;
import com.suse.tg.background.service.ScenicSpotService;

@RestController
@RequestMapping("/scenicspots/")
public class ScenicSpotsController {
	@Autowired
	private ScenicSpotService scenicSpotService;
	@GetMapping("doFindPageObjects")/*@RequestMapping("doFindPageObjects",method = RequestMethod.GET)*/
	public JsonResult doFindPageObjects(
						String username ,
		  @RequestParam Integer pageCurrent) {
		return new JsonResult(
				scenicSpotService.findScenicSpots(username, pageCurrent));
	}
}
