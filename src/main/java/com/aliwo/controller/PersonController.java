package com.aliwo.controller;

import com.aliwo.entity.Person;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author xuyayuan
 * @data 2021年06月01日
 * springboot 整合 jsp
 */
// 第一步在 project structure 中的 modules下的web resource directiors 指定webapp的目录
// 第二步：添加webapp为资源文件在pom文件中
//  <resources>
//      <resource>
//          <directory>/src/main/webapp</directory>
//          <targetPath>META-INF/resources</targetPath>
//          <includes>
//              <include>**/*.*</include>
//          </includes>
//      </resource>
//  </resources>
//  第三步 添加依赖
//          <!--jasper依赖，用于解析jsp页面-->
//      <dependency>
//          <groupId>org.apache.tomcat.embed</groupId>
//          <artifactId>tomcat-embed-jasper</artifactId>
//      </dependency>
@Controller
@RequestMapping("/user")
public class PersonController {

    @RequestMapping(value = "/register", method = RequestMethod.POST)
    public String register(Person person, Model model) {
        model.addAttribute("person");
        return "jsp/welcome";
    }
}
