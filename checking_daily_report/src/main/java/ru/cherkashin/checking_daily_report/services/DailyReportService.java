package ru.cherkashin.checking_daily_report.services;

import org.springframework.stereotype.Service;
import ru.cherkashin.checking_daily_report.models.DailyReport;

import java.util.List;

@Service
public class DailyReportService {

    public boolean dailyReportIsCorrect(List<DailyReport> dailyReportList){
        boolean isCorrect = true;
        for(DailyReport dailyReport : dailyReportList){
            if(dailyReport.getDescription().equals("Ничего не делал")){
                isCorrect = false;
            }
        }
        return isCorrect;
    }

}
