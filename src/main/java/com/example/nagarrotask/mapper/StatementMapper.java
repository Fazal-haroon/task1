package com.example.nagarrotask.mapper;

import com.example.nagarrotask.entities.Statement;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import javax.websocket.server.PathParam;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.List;

@Mapper
public interface StatementMapper {
    @Select("SELECT * FROM statement")
    List<Statement> findAll();

    @Select("SELECT * from statement where datefield BETWEEN #{startDate} AND #{endDate}")
    List<Statement> getData_between(@PathParam("startDate") final BigDecimal startDate, @PathParam("endDate") final BigDecimal endDate);

    @Select("SELECT * from statement where amount BETWEEN #{fromAmount} AND #{toAmount} Order by amount ASC")
    List<Statement> getAmount_between(@PathParam("fromAmount") final BigDecimal fromAmount, @PathParam("toAmount") final BigDecimal toAmount);
}
