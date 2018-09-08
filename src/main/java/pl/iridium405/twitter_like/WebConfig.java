package pl.iridium405.twitter_like;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.ResourceHandlerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {


        @Override
        public void addResourceHandlers(ResourceHandlerRegistry registry) {
            registry.addResourceHandler(
                    "/webjars/**",
                    "/img/**",
                    "/css/**",
                    "/js/**")
                    .addResourceLocations(
                            "classpath:/webjars/",
                            "classpath:/static/img/",
                            "classpath:/static/css/",
                            "classpath:/static/js/");
        }


}
