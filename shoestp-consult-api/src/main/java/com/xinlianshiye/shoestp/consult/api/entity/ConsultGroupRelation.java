package com.xinlianshiye.shoestp.consult.api.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "consult_consult_group_relation")
public class ConsultGroupRelation {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer pkey; // 编号  INT

  private Integer consult; // 询盘 <表主键:RFQConsult>  INT
  private Integer consultGroup; // 询盘分组 <表主键:RFQConsultGroup>  INT
  private Integer supplier; // 供应商 <表主键:UsrSupplier>  INT
  private Short rowVersion; // 版本  SHORT
}
