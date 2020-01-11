package com.alibaba.easyexcel.test.demo.read;

import com.alibaba.fastjson.JSON;

import java.util.List;

/**
 * Created by softe on 2020/1/11.
 */
public class OrderDataDao {

    public void save(List<OrderDataVo> list) {
        for(OrderDataVo data : list){
            System.out.println(String.format("解析到一条数据:{0}",JSON.toJSONString(data)));
        }
        System.out.println("保存list" + list);
    }

    public void check(OrderDataVo orderDataVo) throws Exception{
        if(orderDataVo.getExpressName().equals("测试")){
            System.out.println("测试数据");
            throw new Exception("错误数据");
        }else {
            System.out.println("真实数据");
        }
    }
}
