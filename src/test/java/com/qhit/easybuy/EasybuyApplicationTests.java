package com.qhit.easybuy;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.SQLException;

@SpringBootTest(properties = "application.properties")
class EasybuyApplicationTests {

    @Autowired
    DataSource dataSource;
    @Test
    void contextLoads() {
        try {
            System.out.println("获取的数据库连接为:"+dataSource.getConnection());
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
