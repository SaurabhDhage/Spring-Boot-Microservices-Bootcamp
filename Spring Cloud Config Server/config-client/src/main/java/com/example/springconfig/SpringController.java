package com.example.springconfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;
import java.util.Map;

@RestController
@RefreshScope
public class SpringController {

    @Value("${my.msgs:default value}")
    private String msg;

    @Value("my.details")
    private String details;

    @Value("${my.details}")
    private String getDetails;

    @Value("${my.list}")
    private List<String> list;

    @Value("#{${my.key.value}}")
    private Map<String,String> map;

    @Autowired
    private DBSettings dbSettings;

   @Autowired
   private Environment env;

    @Override
    @GetMapping("get-data")
    public String toString() {
        return "SpringController{<br>" +
                " <br> <b>msg=</b>'" + msg + '\'' +
                " <br> <b>details=</b>'" + details + '\'' +
                " <br> <b>getDetails=</b>'" + getDetails + '\'' +
                " <br> <b>list=</b>" + list +
                " <br> <b>map=</b><br>" + map +
                '}';

    }
    @GetMapping("get-db")
    public String getDB(){
        return dbSettings.getName()+dbSettings.getHost()+env.getProperty("db.port");
    }
}
