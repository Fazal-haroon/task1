package com.example.nagarrotask.mapper;

import com.example.nagarrotask.entities.Account;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import javax.websocket.server.PathParam;
import java.util.List;

@Mapper
public interface AccountMapper {
    @Select("SELECT * FROM account")
    List<Account> getAllAccounts();

    @Select("SELECT * FROM account WHERE ID = #{id}")
    List<Account> findById(@PathParam("id") final Integer id);

    @Select("SELECT * FROM account WHERE ID = #{id}")
    Account getAccount(@PathParam("id") final Integer id);
}
