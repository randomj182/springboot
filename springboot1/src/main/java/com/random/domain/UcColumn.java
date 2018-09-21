package com.random.domain;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

/**
 * @description 添加类的描述.
 * @author random
 * @version 1.0
 * @date 2018年8月29日
 * 
 */
@Table(name="uc_column")
public class UcColumn {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	private Integer id;
	
	@Column(name="column_no")
	private String columnNo;
	
	@Column(name="column_name")
	private String columnName;
	
	@Column(name="article_num")
	private Integer articleNum;
	
	@Column(name="page_view")
	private Integer pageView;
	
	@Column(name="page_view_real")
	private Integer pageViewReal;
	
	@Column(name="create_time")
	private Date createTime;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getColumnNo() {
		return columnNo;
	}

	public void setColumnNo(String columnNo) {
		this.columnNo = columnNo;
	}

	public String getColumnName() {
		return columnName;
	}

	public void setColumnName(String columnName) {
		this.columnName = columnName;
	}

	public Integer getArticleNum() {
		return articleNum;
	}

	public void setArticleNum(Integer articleNum) {
		this.articleNum = articleNum;
	}

	public Integer getPageView() {
		return pageView;
	}

	public void setPageView(Integer pageView) {
		this.pageView = pageView;
	}

	public Integer getPageViewReal() {
		return pageViewReal;
	}

	public void setPageViewReal(Integer pageViewReal) {
		this.pageViewReal = pageViewReal;
	}

	public Date getCreateTime() {
		return createTime;
	}

	public void setCreateTime(Date createTime) {
		this.createTime = createTime;
	}
	
	
}
