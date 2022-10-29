package com.example.nagarrotask.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.time.LocalDate;


@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class Statement {
    private Integer ID;
    private Integer account_id;
    private String datefield;
    private String amount;

}
