package com.google.vo;

import lombok.Data;

import java.io.Serializable;

@Data
public class ReportVO implements Serializable {
    private SysReportVO sys;
    private ExtVO ext;
}
