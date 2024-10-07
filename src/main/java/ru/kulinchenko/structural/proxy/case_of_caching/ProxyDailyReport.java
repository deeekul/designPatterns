package ru.kulinchenko.structural.proxy.case_of_caching;

import java.time.LocalDate;
import java.util.HashMap;
import java.util.Map;

public class ProxyDailyReport implements Report {

    private DailyReport dailyReport;

    private static Map<LocalDate, String> cache = new HashMap<>();

    public ProxyDailyReport(DailyReport dailyReport) {
        this.dailyReport = dailyReport;
    }

    @Override
    public String prepareReport(LocalDate localDate) {
        if (cache.get(localDate) == null) {
            String report = dailyReport.prepareReport(localDate);
            cache.put(localDate, report);
            return report;
        }
        return cache.get(localDate);
    }
}
