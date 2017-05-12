package com.orienjoy.tower.domain;


import java.io.Serializable;
import java.util.Date;

/**
 * Created by Orienjoy on 2017/4/13.
 */
public class RequestHost implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;

    private String host;

    private String project;

    private String description;

    private Long createId;

    private Date createTime;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    public String getProject() {
        return project;
    }

    public void setProject(String project) {
        this.project = project;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getCreateId() {
        return createId;
    }

    public void setCreateId(Long createId) {
        this.createId = createId;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "RequestHost{" +
                "id=" + id +
                ", host='" + host + '\'' +
                ", project='" + project + '\'' +
                ", description='" + description + '\'' +
                ", createId=" + createId +
                ", createTime=" + createTime +
                '}';
    }

}
