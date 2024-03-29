package com.xinlianshiye.shoestp.consult.api.view;

import java.util.Date;
import java.util.List;

import lombok.Data;

@Data
public class RFQConsultView {
  private Integer pkey; // 询盘主键
  private String title; // 询盘标题(产品名称)
  private String detail; // 询盘详细描述
  private Integer quantity; // 询盘数量
  private String unit; // 数量单位
  private String price; // 单位价格
  private String currency; // 货币单位
  private Byte type; // 询盘类型
  private List<String> moreInformation; // RFQ询盘专用字段, 可以额外编辑三次
  private Date valieDate; // 有效时间
  private String paymentTerms; // 支付条约
  private String destination; // 目的地
  private String shippingTerms; // 运送条款
  private String extraRequest; // 额外请求
  private List<RFQConsultProductView> productRequest; // 感兴趣产品列表
  private String productImage; // 产品图片 只有产品询盘和私人展厅产品询盘时 该字段会有值
  private List<String> images; // 询盘图片
  private List<RFQConsultRelationView> relations; // 询盘关联
  private Byte verifyStatus; // 审核状态 	1: 未审核, 2: 未通过, 3: 通过
  private Byte status; // 询盘状态 1: 待发布, 2: 进行中,3: 已完成, 4: 已关闭
  private Short changeCount; // 编辑次数(RFQ有三次编辑额外内容的机会, 每编辑一次 改字段+1, RFQ类型专用字段)
}
