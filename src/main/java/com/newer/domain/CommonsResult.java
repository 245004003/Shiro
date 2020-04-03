package com.newer.domain;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * Create by 何辉
 * 2020/3/28 22:58
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class CommonsResult<T> {
    private Integer code;
    private String message;
    private T       data;
    public CommonsResult(Integer code,String message){
          this(code,message,null);
    }
}
