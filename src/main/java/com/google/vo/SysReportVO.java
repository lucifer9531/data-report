package com.google.vo;

import lombok.Data;

import java.io.Serializable;
import java.sql.Timestamp;

@Data
public class SysReportVO implements Serializable {
    private String browser;
    private String browserVersion;
    private String currentDomain;
    private String currentUrl;
    private String dataType;
    private String deviceId;
    private String deviceOs;
    private String deviceOsVersion;
    private String devicePlatform;
    private Timestamp entryTime;
    private String eventName;
    private String language;
    private String pageOpenScene;
    private String parentUrl;
    private Timestamp persistedTime;
    private Integer previousStayTime;
    private String referrer;
    private String referringDomain;
    private String routeRule;
    private Integer screenWidth;
    private Integer screenHeight;
    private String sdkType;
    private String sdkVersion;
    private String sessionUuid;
    private Timestamp time;
    private String title;
    private String token;
    private String uid;
    private String urlPath;
}
