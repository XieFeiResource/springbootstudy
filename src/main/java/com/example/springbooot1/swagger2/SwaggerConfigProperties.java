package com.example.springbooot1.swagger2;

import lombok.Data;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

import java.io.Serializable;

@Data
@ConfigurationProperties(prefix = "sop.swagger")
@Component
public class SwaggerConfigProperties implements Serializable {
    /**
     * 是否开启Swagger
     */
    private boolean enable;
    /**
     * 要扫描的包
     */
    private String packageScan;
    /**
     * 标题
     */
    private String title;
    /**
     * 描述
     */
    private String description;
    /**
     * 版本信息
     */
    private String version;
}
