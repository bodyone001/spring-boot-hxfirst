package com.hxfirst.Task;

import cn.hutool.core.date.DateUtil;
import com.hxfirst.dto.Greeting;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.messaging.simp.SimpMessagingTemplate;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

import java.util.Date;

@Slf4j
@Component
public class ServerTask {

    @Autowired
    private SimpMessagingTemplate wsTemplate;

    /**
     * 按照标准时间来算，每隔 2s 执行一次
     */
    @Scheduled(cron = "0/2 * * * * ?")
    public void websocket() throws Exception {
        log.info("【推送消息】开始执行：{}", DateUtil.formatDateTime(new Date()));
        // 查询服务器状态
        wsTemplate.convertAndSend("/topic/greetings",
                new Greeting(DateUtil.formatDateTime(new Date())));
        log.info("【推送消息】执行结束：{}", DateUtil.formatDateTime(new Date()));
    }

}
