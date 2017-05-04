package com.orienjoy.tower.domain;


import java.io.Serializable;

/**
 * Created by Orienjoy on 2017/5/5.
 */
public class Env implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;

    private String env;

    private String hostInnerIp;

    private String hostOuterIp;

    private String mysqlInnerIp;

    private String mysqlOuterIp;

    private String mysqlPort;

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

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

    @Override
    public String toString() {
        return "Env{" +
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
