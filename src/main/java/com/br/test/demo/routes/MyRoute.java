package com.br.test.demo.routes;

import org.apache.camel.builder.RouteBuilder;
import org.springframework.stereotype.Component;

//@Component
public class MyRoute extends RouteBuilder {
    @Override
    public void configure() throws Exception {
//        from("timer:foo").to("log:bar");
        from("timer:mahoeee?period=3s")
            .setBody(constant("Mahhhh oeeee"))
        .to("log:bar");
    }
}
