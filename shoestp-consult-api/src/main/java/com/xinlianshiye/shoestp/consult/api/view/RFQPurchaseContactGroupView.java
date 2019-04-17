package com.xinlianshiye.shoestp.consult.api.view;

import lombok.Data;

@Data
public class RFQPurchaseContactGroupView {

  private Integer pkey;
  private String name;
  private Integer count; // 该分组下有几个联系人
}
