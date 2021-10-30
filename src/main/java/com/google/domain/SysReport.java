package com.google.domain;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.io.Serializable;
import java.sql.Timestamp;

@Getter
@Setter
@Entity
@Table(name = "sys_report")
public class SysReport implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    /**
     * 浏览器名称
     */
    private String browser;
    /**
     * 浏览器版本
     */
    private String browserVersion;
    /**
     * 当前域
     */
    private String currentDomain;
    /**
     * 当前页面URl
     */
    private String currentUrl;
    /**
     * 埋点事件类型，se:工具自动埋点，be:业务手动埋点
     */
    private String dataType;
    /**
     * 客户端唯一凭证(设备凭证)
     */
    private String deviceId;
    /**
     * 设备系统
     */
    private String deviceOs;
    /**
     * 设备操作系统版本
     */
    private String deviceOsVersion;

    /**
     * 平台
     */
    private String devicePlatform;

    /**
     * 当前进入时间
     */
    private Timestamp entryTime;

    /**
     * 触发埋点的事件名称
     */
    private String eventName;

    /**
     * 本地语言
     */
    private String language;

    /**
     * 页面打开场景
     */
    private String pageOpenScene;

    /**
     * 上一页URL
     */
    private String parentUrl;
    /**
     *用户首次访问时间
     */
    private Timestamp persistedTime;
    /**
     * 上一页停留事件
     */
    private Integer previousStayTime;
    /**
     * referrer  数据来源
     */
    private String referrer;
    /**
     * eferrer 域名
     */
    private String referringDomain;
    /**
     * 路由规则
     */
    private String routeRule;
    /**
     * 客户端分辨率 width
     */
    private Integer screenWidth;
    /**
     * 客户端分辨率 height
     */
    private Integer screenHeight;
    /**
     * sdk类型（js，小程序、安卓、IOS、server、pc）
     */
    private String sdkType;
    /**
     * SDK 版本
     */
    private String sdkVersion;
    /**
     * 当前会话ID
     */
    private String sessionUuid;
    /**
     * 事件触发时间
     */
    private Timestamp time;
    /**
     * 页面标题
     */
    private String title;
    /**
     * token
     */
    private String token;
    /**
     * 用户clientID
     */
    private String uid;
    /**
     * 页面路径
     */
    private String urlPath;

    /**
     * 额外参数
     */
    private String ext;
}
