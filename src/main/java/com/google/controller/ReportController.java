package com.google.controller;

import com.google.service.ReportService;
import com.google.vo.ReportVO;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@CrossOrigin
@RequestMapping("/report")
public class ReportController {

    private final ReportService reportService;

    @PostMapping("/create")
    public ResponseEntity<Void> create(@RequestBody ReportVO reportVO) {
        reportService.create(reportVO);
        return new ResponseEntity<>(HttpStatus.ACCEPTED);
    }
}
