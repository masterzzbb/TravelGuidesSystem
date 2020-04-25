package com.suse.tg.background.DO;

import lombok.Data;

@Data
public class ScenicSpot {
	private Long id;
	private String name;
	private String details;
	private String addr;
	private Long local_id;
	private Double score;
	private Double ticket;
}
