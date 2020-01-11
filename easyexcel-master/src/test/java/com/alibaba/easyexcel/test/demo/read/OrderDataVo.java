package com.alibaba.easyexcel.test.demo.read;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * Created by softe on 2020/1/11.
 */
@Data
public class OrderDataVo {
    @ExcelProperty("订单号")
    private String orderSn;

    @ExcelProperty("快递号")
    private String expressSn;

    @ExcelProperty("快递公司名称")
    private String expressName;

    @ExcelProperty("发货地址")
    private String expressAddress;


}
