package com.xinlianshiye.shoestp.consult.api.view;

import java.util.Date;
import java.util.List;

import com.xinlianshiye.shoestp.user.api.view.RFQSupplierView;

import lombok.Data;

@Data
public class RFQPurchaseContactView {

  private Integer pkey; // 主键
  private Date createdDate; // 添加时间
  private RFQSupplierView supplier; // 供应商
  private List<RFQConsultRelationView> relation; // 询盘关联
}
