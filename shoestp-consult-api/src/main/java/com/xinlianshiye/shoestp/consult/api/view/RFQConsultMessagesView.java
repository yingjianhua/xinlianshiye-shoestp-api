package com.xinlianshiye.shoestp.consult.api.view;

import java.util.List;

import lombok.Data;

@Data
public class RFQConsultMessagesView {

  public RFQConsultMessagesView(
      List<RFQConsultMessageView> msgs,
      RFQConsultMessageContactView myself,
      RFQConsultMessageContactView another) {
    this.msgs = msgs;
    this.myself = myself;
    this.another = another;
  }

  private List<RFQConsultMessageView> msgs;
  private RFQConsultMessageContactView myself;
  private RFQConsultMessageContactView another;
}
