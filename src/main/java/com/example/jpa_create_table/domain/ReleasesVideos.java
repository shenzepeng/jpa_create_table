package com.example.jpa_create_table.domain;

import org.hibernate.annotations.GenericGenerator;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

// 发布中的视频
@Entity
public class ReleasesVideos {
    @Id
    @GeneratedValue(strategy= GenerationType.IDENTITY)
    @GenericGenerator(name = "increment", strategy = "increment")
    //主键Id
    private long id;
    private long releaseId;
    private long userId;
    private String videoUrl;
    private int status;
    private String blankSpaceOne;
    private String blankSpaceTwo;
    private String blankSpaceThree;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public long getReleaseId() {
        return releaseId;
    }

    public void setReleaseId(long releaseId) {
        this.releaseId = releaseId;
    }

    public long getUserId() {
        return userId;
    }

    public void setUserId(long userId) {
        this.userId = userId;
    }

    public String getVideoUrl() {
        return videoUrl;
    }

    public void setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
    }

    public int getStatus() {
        return status;
    }

    public void setStatus(int status) {
        this.status = status;
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
