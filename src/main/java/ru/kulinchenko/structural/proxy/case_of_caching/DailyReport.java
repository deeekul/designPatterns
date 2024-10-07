package ru.kulinchenko.structural.proxy.case_of_caching;

import java.time.LocalDate;

/* Класс Ежедневный отчёт; метод подготовки отчёта за определённую дату */
public class DailyReport implements Report {

    @Override
    public String prepareReport(LocalDate localDate) {
        /* 1. Получение необходимых данных
           2. Подготовка отчёта
           3. Получение самого отчёта*/
        return "Ежедневный отчёт за " + localDate;
    }
}
