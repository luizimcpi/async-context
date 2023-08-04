package io.github.luizimcpi.asynccontext.service;


import lombok.extern.slf4j.Slf4j;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;

import java.util.Locale;

import static io.github.luizimcpi.asynccontext.config.AsyncConfig.THREAD_POOL_TASK_EXECUTOR;

@Service
@Slf4j
public class CarsService {


    @Async(THREAD_POOL_TASK_EXECUTOR)
    public void processCarsByLanguage(){
        log.info("Initializing get locale...");
        Locale locale = LocaleContextHolder.getLocale();
        log.info("Locale here : {}", locale.getLanguage());
    }

    public void processCarsByLanguageSync(){
        log.info("Initializing get locale...");
        Locale locale = LocaleContextHolder.getLocale();
        log.info("Locale here : {}", locale.getLanguage());
    }
}
