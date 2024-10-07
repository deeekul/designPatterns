package ru.kulinchenko.creational.singleton;

/* Цель - гарантировать, что у класса будет только один единственный экземпляр и к нему будет предоставлена
 * глобальная точка доступа. */
public class ProgramLogger {

    private static ProgramLogger programLogger;

    private static String logFile = "This is logfile. \n\n";

    /* Если не будет слова synchronized и другой поток захочет обратиться к этому методу, результат может быть нехорошим */
    public static synchronized ProgramLogger getProgramLogger() {
        if (programLogger == null) {
            programLogger = new ProgramLogger();
        }
        return programLogger;
    }

    /* Приватный конструктор, чтобы пользователь создавал объект через специальный метод.
    * Если не будет конструктора, будет использоваться конструктор по умолчанию без параметров и можно будет создать
    * n-ое количество объектов класса. */
    private ProgramLogger() {
    }

    public void addLogInfo(String logInfo) {
        logFile += logInfo + "\n";
    }

    public void showLogFile() {
        System.out.println(logFile);
    }
}
