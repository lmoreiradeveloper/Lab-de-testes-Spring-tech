package com.lemoreiradev.listadetarefa.domain.config.properties;

import org.springframework.boot.context.properties.ConfigurationProperties;

//@ConfigurationProperties tranforma elementos do propeties para obj java
//prefix = "webservice.via-cep" é o prefixo onde tem as propriedades
//Esta config esta ligada no feignConfig atraves do @EnableConfigurationProperties
@ConfigurationProperties(prefix = "webservice.via-cep")
public class FeignConfigProperties {
    private String name;
    private String url;

    public FeignConfigProperties() {
    }

    public FeignConfigProperties(String name, String url) {
        this.name = name;
        this.url = url;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
