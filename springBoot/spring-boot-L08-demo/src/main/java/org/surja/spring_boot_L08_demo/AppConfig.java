package org.surja.spring_boot_L08_demo;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.surja.keywordAnalyser.DefaultKeywordAnalyserImp;
import org.surja.keywordAnalyser.KeywordAnalyserInterface;

@Configuration //This class is used to create and register beans manually

// here , any class that implements KeywordAnalyserInterface interface
// does not contains @Component annotation
// so we have to create beans manually
public class AppConfig {

    @Bean
    public KeywordAnalyserInterface defaultKeywordAnalyser(){
        return new DefaultKeywordAnalyserImp();
    }

}
