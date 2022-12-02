package com.atguigu.distributedlock.pojo;

import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

/**
 * Description:
 *
 * @Author: qianwenqian
 * @Date: 2022/12/2 9:47
 */
@Data
@TableName("db_stock")
public class Stock {

    @TableId
    private Long id;

    private String productCode;

    private String stockCode;

    private Integer count;
}
