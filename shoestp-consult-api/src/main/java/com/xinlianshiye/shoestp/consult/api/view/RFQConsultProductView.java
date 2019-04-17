package com.xinlianshiye.shoestp.consult.api.view;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.xinlianshiye.shoestp.common.i18n.I18NFieldSerializer;

import lombok.Data;

@Data
public class RFQConsultProductView {

  private Integer pkey; // 产品主键

  @JsonSerialize(using = I18NFieldSerializer.class)
  private String name; // 产品名称

  private String image; // 产品图片
}
