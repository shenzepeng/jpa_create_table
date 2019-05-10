package com.example.jpa_create_table.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

//发布中的图片
@Entity
public class ReleasesImgs {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    //主键Id
    private long id;
    private String releaseId;
    private String imgUrl;
    private String createTime;
    private String updateTime;
    private String blankSpaceOne;
    private String blankSpaceTwo;
    private String blankSpaceThree;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(String releaseId) {
        this.releaseId = releaseId;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public String getBlankSpaceOne() {
        return blankSpaceOne;
    }

    public void setBlankSpaceOne(String blankSpaceOne) {
        this.blankSpaceOne = blankSpaceOne;
    }

    public String getBlankSpaceTwo() {
        return blankSpaceTwo;
    }

    public void setBlankSpaceTwo(String blankSpaceTwo) {
        this.blankSpaceTwo = blankSpaceTwo;
    }

    public String getBlankSpaceThree() {
        return blankSpaceThree;
    }

    public void setBlankSpaceThree(String blankSpaceThree) {
        this.blankSpaceThree = blankSpaceThree;
    }
}
