package com.example.nagarrotask.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Statement {
    private Integer id;
    private Integer accountId;
    private String date;
    private String amount;

}
