package com.example.demo.configuation;
import  io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@Configuration
@EnableSwagger2
public class SwaggerConfiguation {
    @Bean
    public Docket createRestApi() {
        return new Docket(DocumentationType.SWAGGER_2)
                //.apiInfo(apiInfo())
                .select()
                .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class)) //只生成被ApiOperation这个注解注解过的api接口
                .paths(PathSelectors.any())//路径判断
                .build();
    }
}


/*public class SwaggerConfiuration {
        @Bean
        public Docket CreatApi() {

            return new Docket(DocumentationType.SWAGGER_2)
                    .select()
                    .apis(RequestHandlerSelectors.withMethodAnnotation(ApiOperation.class))
                    //.apis(RequestHandlerSelectors.basePackage("com.example.demo"))
                    .paths(PathSelectors.any())
                    .build().apiInfo(new ApiInfoBuilder()
                            .description("Echo测试文档")
                            .contact(new Contact("Echo", "http://github.com/lenve", "wangsong0210@gmail.com"))
                            .version("v1.0")
                            .title("Echo测试文档")
                            .license("Apache2.0")
                            .licenseUrl("http://www.apach.org/licenses/LICENSE-2.0")
                            .build());
        }
    }*/
