package com.example.nagarrotask;


import com.example.nagarrotask.entities.Account;
import com.example.nagarrotask.entities.Statement;
import org.apache.ibatis.type.MappedTypes;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

@MappedTypes({Account.class, Statement.class})
@MapperScan("com.example.nagarrotask.mapper")
@SpringBootApplication
public class NagarroTaskApplication implements CommandLineRunner {

    @Autowired
    private JdbcTemplate template;

    public static void main(String[] args) {
        SpringApplication.run(NagarroTaskApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
//        template.update("INSERT INTO account(account_type, account_number) VALUES('test', '1233443543')");

//        List<Account> accountList = template.query("SELECT ID, account_type, account_number FROM account", new RowMapper<Account>() {
//            @Override
//            public Account mapRow(ResultSet rs, int rowNum) throws SQLException {
//                return new Account(rs.getInt("ID"), rs.getString("account_type"), rs.getString("account_number"));
//            }
//        });
//        accountList.forEach(System.out::println);

    }
}

