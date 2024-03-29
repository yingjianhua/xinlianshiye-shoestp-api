package com.xinlianshiye.shoestp.consult.api.view;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

import lombok.Data;

/**
 * 报价信息
 *
 * @author Jianhua Ying
 */
@Data
public class RFQQuotationView {

  private Integer pkey; // 主键
  private String title; // 标题
  private String description; // 描述
  private Integer quantity; // 数量
  private String unit; // 数量单位
  private List<RFQQuotationImageView> images; // 图片 多图
  private BigDecimal minPrice; // 最低价格
  private BigDecimal maxPrice; // 最高价格
  private RFQCurrencyView currency; // 货币缩写
  private Date validDate; // 有效时间
  private String paymentTerms; // 支付条约
  private String shippingTerms; // 运送条款
  private Boolean sample; // 是否有样品
  private String companyProfile; // 公司简介
  private List<RFQQuotationThrowawayView> throwaways; // 公司宣传手册
  private Boolean isNew; // 是否是新报价
  private Date createDate; // 报价时间
}
