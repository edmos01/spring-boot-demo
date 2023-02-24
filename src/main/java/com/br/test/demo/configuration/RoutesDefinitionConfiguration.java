package com.br.test.demo.configuration;

import org.apache.camel.builder.LambdaRouteBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RoutesDefinitionConfiguration {
//    @Bean
    public LambdaRouteBuilder myRouteBuilder() {
        return rb -> rb
            .from("timer:foo?period=2s")
            .log("Hello Lambda")
        ;
    }

    @Bean
    public LambdaRouteBuilder fileRouteBuilder() {
        return rb -> rb
            .from("file:///Users/eduardo.ramos/inbox")
            .log("${body}")
            .to("file:///Users/eduardo.ramos/outbox")
        ;
    }

}
