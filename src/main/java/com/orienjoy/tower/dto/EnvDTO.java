package com.orienjoy.tower.dto;

/**
 * Created by Orienjoy on 2017/5/6.
 */
public class EnvDTO {
    Integer id;
    String env;
    String hostInnerIp;
    String hostOuterIp;
    String mysqlInnerIp;
    String mysqlOuterIp;
    String mysqlPort;

    public EnvDTO() {}

    private EnvDTO(Builder builder) {
        setId(builder.id);
        setEnv(builder.env);
        setHostInnerIp(builder.hostInnerIp);
        setHostOuterIp(builder.hostOuterIp);
        setMysqlInnerIp(builder.mysqlInnerIp);
        setMysqlOuterIp(builder.mysqlOuterIp);
        setMysqlPort(builder.mysqlPort);
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() { return id; }

    public String getEnv() {
        return env;
    }

    public void setEnv(String env) {
        this.env = env;
    }

    public String getHostInnerIp() {
        return hostInnerIp;
    }

    public void setHostInnerIp(String hostInnerIp) {
        this.hostInnerIp = hostInnerIp;
    }

    public String getHostOuterIp() {
        return hostOuterIp;
    }

    public void setHostOuterIp(String hostOuterIp) {
        this.hostOuterIp = hostOuterIp;
    }

    public String getMysqlInnerIp() {
        return mysqlInnerIp;
    }

    public void setMysqlInnerIp(String mysqlInnerIp) {
        this.mysqlInnerIp = mysqlInnerIp;
    }

    public String getMysqlOuterIp() {
        return mysqlOuterIp;
    }

    public void setMysqlOuterIp(String mysqlOuterIp) {
        this.mysqlOuterIp = mysqlOuterIp;
    }

    public String getMysqlPort() {
        return mysqlPort;
    }

    public void setMysqlPort(String mysqlPort) {
        this.mysqlPort = mysqlPort;
    }

    public static final class Builder {
        private Integer id;
        private String env;
        private String hostInnerIp;
        private String hostOuterIp;
        private String mysqlInnerIp;
        private String mysqlOuterIp;
        private String mysqlPort;

        public Builder(){}

        public Builder id(Integer val) {
            id = val;
            return this;
        }
        public Builder env(String val) {
            env = val;
            return this;
        }
        public Builder hostInnerIp(String val) {
            hostInnerIp = val;
            return this;
        }
        public Builder hostOuterIp(String val) {
            hostOuterIp = val;
            return this;
        }
        public Builder mysqlInnerIp(String val) {
            mysqlInnerIp = val;
            return this;
        }
        public Builder mysqlOuterIp(String val) {
            mysqlOuterIp = val;
            return this;
        }
        public Builder mysqlPort(String val) {
            mysqlPort = val;
            return this;
        }

        public EnvDTO build() {
            return new EnvDTO(this);
        }

        @Override
        public String toString() {
            return "Builder{" +
                    "id=" + id +
                    ", env='" + env + '\'' +
                    ", hostInnerIp='" + hostInnerIp + '\'' +
                    ", hostOuterIp='" + hostOuterIp + '\'' +
                    ", mysqlInnerIp='" + mysqlInnerIp + '\'' +
                    ", mysqlOuterIp='" + mysqlOuterIp + '\'' +
                    ", mysqlPort='" + mysqlPort + '\'' +
                    '}';
        }
    }
}
