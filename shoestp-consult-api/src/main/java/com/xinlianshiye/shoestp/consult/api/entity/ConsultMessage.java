package com.xinlianshiye.shoestp.consult.api.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

@Data
@Entity
@Table(name = "consult_consult_message")
public class ConsultMessage {

  public enum Type {
    TEXT, // 文本信息
    IMAGE, // 图片信息
    URL, // 链接类型
    PRIVATE_PRODUCT_URL // 私人展厅产品链接消息
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer pkey; // 编号  INT

  private String content; // 内容  JSONOBJECT

  @Column(name = "type", nullable = false)
  @Enumerated(EnumType.ORDINAL)
  private Type type; // 消息体类型 <RFQConsultMessageType>  BYTE
  // TEXT:1,文本信息
  // IMAGE:2,图片信息
  // URL:3,链接类型
  // PRIVATEPRODUCTURL:4,私人展厅产品链接消息
  private Date sendTime; // 留言时间  TIME
  private Integer relation; // 询盘关联 <表主键:RFQConsultRelation>  INT
  private Byte p2s; // 是采购商留言 <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  private Byte hadRead; // 是否 <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  private Short rowVersion; // 版本  SHORT
  private Date privateProductUrlMessageValidDate; // 时间  TIME<null>
  private Integer privateProductUrlMessageProductId; // INT  INT<null>
  private String privateProductUrlMessageUuid; // 字符100  STR(100)<null>
}
