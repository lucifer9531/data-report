package com.google.service.impl;

import com.google.domain.SysReport;
import com.google.repository.ReportRepository;
import com.google.service.ReportService;
import com.google.vo.ExtVO;
import com.google.vo.ReportVO;
import com.google.vo.SysReportVO;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
@RequiredArgsConstructor
public class ReportServiceImpl implements ReportService {

    private final ReportRepository reportRepository;

    @Override
    @Transactional(rollbackFor = Exception.class)
    public void create(ReportVO reportVO) {
        SysReportVO sysReport = reportVO.getSys();
        ExtVO ext = reportVO.getExt();
        SysReport report = new SysReport();
        report.setBrowser(sysReport.getBrowser());
        report.setBrowserVersion(sysReport.getBrowserVersion());
        report.setCurrentDomain(sysReport.getCurrentDomain());
        report.setCurrentUrl(sysReport.getCurrentUrl());
        report.setDataType(sysReport.getDataType());
        report.setDeviceId(sysReport.getDeviceId());
        report.setDeviceOs(sysReport.getDeviceOs());
        report.setDeviceOsVersion(sysReport.getDeviceOsVersion());
        report.setDevicePlatform(sysReport.getDevicePlatform());
        report.setEntryTime(sysReport.getEntryTime());
        report.setEventName(sysReport.getEventName());
        report.setLanguage(sysReport.getLanguage());
        report.setPageOpenScene(sysReport.getPageOpenScene());
        report.setParentUrl(sysReport.getParentUrl());
        report.setPersistedTime(sysReport.getPersistedTime());
        report.setPreviousStayTime(sysReport.getPreviousStayTime());
        report.setReferrer(sysReport.getReferrer());
        report.setReferringDomain(sysReport.getReferringDomain());
        report.setRouteRule(sysReport.getRouteRule());
        report.setScreenWidth(sysReport.getScreenWidth());
        report.setScreenHeight(sysReport.getScreenHeight());
        report.setSdkType(sysReport.getSdkType());
        report.setSdkVersion(sysReport.getSdkVersion());
        report.setSessionUuid(sysReport.getSessionUuid());
        report.setTime(sysReport.getTime());
        report.setTitle(sysReport.getTitle());
        report.setToken(sysReport.getToken());
        report.setUid(sysReport.getUid());
        report.setUrlPath(sysReport.getUrlPath());
        report.setExt(ext.getExt());
         reportRepository.save(report);
    }
}
