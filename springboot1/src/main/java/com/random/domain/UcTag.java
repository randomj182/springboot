package com.random.domain;
/**
 * @description 对应数据库demo中uc_tag表.
 * @author random
 * @version 1.0
 * @date 2018年8月24日
 * 
 */

import java.util.Date;
import javax.persistence.*;

@Table(name = "uc_tag")
public class UcTag {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "tag_no")
    private String tagNo;
    
    @Column(name = "tag_name")
    private String tagName;
    
    @Column(name = "create_time")
    private Date createTime;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getTagNo() {
        return tagNo;
    }
    public void setTagNo(String tagNo) {
        this.tagNo = tagNo == null ? null : tagNo.trim();
    }
    public String getTagName() {
        return tagName;
    }
    public void setTagName(String tagName) {
        this.tagName = tagName == null ? null : tagName.trim();
    }
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
    
    @Override
	public int hashCode() {

		return super.hashCode();
	}

	@Override
	public boolean equals(Object obj) {
		if(this == obj){
			return true;
		}
		if(!(obj instanceof UcTag)){
			return false;
		}
		UcTag ucTag = (UcTag) obj;
		return tagNo.equals(ucTag.getTagNo()) && tagName.equals(ucTag.getTagName());
	}
}
