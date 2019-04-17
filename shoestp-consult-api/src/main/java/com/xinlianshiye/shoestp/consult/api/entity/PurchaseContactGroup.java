package com.xinlianshiye.shoestp.consult.api.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "consult_purchase_contact_group")
public class PurchaseContactGroup {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer pkey; // 编号  INT

  private String name; // 字符100  STR(100)
  private Integer purchase; // 采购商 <表主键:UsrPurchase>  INT
  private Date createdTime; // 建档日期  DATE
  private Short rowVersion; // 版本  SHORT
}
