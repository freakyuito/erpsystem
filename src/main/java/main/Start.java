package main;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * Created by Zhihui_Shen on 2018/6/4.
 */

@SpringBootApplication()
@MapperScan("cn.overseachem.erp.*")
@ComponentScan("cn.overseachem.erp.*")

public class Start {

    public static void main(String[] args) {

        SpringApplication.run(Start.class);     
    }


}
