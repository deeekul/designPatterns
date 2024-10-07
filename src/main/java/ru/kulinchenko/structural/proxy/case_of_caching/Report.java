package ru.kulinchenko.structural.proxy.case_of_caching;

import java.time.LocalDate;

/* Интерфейс Отчёт */
public interface Report {

    String prepareReport(LocalDate localDate);
}
