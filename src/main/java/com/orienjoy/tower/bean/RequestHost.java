package com.orienjoy.tower.bean;


/**
 * Created by Orienjoy on 2017/4/13.
 */
public class RequestHost {
    private RequestHost(Builder builder) {
        setId(builder.id);
        setHost(builder.host);
        setProject(builder.project);
        setDescription(builder.description);
        setCreateStaff(builder.createStaff);
        setCreateTime(builder.createTime);
    }

    private int id;
    private String host;
    private String project;
    private String description;
    private String createStaff;
    private String createTime;

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

    public String getCreateStaff() {
        return createStaff;
    }

    public void setCreateStaff(String createStaff) {
        this.createStaff = createStaff;
    }

    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    private static final class Builder {
        private int id;
        private String host;
        private String project;
        private String description;
        private String createStaff;
        private String createTime;

        private Builder() { }

        public Builder id(int id) {
            this.id = id;
            return this;
        }

        public Builder host(String host) {
            this.host = host;
            return this;
        }

        public Builder project(String project) {
            this.project = project;
            return this;
        }

        public Builder description(String description) {
            this.description = description;
            return this;
        }

        public Builder createStaff(String createStaff) {
            this.createStaff = createStaff;
            return this;
        }

        public Builder createTime(String createTime) {
            this.createTime = createTime;
            return this;
        }

        public RequestHost build() {
            return new RequestHost( this );
        }

    }

}
