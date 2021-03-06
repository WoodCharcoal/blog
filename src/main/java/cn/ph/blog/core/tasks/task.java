package cn.ph.blog.core.tasks;

import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Component
/**
 * 开启定时任务注解
 */
@EnableScheduling
public class task {

    @Scheduled(fixedRate = 5000)
    public void job1(){
        System.out.println("定时任务1" + new Date());
    }

    @Scheduled(cron = "0/5 * * * * ?")
    public void job2(){
        System.out.println("定时任务2" + new Date());
    }

    //每隔5秒执行一次：*/5 * * * * ?
    //每隔1分钟执行一次：0 */1 * * * ?
    // 每天23点执行一次：0 0 23 * * ?
    // 每天凌晨1点执行一次：0 0 1 * * ?
    // 每月1号凌晨1点执行一次：0 0 1 1 * ?
    // 每月最后一天23点执行一次：0 0 23 L * ?
    // 每周星期天凌晨1点实行一次：0 0 1 ? * L
    // 在26分、29分、33分执行一次：0 26,29,33 * * * ?
    // 每天的0点、13点、18点、21点都执行一次：0 0 0,13,18,21 * * ?
    // 每隔5分钟执行一次：0 0/5 * * * ?

}
