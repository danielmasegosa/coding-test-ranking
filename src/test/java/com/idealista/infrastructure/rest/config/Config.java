package com.idealista.infrastructure.rest.config;

import com.idealista.application.CalculateAdsScore;
import com.idealista.application.RetrieveIrrelevantAds;
import com.idealista.application.RetrievePublicAds;
import org.mockito.Mockito;
import org.springframework.boot.autoconfigure.condition.ConditionalOnMissingBean;
import org.springframework.boot.test.context.TestConfiguration;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@TestConfiguration
@ComponentScan({"com.idealista.infrastructure.api.inbound"})
public class Config {

    @Bean
    @ConditionalOnMissingBean(name = "calculateAdScore")
    CalculateAdsScore calculateAdsScore() {
        return Mockito.mock(CalculateAdsScore.class);
    }

    @Bean
    @ConditionalOnMissingBean(name = "retrieveIrrelevantAds")
    RetrieveIrrelevantAds retrieveIrrelevantAds() {
        return Mockito.mock(RetrieveIrrelevantAds.class);
    }

    @Bean
    @ConditionalOnMissingBean(name = "retrievePublicAds")
    RetrievePublicAds retrievePublicAds() {
        return Mockito.mock(RetrievePublicAds.class);
    }
}
