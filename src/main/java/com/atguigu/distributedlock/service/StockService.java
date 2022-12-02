package com.atguigu.distributedlock.service;

import com.atguigu.distributedlock.mapper.StockMapper;
import com.atguigu.distributedlock.pojo.Stock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Description:
 *
 * @Author: qianwenqian
 * @Date: 2022/12/2 9:54
 */
@Service
public class StockService {

    @Autowired
    private StockMapper stockMapper;

    public void checkAndLock(){

        // 先查询库存是否充足
        Stock stock = this.stockMapper.selectById(1L);

        // 再减库存
        if(stock != null && stock.getCount()>0){
            stock.setCount(stock.getCount()-1);
            this.stockMapper.updateById(stock);
        }
    }
}
