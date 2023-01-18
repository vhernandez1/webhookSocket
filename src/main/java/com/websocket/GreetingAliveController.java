package com.websocket;

import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Controller;

@Controller
public class GreetingAliveController {

    @Scheduled(cron = "0 */3 * ? * *")
    public void startGreetingAlive() {

    }

}
