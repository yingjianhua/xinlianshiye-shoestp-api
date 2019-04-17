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
@Entity(name = "consult_consult")
@Table(name = "consult_consult")
public class Consult {

  public enum Type {
    RFQ, // FRQ询盘
    PRODUCT_INQUIRY, // 询盘
    PRIVATE_PRODUCT_INQUIRY, // 私人展会询盘
    SUPPLIER_INQUIRY // 供应商询盘
  }

  public enum Unit {
    PAIR, // Pairs
    TWENTY_FOOT_CONTAINER, // Twenty-Foot Container
    FORTY_FOOT_CONTAINER, // Forty-Foot Container
  }

  public enum VerifyStatus {
    UNAUDITED, // 未审核
    FAIL, // 未通过
    PASS // 通过
  }

  public enum Status {
    READY, // 待发布
    RUNING, // 进行中
    COMPLETE, // 已完成
    CLOSE, // 已关闭
  }

  public enum ShippingType {
    FOB, // FOB
    CIF, // CIF
    CNF, // CNF
    CRF // CRF
  }

  public enum Recommend {
    NOT_RECOMMENDED, // 不推荐
    RECOMMENDED // 推荐
  }

  public enum PayType {
    TT, // T/T
    LC, // L/C
    DP, // D/P
    WesternUnion, // Western Union
    MoneyGram // Money Gram
  }

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer pkey; // 编号  INT

  @Column private String title; // 标题  STR(500)
  private String image; // 图片  STR(2000)<null>
  private Integer country; // 国家管理 <表主键:PltCountry>  INT
  private Integer product; // 产品 <表主键:PdtProduct>  INT<null>
  private String content; // 内容  STR(200)<null>
  private Integer leftCount; // 剩余抢单次数  INT
  private Integer quantity; // 商品数量  INT

  @Column(name = "unit", nullable = false)
  @Enumerated(EnumType.ORDINAL)
  private Unit unit; // 货物单位

  private Integer purchaseId; // 采购商 <表主键:UsrPurchase>  INT
  private Integer supplierId; // 供应商 <表主键:UsrSupplier>  INT<null>.

  @Column(name = "type", nullable = false)
  @Enumerated(EnumType.ORDINAL)
  private Type type; // 询盘类型

  @Column(name = "status", nullable = false)
  @Enumerated(EnumType.ORDINAL)
  private Status status; // RFQ状态 <RFQConsultStatus>  BYTE
  // ready:1,待发布
  // runing:2,进行中
  // complete:3,已完成
  // close:4,已关闭
  @Column(name = "verify_status", nullable = false)
  @Enumerated(EnumType.ORDINAL)
  private VerifyStatus verifyStatus; // 审核状态 <RFQConsultVerifyStatus>  BYTE
  // UNAUDITED:1,未审核
  // FAIL:2,未通过
  // PASS:3,通过
  private Date validDate; // 有效期至  TIME
  private String price; // 价格(价格区间)  STR(20)<null>

  @Column(name = "pay_type", nullable = false)
  @Enumerated(EnumType.ORDINAL)
  private PayType payType; // 支付方式 <RFQConsultPayType>  BYTE<null>
  // TT:1,T/T
  // LC:2,L/C
  // DP:3,D/P
  // WesternUnion:4,Western Union
  // MoneyGram:5,Money Gram
  @Column(name = "shipping_type", nullable = false)
  @Enumerated(EnumType.ORDINAL)
  private ShippingType shippingType; // 配送方式 <RFQConsultShippingType>  BYTE<null>
  // FOB:1,FOB
  // CIF:2,CIF
  // CNF:3,CNF
  // CRF:4,CRF
  private Integer currency; // 费率设置 <表主键:PltErate>  INT<null>
  private Date lastMessageSendTime; // 时间  TIME
  private String extraRequest; // 字符100  STR(100)<null>
  private String productRequest; // JSON  JSONOBJECT<null>
  private String destination; // 目的地  STR(200)<null>
  private Integer total; // 总抢单数  INT
  private Short changeCount; // 修改总数  SHORT
  private String extraDescription; // 额外信息  JSONOBJECT
  private Date createTime; // 创建时间  TIME
  private Byte isDeleted; // 是否已删除 <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  @Column(name = "recommend", nullable = false)
  @Enumerated(EnumType.ORDINAL)
  private Recommend recommend; // 是否推荐 <RFQConsultRecommend>  BYTE<null>
  // NOTRECOMMENDED:0,不推荐
  // RECOMMENDED:1,推荐
  private Short rowVersion; // 版本  SHORT
}
