package com.trapedza.bankfusion.bo.refimpl;

import java.math.BigDecimal;
import java.sql.Timestamp;

public interface IBOUBVW_SODETAILS extends
		com.trapedza.bankfusion.core.SimplePersistentObject {
	public static final String BONAME = "UBVW_SODETAILS";
	public static final String UBFIRSTPAYMENTAMT = "f_UBFIRSTPAYMENTAMT";
	public static final String UBNUMBEROFPAYMENTSFAILED = "f_UBNUMBEROFPAYMENTSFAILED";
	public static final String UBSOSUBPRODUCTTYPE = "f_UBSOSUBPRODUCTTYPE";
	public static final String UBLASTPROCESSEDDTTM = "f_UBLASTPROCESSEDDTTM";
	public static final String UBLASTPAYMENTAMT = "f_UBLASTPAYMENTAMT";
	public static final String UBNUMBEROFPAYMENTS = "f_UBNUMBEROFPAYMENTS";
	public static final String UBENDDTTM = "f_UBENDDTTM";
	public static final String UBALLOWDORMANCYPROCESSING = "f_UBALLOWDORMANCYPROCESSING";
	public static final String SHORTNAME = "f_SHORTNAME";
	public static final String UBDRNARRATIVE = "f_UBDRNARRATIVE";
	public static final String UBDESCRIPTION = "f_UBDESCRIPTION";
	public static final String UBSETTLEMENTINSTRUCTIONSID = "f_UBSETTLEMENTINSTRUCTIONSID";
	public static final String UBACCOUNTID = "f_UBACCOUNTID";
	public static final String UBSTARTDTTM = "f_UBSTARTDTTM";
	public static final String BENEFICIARYBANKCODE = "f_BENEFICIARYBANKCODE";
	public static final String UBPAYMENTAMT = "f_UBPAYMENTAMT";
	public static final String UBNUMBEROFPAYMENTSMADE = "f_UBNUMBEROFPAYMENTSMADE";
	public static final String UBSODTLIDPK = "boID";
	public static final String UBPAYMENTTYPE = "f_UBPAYMENTTYPE";
	public static final String UBRETRYLIMIT = "f_UBRETRYLIMIT";
	public static final String BENEFICIARYNAME = "f_BENEFICIARYNAME";
	public static final String UBLASTMAINTAINEDUSER = "f_UBLASTMAINTAINEDUSER";
	public static final String UBNEXTSTATUSEFFECTIVEDTTM = "f_UBNEXTSTATUSEFFECTIVEDTTM";
	public static final String BENEFICIARYPARTYIDENTIFIER = "f_BENEFICIARYPARTYIDENTIFIER";
	public static final String UBAMOUNTPAID = "f_UBAMOUNTPAID";
	public static final String VERSIONNUM = "versionNum";
	public static final String FREQUENCYUNIT = "f_FREQUENCYUNIT";
	public static final String UBRETRYAFTERPERIOD = "f_UBRETRYAFTERPERIOD";
	public static final String UBRULEDEFINITION = "f_UBRULEDEFINITION";
	public static final String SOID = "f_SOID";
	public static final String UBLASTMAINTAINEDDTTM = "f_UBLASTMAINTAINEDDTTM";
	public static final String BENEFICIARYADDR = "f_BENEFICIARYADDR";
	public static final String UBISOCURRENCYCODE = "f_UBISOCURRENCYCODE";
	public static final String UBINSUFFICIENTFUNDACTION = "f_UBINSUFFICIENTFUNDACTION";
	public static final String UBCREATEDTTM = "f_UBCREATEDTTM";
	public static final String UBREACTIVATIONDTTM = "f_UBREACTIVATIONDTTM";
	public static final String UBMINTRANSFERAMT = "f_UBMINTRANSFERAMT";
	public static final String BENEFICIARYBANKNAME = "f_BENEFICIARYBANKNAME";
	public static final String UBCUSTOMERCODE = "f_UBCUSTOMERCODE";
	public static final String UBNEXTSTATUS = "f_UBNEXTSTATUS";
	public static final String UBPAYMENTMODE = "f_UBPAYMENTMODE";
	public static final String UBSTATUSCHNGREASON = "f_UBSTATUSCHNGREASON";
	public static final String UBSUSPENSEACCOUNTID = "f_UBSUSPENSEACCOUNTID";
	public static final String UBAMOUNT = "f_UBAMOUNT";
	public static final String BENCUSTOMERCODE = "f_BENCUSTOMERCODE";
	public static final String BENEFICIARYBANKADDR = "f_BENEFICIARYBANKADDR";
	public static final String UBCHARGERETRYTHRESHOLD = "f_UBCHARGERETRYTHRESHOLD";
	public static final String UBCONTRAACCOUNTID = "f_UBCONTRAACCOUNTID";
	public static final String UBSOSTATUS = "f_UBSOSTATUS";
	public static final String FREQUENCYCODE = "f_FREQUENCYCODE";
	public static final String UBRUNMODE = "f_UBRUNMODE";
	public static final String UBCHARGECODE = "f_UBCHARGECODE";
	public static final String UBCRNARRATIVE = "f_UBCRNARRATIVE";
	public static final String UBHOLIDAYPROCESSTYPE = "f_UBHOLIDAYPROCESSTYPE";
	public static final String UBBUSINESSPROCESSSTATUS = "f_UBBUSINESSPROCESSSTATUS";
	public static final String BENINSTNAME = "f_BENINSTNAME";
	public static final String BENINSTCOUNTRY = "f_BENINSTCOUNTRY";
	public static final String UBALLOWEDNONPAYMENTS = "f_UBALLOWEDNONPAYMENTS";
	public static final String BENINSTCITY = "f_BENINSTCITY";
	public static final String UBPROCESSMODE = "f_UBPROCESSMODE";
	public static final String UBSOGROUP = "f_UBSOGROUP";
	public static final String UBISARCHIVE = "f_UBISARCHIVE";
	public static final String UBSURPLUSTHRESHOLDAMT = "f_UBSURPLUSTHRESHOLDAMT";
	public static final String CNT = "f_CNT";
	public static final String UBNEXTPROCESSINGDTTM = "f_UBNEXTPROCESSINGDTTM";
	public static final String UBBENEFICIARYCOUNTRY = "f_UBBENEFICIARYCOUNTRY";
	public static final String BENEFCUSTIDENTIFIERTYPE = "f_BENEFCUSTIDENTIFIERTYPE";
	public static final String UBISDELETE = "f_UBISDELETE";
	public static final String UBACCOUNTTYPE = "f_UBACCOUNTTYPE";

	public BigDecimal getF_UBFIRSTPAYMENTAMT();

	public void setF_UBFIRSTPAYMENTAMT(BigDecimal param);

	public Integer getF_UBNUMBEROFPAYMENTSFAILED();

	public void setF_UBNUMBEROFPAYMENTSFAILED(Integer param);

	public String getF_UBSOSUBPRODUCTTYPE();

	public void setF_UBSOSUBPRODUCTTYPE(String param);

	public Timestamp getF_UBLASTPROCESSEDDTTM();

	public void setF_UBLASTPROCESSEDDTTM(Timestamp param);

	public BigDecimal getF_UBLASTPAYMENTAMT();

	public void setF_UBLASTPAYMENTAMT(BigDecimal param);

	public Integer getF_UBNUMBEROFPAYMENTS();

	public void setF_UBNUMBEROFPAYMENTS(Integer param);

	public Timestamp getF_UBENDDTTM();

	public void setF_UBENDDTTM(Timestamp param);

	public String getF_UBALLOWDORMANCYPROCESSING();

	public void setF_UBALLOWDORMANCYPROCESSING(String param);

	public String getF_SHORTNAME();

	public void setF_SHORTNAME(String param);

	public String getF_UBDRNARRATIVE();

	public void setF_UBDRNARRATIVE(String param);

	public String getF_UBDESCRIPTION();

	public void setF_UBDESCRIPTION(String param);

	public String getF_UBSETTLEMENTINSTRUCTIONSID();

	public void setF_UBSETTLEMENTINSTRUCTIONSID(String param);

	public String getF_UBACCOUNTID();

	public void setF_UBACCOUNTID(String param);

	public Timestamp getF_UBSTARTDTTM();

	public void setF_UBSTARTDTTM(Timestamp param);

	public String getF_BENEFICIARYBANKCODE();

	public void setF_BENEFICIARYBANKCODE(String param);

	public BigDecimal getF_UBPAYMENTAMT();

	public void setF_UBPAYMENTAMT(BigDecimal param);

	public Integer getF_UBNUMBEROFPAYMENTSMADE();

	public void setF_UBNUMBEROFPAYMENTSMADE(Integer param);

	public String getF_UBPAYMENTTYPE();

	public void setF_UBPAYMENTTYPE(String param);

	public String getF_UBRETRYLIMIT();

	public void setF_UBRETRYLIMIT(String param);

	public String getF_BENEFICIARYNAME();

	public void setF_BENEFICIARYNAME(String param);

	public String getF_UBLASTMAINTAINEDUSER();

	public void setF_UBLASTMAINTAINEDUSER(String param);

	public Timestamp getF_UBNEXTSTATUSEFFECTIVEDTTM();

	public void setF_UBNEXTSTATUSEFFECTIVEDTTM(Timestamp param);

	public String getF_BENEFICIARYPARTYIDENTIFIER();

	public void setF_BENEFICIARYPARTYIDENTIFIER(String param);

	public BigDecimal getF_UBAMOUNTPAID();

	public void setF_UBAMOUNTPAID(BigDecimal param);

	public String getF_FREQUENCYUNIT();

	public void setF_FREQUENCYUNIT(String param);

	public Integer getF_UBRETRYAFTERPERIOD();

	public void setF_UBRETRYAFTERPERIOD(Integer param);

	public String getF_UBRULEDEFINITION();

	public void setF_UBRULEDEFINITION(String param);

	public String getF_SOID();

	public void setF_SOID(String param);

	public Timestamp getF_UBLASTMAINTAINEDDTTM();

	public void setF_UBLASTMAINTAINEDDTTM(Timestamp param);

	public String getF_BENEFICIARYADDR();

	public void setF_BENEFICIARYADDR(String param);

	public String getF_UBISOCURRENCYCODE();

	public void setF_UBISOCURRENCYCODE(String param);

	public String getF_UBINSUFFICIENTFUNDACTION();

	public void setF_UBINSUFFICIENTFUNDACTION(String param);

	public Timestamp getF_UBCREATEDTTM();

	public void setF_UBCREATEDTTM(Timestamp param);

	public Timestamp getF_UBREACTIVATIONDTTM();

	public void setF_UBREACTIVATIONDTTM(Timestamp param);

	public BigDecimal getF_UBMINTRANSFERAMT();

	public void setF_UBMINTRANSFERAMT(BigDecimal param);

	public String getF_BENEFICIARYBANKNAME();

	public void setF_BENEFICIARYBANKNAME(String param);

	public String getF_UBCUSTOMERCODE();

	public void setF_UBCUSTOMERCODE(String param);

	public String getF_UBNEXTSTATUS();

	public void setF_UBNEXTSTATUS(String param);

	public String getF_UBPAYMENTMODE();

	public void setF_UBPAYMENTMODE(String param);

	public String getF_UBSTATUSCHNGREASON();

	public void setF_UBSTATUSCHNGREASON(String param);

	public String getF_UBSUSPENSEACCOUNTID();

	public void setF_UBSUSPENSEACCOUNTID(String param);

	public BigDecimal getF_UBAMOUNT();

	public void setF_UBAMOUNT(BigDecimal param);

	public String getF_BENCUSTOMERCODE();

	public void setF_BENCUSTOMERCODE(String param);

	public String getF_BENEFICIARYBANKADDR();

	public void setF_BENEFICIARYBANKADDR(String param);

	public Integer getF_UBCHARGERETRYTHRESHOLD();

	public void setF_UBCHARGERETRYTHRESHOLD(Integer param);

	public String getF_UBCONTRAACCOUNTID();

	public void setF_UBCONTRAACCOUNTID(String param);

	public String getF_UBSOSTATUS();

	public void setF_UBSOSTATUS(String param);

	public String getF_FREQUENCYCODE();

	public void setF_FREQUENCYCODE(String param);

	public String getF_UBRUNMODE();

	public void setF_UBRUNMODE(String param);

	public String getF_UBCHARGECODE();

	public void setF_UBCHARGECODE(String param);

	public String getF_UBCRNARRATIVE();

	public void setF_UBCRNARRATIVE(String param);

	public String getF_UBHOLIDAYPROCESSTYPE();

	public void setF_UBHOLIDAYPROCESSTYPE(String param);

	public String getF_UBBUSINESSPROCESSSTATUS();

	public void setF_UBBUSINESSPROCESSSTATUS(String param);

	public String getF_BENINSTNAME();

	public void setF_BENINSTNAME(String param);

	public String getF_BENINSTCOUNTRY();

	public void setF_BENINSTCOUNTRY(String param);

	public Integer getF_UBALLOWEDNONPAYMENTS();

	public void setF_UBALLOWEDNONPAYMENTS(Integer param);

	public String getF_BENINSTCITY();

	public void setF_BENINSTCITY(String param);

	public String getF_UBPROCESSMODE();

	public void setF_UBPROCESSMODE(String param);

	public Integer getF_UBSOGROUP();

	public void setF_UBSOGROUP(Integer param);

	public String getF_UBISARCHIVE();

	public void setF_UBISARCHIVE(String param);

	public BigDecimal getF_UBSURPLUSTHRESHOLDAMT();

	public void setF_UBSURPLUSTHRESHOLDAMT(BigDecimal param);

	public String getF_CNT();

	public void setF_CNT(String param);

	public Timestamp getF_UBNEXTPROCESSINGDTTM();

	public void setF_UBNEXTPROCESSINGDTTM(Timestamp param);

	public String getF_UBBENEFICIARYCOUNTRY();

	public void setF_UBBENEFICIARYCOUNTRY(String param);

	public String getF_BENEFCUSTIDENTIFIERTYPE();

	public void setF_BENEFCUSTIDENTIFIERTYPE(String param);

	public String getF_UBISDELETE();

	public void setF_UBISDELETE(String param);

	public String getF_UBACCOUNTTYPE();

	public void setF_UBACCOUNTTYPE(String param);

}