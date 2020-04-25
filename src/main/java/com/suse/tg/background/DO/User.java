package com.suse.tg.background.DO;

import java.util.Date;

import lombok.Data;
@Data
public class User {
	private Long id;
	private String username;
	private String password;
	private String email;
	private int level;
	private int boot;
	private Date createdtime;
}
