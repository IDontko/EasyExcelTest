package com.alibaba.easyexcel.test.demo.read;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by softe on 2020/1/11.
 */
public class OrderDataListener extends AnalysisEventListener<OrderDataVo> {

    private OrderDataDao orderDataDao;

    List<OrderDataVo> orderList = new ArrayList<OrderDataVo>();

    public OrderDataListener(){
    }

    public OrderDataListener(OrderDataDao orderDataDao){
        this.orderDataDao = orderDataDao;
    }

    @Override
    public void invoke(OrderDataVo data, AnalysisContext context) throws Exception {
        orderDataDao.check(data);
        orderList.add(data);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext context) {
        orderDataDao.save(orderList);
    }
}
