package ru.kulinchenko.structural.proxy.case_of_caching;

import java.time.LocalDate;

/* Допустим, что получение и подготовка данных для отчёта занимает много ресурсов и времени. Поэтому мы решили,
что нам необходимо реализовать кэширование. И в случае, если кто-то из сотрудников обращается за отчётом после первого
обращения, мы помещаем этот отчёт во внутренний кэш. Второй сотрудник уже получит сохранённый в кэше отчёт, тем
самым не будем повторно получать данные и подготавливать отчёт.*/

public class ProxyLesson {

    public static void main(String[] args) {
        prepare(new ProxyDailyReport(new DailyReport()), LocalDate.now());
    }

    private static void prepare(Report report, LocalDate localDate) {
        System.out.println(report.prepareReport(localDate));
    }
}
