package com.xinlianshiye.shoestp.consult.api.entity;

import java.math.BigDecimal;
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
@Table(name = "consult_consult_relation")
public class ConsultRelation {

  /**
   * 询盘关联的消息读取状态
   *
   * @author Jianhua Ying
   * @date 2019年3月26日
   */
  public enum ReadStatus {
    PURCHASE_UNREAD, // 采购商未读
    PURCHASE_HADREAD, // 采购商已读
    SUPPLIER_UNREAD, // 供应商未读
    SUPPLIER_HADREAD, // 供应商已读
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer pkey; // 编号  INT

  private Integer consult; // 询盘 <表主键:RFQConsult>  INT
  private Integer supplierId; // 供应商 <表主键:UsrSupplier>  INT
  private Integer purchaseId; // 采购商 <表主键:UsrPurchase>  INT
  private Byte inRecycleBin; // 是否在回收站 <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  private Byte favorite; // 是否添加FLAG <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  private String title; // 字符200  STR(200)<null>
  private String description; // 描述  STR(2000)<null>
  private String image; // 图片(多图)  JSONOBJECT
  private Integer quantity; // 数量  INT
  private Byte unit; // 货物单位 <RFQConsultUnit>  BYTE
  // PAIR:1,Pairs
  // TwentyFootContainer:2,Twenty-Foot Container
  // FortyFootContainer:3,Forty-Foot Container
  private BigDecimal minprice; // 价格区间  DEC(16,2)
  private BigDecimal maxprice; // 价格区间  DEC(16,2)
  private Integer currency; // 费率设置 <表主键:PltErate>  INT
  private Date validDate; // 日期时间  TIME<null>
  private Byte paytype; // 支付方式 <RFQConsultPayType>  BYTE
  // TT:1,T/T
  // LC:2,L/C
  // DP:3,D/P
  // WesternUnion:4,Western Union
  // MoneyGram:5,Money Gram
  private Byte transittype; // 配送方式 <RFQConsultShippingType>  BYTE
  // FOB:1,FOB
  // CIF:2,CIF
  // CNF:3,CNF
  // CRF:4,CRF
  private Byte sample; // 是否 <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  private String companydescribe; // 字符2000  STR(2000)<null>
  private String throwaway; // JSON  JSONOBJECT
  private Date createDate; // 建档时间  TIME
  private Integer lastMessage; // 询盘留言 <表主键:RFQConsultMessage>  INT<null>
  private Date lastMessageSendTime; // 时间  TIME

  @Column(name = "read_status", nullable = false)
  @Enumerated(EnumType.ORDINAL)
  private ReadStatus readStatus; // 询盘关联的消息读取状态 <RFQConsultRelationReadStatus>  BYTE
  // PURCHASEUNREAD:1,采购商未读
  // PURCHASEHADREAD:2,采购商已读
  // SUPPLIERUNREAD:3,供应商未读
  // SUPPLIERHADREAD:4,供应商已读
  private Byte isNew; // 是否 <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  private Byte isDeletedPurchase; // 是否 <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  private Byte isDeletedSupplier; // 是否 <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  private Short rowVersion; // 版本  SHORT
}
