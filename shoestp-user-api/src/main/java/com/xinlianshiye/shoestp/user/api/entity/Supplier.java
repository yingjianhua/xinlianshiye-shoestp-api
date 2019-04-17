package com.xinlianshiye.shoestp.user.api.entity;

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
@Table(name = "user_supplier")
public class Supplier {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column
  private Integer pkey; // 编号  INT

  private Integer role; // 供应商角色 <表主键:UsrSupplierRole>  INT
  private String loginName; // 登录账号  STR(50)
  private String password; // 密码  STR(40)<null>
  private Byte status; // 审核状态 <OStatus>  BYTE
  // INIT:0,未审核
  // APPR:1,审核通过
  // FAIL:2,审核不通过
  private Integer apprBy; // 审核员 <表主键:SysUser>  INT<null>
  private Date apprTime; // 审核时间  TIME<null>
  private String reason; // 审核不通过理由备注  STR(100)<null>
  private String closeReason; // 店铺关闭原因  STR(100)<null>
  private Byte storeStatus; // 店铺状态 <SStatus>  BYTE
  // DOWN:0,关闭
  // OPEN:1,开启
  private String englishName; // 英文名称  STR(100)
  private String annualProduction; // 年产量  STR(100)<null>
  private String postcode; // 邮编  STR(20)<null>
  private String targetedMarket; // 目标市场  STR(100)
  private String contactEmail; // 联系人邮箱  STR(100)<null>
  private Date applicationTime; // 申请时间  DATE
  private Date storeopenTime; // 店铺开通时间  DATE<null>
  private String name; // 名称  STR(100)
  private String registeredCapital; // 注册资金  STR(100)
  private Integer category; // 供应商分类 <表主键:UsrSupplierCategory>  INT
  private Byte isAuth; // 供应商认证 <OIsAuth>  BYTE
  // NO:0,未认证
  // YES:1,已认证
  private Integer sort; // 排序号  INT
  private String seoTitle; // 店铺关键字  JSONOBJECT<null>
  private String seoKeyword; // 店铺关键字  JSONOBJECT<null>
  private String seoContent; // 搜索引擎说明  JSONOBJECT<null>
  private Date authTime; // 认证时间  TIME<null>
  private String showName; // 网站显示名称  JSONOBJECT<null>
  private String entity; // 企业法人  STR(100)<null>
  private String companyType; // 企业类型  JSONOBJECT<null>
  private String companyNature; // 企业性质  JSONOBJECT<null>
  private String creditCode; // 信用代码  STR(100)
  private Date companyEstablishTime; // 成立时间  DATE<null>
  private String operationTerm; // 业务期限  STR(100)<null>
  private String mainSalesArea; // 主销售区  JSONOBJECT<null>
  private String mainProd; // 主要产品  JSONOBJECT<null>
  private String prodPattern; // 生产模式  JSONOBJECT
  private String companyAddr; // 地址  JSONOBJECT
  private String des; // 描述  STR(200)<null>
  private String email; // Email  STR(100)
  private String businessLicenseBeginTime; // 营业执照开始时间  STR(100)<null>
  private String businessLicenseEndTime; // 营业执照到期时间  STR(100)<null>
  private Byte businessLicenseIsSecular; // 是否长期 <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  private String telephone; // 电话  STR(20)<null>
  private String fax; // 传真  STR(20)<null>
  private String qq; // QQ  STR(100)<null>
  private String certPhoto; // 资质证书  STR(200)<null>
  private String idCardFrontPhoto; // 法人身份证正面  STR(200)<null>
  private String idCardBackPhoto; // 法人身份证反面  STR(200)<null>
  private String coopCertPhoto; // 合作凭证  STR(200)<null>
  private String taxpayerType; // 纳税人类型  STR(100)<null>
  private String idCard; // 法人身份证号码  STR(50)<null>
  private String operateIdCard; // 运营身份证号码  STR(100)<null>
  private String contacts; // 联系人  JSONOBJECT<null>
  private String phone; // 手机  STR(20)<null>
  private String settlementBank; // 结算开户行  STR(100)<null>
  private String bankAccount; // 银行账号  STR(100)<null>
  private String bankBranch; // 银行开户行  STR(100)<null>
  private Integer bankCountry; // 国家管理 <表主键:PltCountry>  INT
  private Integer bankProvince; // 省份 <表主键:PltProvince>  INT
  private String contactsIdCardFrontPhoto; // 运营负责人身份证正面  STR(200)<null>
  private String contactsIdCardBackPhoto; // 运营负责人身份证反面  STR(200)<null>
  private String businessTyp; // Businesstyp  JSONOBJECT<null>
  private String location; // Location  JSONOBJECT<null>
  private String production; // Production  JSONOBJECT<null>
  private String developer; // Developer  JSONOBJECT<null>
  private String totalEmployees; // Totalemployees  JSONOBJECT<null>
  private String annualSales; // Annualsales  JSONOBJECT<null>
  private String top3Markets; // Top 3 Markets  JSONOBJECT<null>
  private String materials; // Materials  JSONOBJECT<null>
  private String headPic; // 头像  STR(200)<null>
  private String department; // 联系人部门  JSONOBJECT<null>
  private String jobTitle; // 联系人职称  JSONOBJECT<null>
  private String website; // Website  STR(100)<null>
  private Integer country; // 国家管理 <表主键:PltCountry>  INT
  private Integer province; // 省份 <表主键:PltProvince>  INT
  private String city; // City  JSONOBJECT<null>
  private Byte isPro; // 供应商首页产品展示 <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  private String logo; // logo  STR(200)<null>
  private String signBackgd; // 店招背景  STR(200)<null>
  private String adPhoto; // 广告图  JSONOBJECT<null>
  private String adPhotoMobile; // 移动端广告图  STR(1000)<null>
  private String adPhotoLink; // 广告连接  JSONOBJECT<null>
  private String companyPhoto; // 企业图片  JSONOBJECT<null>
  private String companyPhotoLink; // 企业图片连接  JSONOBJECT<null>
  private String homePageDiy; // 首页个性装修  JSONOBJECT<null>
  private String productPageDiy; // 产品页个性装修  JSONOBJECT<null>
  private String contactPageDiy; // 联系页个性装修  JSONOBJECT<null>
  private String companyIntroductionPageCustomDecoration; // 公司介绍页自定义装修  JSONOBJECT<null>
  private String homePageDiyMobile; // 首页个性装修（移动）  STR(1000)<null>
  private String productPageDiyMobile; // 产品页个性装修（移动）  STR(1000)<null>
  private String contactPageDiyMobile; // 联系页个性装修（移动）  STR(1000)<null>
  private Byte homePageOn; // 首页个性装修开关 <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  private Byte productPageOn; // 产品页个性装修开关 <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  private Byte contactPageOn; // 联系页个性装修开关 <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  private Byte bottomHomeProductsOn; // 首页底部产品展示开关 <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  private Byte homePosterOn; // 首页大海报开关 <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  private Byte homeBusinessBigPosterOn; // 首页企业大海报开关 <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  private Byte companyIntroductionPageCustomDecorationOn; // 公司介绍页自定义装修开关 <OYn>  BYTE
  // YES:1,是
  // NO:0,否
  private String traceCode; // 跟踪代码  TEXT(200)<null>
  private String webSizeTitle; // 自定义链接名称  STR(100)<null>
  private String webSite; // 网址  STR(100)<null>
  private String tongjiUrl; // 第三方统计地址  STR(200)<null>
  private String tongjiPwd; // 第三方统计密码  STR(40)<null>
  private Date updateTime; // 更新时间  TIME
  private Integer userid; // 用户 <表主键:UsrMain>  INT<null>
  private Short rowVersion; // 版本  SHORT
}
