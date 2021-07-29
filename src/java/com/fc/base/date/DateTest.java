package com.fc.base.date;

/**
 * @ClassName DateTest
 * @Description TODO
 * @Author fangcheng
 * @Date 2021/4/22 10:17 上午
 * @Version 1.0
 */
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.temporal.ChronoUnit;
import java.util.Date;

public class DateTest {

    public static void main(String[] args) {
        Date date = new Date();
        date.setYear(119);
        date.setMonth(5);
        date.setDate(23);
        date.setHours(23);
        String s = calculateTimeDifference(date, new Date());
        System.out.println(s);

    }

    /**
     * 计算两个时间差（年，月，星期，日，时，分，秒）
     *
     * @param startDate
     * @param endDate
     * @return
     */
    public static String calculateTimeDifference(Date startDate, Date endDate) {
        if (null == startDate || null == endDate) {
            return "";
        }
        ZoneId zoneId = ZoneId.systemDefault();
        LocalDateTime fromDateTime = LocalDateTime.ofInstant(startDate.toInstant(), zoneId);
        LocalDateTime toDateTime = LocalDateTime.ofInstant(endDate.toInstant(), zoneId);

        LocalDateTime tempDateTime = LocalDateTime.from(fromDateTime);

        long years = tempDateTime.until(toDateTime, ChronoUnit.YEARS);
        tempDateTime = tempDateTime.plusYears(years);

        long months = tempDateTime.until(toDateTime, ChronoUnit.MONTHS);
        tempDateTime = tempDateTime.plusMonths(months);

        long days = tempDateTime.until(toDateTime, ChronoUnit.DAYS);
        tempDateTime = tempDateTime.plusDays(days);

        long hours = tempDateTime.until(toDateTime, ChronoUnit.HOURS);
        tempDateTime = tempDateTime.plusHours(hours);

        long minutes = tempDateTime.until(toDateTime, ChronoUnit.MINUTES);
        tempDateTime = tempDateTime.plusMinutes(minutes);

        long seconds = tempDateTime.until(toDateTime, ChronoUnit.SECONDS);


        return (0 == years ? "" : years + "年")
                + (0 == months ? "" : months + "月")
                + (0 == days ? "" : days + "天")
                + (hours + "小时")
                + (minutes + "小时")
                + (seconds + "秒");

    }
}
