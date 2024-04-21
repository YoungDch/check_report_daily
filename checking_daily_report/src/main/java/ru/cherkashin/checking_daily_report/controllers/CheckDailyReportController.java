package ru.cherkashin.checking_daily_report.controllers;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ru.cherkashin.checking_daily_report.models.DailyReport;
import ru.cherkashin.checking_daily_report.services.DailyReportService;

import java.util.List;

@RestController
@RequestMapping("/daily_report")
public class CheckDailyReportController {

    private final DailyReportService dailyReportService;

    public CheckDailyReportController(DailyReportService dailyReportService) {
        this.dailyReportService = dailyReportService;
    }

    @PostMapping("/checking")
    public ResponseEntity<Boolean> checkDailyReport(@RequestBody List<DailyReport> dailyReport){
        boolean isCorrect = dailyReportService.dailyReportIsCorrect(dailyReport);
        return ResponseEntity.status(200).body(isCorrect);
    }


}
