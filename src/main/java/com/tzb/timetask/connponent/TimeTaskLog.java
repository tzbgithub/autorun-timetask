package com.tzb.timetask.connponent;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

/**
 * Create by zhatang on 2020/12/8.
 */
@Component
public class TimeTaskLog {
    private Logger LOGGER = LoggerFactory.getLogger(TimeTaskLog.class);

    /**
     * cron表达式：Seconds Minutes Hours DayofMonth Month DayofWeek [Year]
     * 每1s钟执行下面的处理方法
     */
    @Scheduled(cron = "0/1 * * ? * ?")
    private void cancelTimeOutOrder() {
        LOGGER.info("定时任务_自动化处理模板_执行日志打印方法");
    }
}
