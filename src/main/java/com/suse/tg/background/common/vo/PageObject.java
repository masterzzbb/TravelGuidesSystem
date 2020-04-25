package com.suse.tg.background.common.vo;

import java.io.Serializable;
import java.util.List;

import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
public class PageObject<T> implements Serializable{
	
	private static final long serialVersionUID = 1702796782797976119L;

	private Integer pageCurrent = 1;
	
	private Integer pageSize = 3;
	
	private Integer rowCount = 0;
	
	private Integer pageCount = 0;
	
	private List<T> records;

	public PageObject(Integer pageCurrent, Integer pageSize, Integer rowCount, List<T> records) {
		super();
		this.pageCurrent = pageCurrent;
		this.pageSize = pageSize;
		this.rowCount = rowCount;
		this.records = records;
		this.pageCount=rowCount/pageSize;
		if (rowCount%pageSize!=0) {
			pageCount++;
		}
		this.pageCount=(rowCount-1)/pageSize+1;
	}
	
	
}
