package com.xinlianshiye.shoestp.consult.api.view;

import com.xinlianshiye.shoestp.user.api.view.RFQSupplierView;

import lombok.Data;

@Data
public class RFQConsultRelationView {

  private Boolean unread; // 是否有未读消息
  private RFQQuotationView quotation; // 报价信息
  private RFQSupplierView supplier; // 供应商
  private RFQConsultView consult; // 询盘
}
