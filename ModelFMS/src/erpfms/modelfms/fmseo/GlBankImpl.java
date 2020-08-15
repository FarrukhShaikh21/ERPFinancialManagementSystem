package erpfms.modelfms.fmseo;

import erpadm.modeladm.admeo.SmCountryImpl;

import erpglobals.modelglobals.ERPEntityImpl;

import erpglobals.modelglobals.ERPGlobalPLSQLClass;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Aug 14 19:25:33 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GlBankImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        BankId,
        BankShortCode,
        BankShortName,
        BankName,
        OpeningDate,
        ChartOfAccountId,
        BaseCountryId,
        NtnNo,
        Email,
        Website,
        ComplaintEmail,
        RegistrationNo,
        GlobalCompanyId,
        CompanyId,
        IsActive,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        txtBaseCountryName,
        txtCOADescription,
        GlBankBranch,
        SmCountry,
        GlChartOfAccounts;
        private static AttributesEnum[] vals = null;
        private static final int firstIndex = 0;

        public int index() {
            return AttributesEnum.firstIndex() + ordinal();
        }

        public static final int firstIndex() {
            return firstIndex;
        }

        public static int count() {
            return AttributesEnum.firstIndex() + AttributesEnum.staticValues().length;
        }

        public static final AttributesEnum[] staticValues() {
            if (vals == null) {
                vals = AttributesEnum.values();
            }
            return vals;
        }
    }


    public static final int BANKID = AttributesEnum.BankId.index();
    public static final int BANKSHORTCODE = AttributesEnum.BankShortCode.index();
    public static final int BANKSHORTNAME = AttributesEnum.BankShortName.index();
    public static final int BANKNAME = AttributesEnum.BankName.index();
    public static final int OPENINGDATE = AttributesEnum.OpeningDate.index();
    public static final int CHARTOFACCOUNTID = AttributesEnum.ChartOfAccountId.index();
    public static final int BASECOUNTRYID = AttributesEnum.BaseCountryId.index();
    public static final int NTNNO = AttributesEnum.NtnNo.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int WEBSITE = AttributesEnum.Website.index();
    public static final int COMPLAINTEMAIL = AttributesEnum.ComplaintEmail.index();
    public static final int REGISTRATIONNO = AttributesEnum.RegistrationNo.index();
    public static final int GLOBALCOMPANYID = AttributesEnum.GlobalCompanyId.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int TXTBASECOUNTRYNAME = AttributesEnum.txtBaseCountryName.index();
    public static final int TXTCOADESCRIPTION = AttributesEnum.txtCOADescription.index();
    public static final int GLBANKBRANCH = AttributesEnum.GlBankBranch.index();
    public static final int SMCOUNTRY = AttributesEnum.SmCountry.index();
    public static final int GLCHARTOFACCOUNTS = AttributesEnum.GlChartOfAccounts.index();

    /**
     * This is the default constructor (do not remove).
     */
    public GlBankImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpfms.modelfms.fmseo.GlBank");
    }


    /**
     * Gets the attribute value for BankId, using the alias name BankId.
     * @return the value of BankId
     */
    public Integer getBankId() {
        return (Integer) getAttributeInternal(BANKID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BankId.
     * @param value value to set the BankId
     */
    public void setBankId(Integer value) {
        setAttributeInternal(BANKID, value);
    }

    /**
     * Gets the attribute value for BankShortCode, using the alias name BankShortCode.
     * @return the value of BankShortCode
     */
    public Integer getBankShortCode() {
        return (Integer) getAttributeInternal(BANKSHORTCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BankShortCode.
     * @param value value to set the BankShortCode
     */
    public void setBankShortCode(Integer value) {
        setAttributeInternal(BANKSHORTCODE, value);
    }

    /**
     * Gets the attribute value for BankShortName, using the alias name BankShortName.
     * @return the value of BankShortName
     */
    public String getBankShortName() {
        return (String) getAttributeInternal(BANKSHORTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for BankShortName.
     * @param value value to set the BankShortName
     */
    public void setBankShortName(String value) {
        setAttributeInternal(BANKSHORTNAME, value);
    }

    /**
     * Gets the attribute value for BankName, using the alias name BankName.
     * @return the value of BankName
     */
    public String getBankName() {
        return (String) getAttributeInternal(BANKNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for BankName.
     * @param value value to set the BankName
     */
    public void setBankName(String value) {
        setAttributeInternal(BANKNAME, value);
    }

    /**
     * Gets the attribute value for OpeningDate, using the alias name OpeningDate.
     * @return the value of OpeningDate
     */
    public Timestamp getOpeningDate() {
        return (Timestamp) getAttributeInternal(OPENINGDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for OpeningDate.
     * @param value value to set the OpeningDate
     */
    public void setOpeningDate(Timestamp value) {
        setAttributeInternal(OPENINGDATE, value);
    }

    /**
     * Gets the attribute value for ChartOfAccountId, using the alias name ChartOfAccountId.
     * @return the value of ChartOfAccountId
     */
    public Long getChartOfAccountId() {
        return (Long) getAttributeInternal(CHARTOFACCOUNTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChartOfAccountId.
     * @param value value to set the ChartOfAccountId
     */
    public void setChartOfAccountId(Long value) {
        setAttributeInternal(CHARTOFACCOUNTID, value);
    }

    /**
     * Gets the attribute value for BaseCountryId, using the alias name BaseCountryId.
     * @return the value of BaseCountryId
     */
    public Integer getBaseCountryId() {
        return (Integer) getAttributeInternal(BASECOUNTRYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BaseCountryId.
     * @param value value to set the BaseCountryId
     */
    public void setBaseCountryId(Integer value) {
        setAttributeInternal(BASECOUNTRYID, value);
    }

    /**
     * Gets the attribute value for NtnNo, using the alias name NtnNo.
     * @return the value of NtnNo
     */
    public String getNtnNo() {
        return (String) getAttributeInternal(NTNNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for NtnNo.
     * @param value value to set the NtnNo
     */
    public void setNtnNo(String value) {
        setAttributeInternal(NTNNO, value);
    }

    /**
     * Gets the attribute value for Email, using the alias name Email.
     * @return the value of Email
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for Email.
     * @param value value to set the Email
     */
    public void setEmail(String value) {
        setAttributeInternal(EMAIL, value);
    }

    /**
     * Gets the attribute value for Website, using the alias name Website.
     * @return the value of Website
     */
    public String getWebsite() {
        return (String) getAttributeInternal(WEBSITE);
    }

    /**
     * Sets <code>value</code> as the attribute value for Website.
     * @param value value to set the Website
     */
    public void setWebsite(String value) {
        setAttributeInternal(WEBSITE, value);
    }

    /**
     * Gets the attribute value for ComplaintEmail, using the alias name ComplaintEmail.
     * @return the value of ComplaintEmail
     */
    public String getComplaintEmail() {
        return (String) getAttributeInternal(COMPLAINTEMAIL);
    }

    /**
     * Sets <code>value</code> as the attribute value for ComplaintEmail.
     * @param value value to set the ComplaintEmail
     */
    public void setComplaintEmail(String value) {
        setAttributeInternal(COMPLAINTEMAIL, value);
    }

    /**
     * Gets the attribute value for RegistrationNo, using the alias name RegistrationNo.
     * @return the value of RegistrationNo
     */
    public String getRegistrationNo() {
        return (String) getAttributeInternal(REGISTRATIONNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for RegistrationNo.
     * @param value value to set the RegistrationNo
     */
    public void setRegistrationNo(String value) {
        setAttributeInternal(REGISTRATIONNO, value);
    }

    /**
     * Gets the attribute value for GlobalCompanyId, using the alias name GlobalCompanyId.
     * @return the value of GlobalCompanyId
     */
    public Integer getGlobalCompanyId() {
        return (Integer) getAttributeInternal(GLOBALCOMPANYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for GlobalCompanyId.
     * @param value value to set the GlobalCompanyId
     */
    public void setGlobalCompanyId(Integer value) {
        setAttributeInternal(GLOBALCOMPANYID, value);
    }

    /**
     * Gets the attribute value for CompanyId, using the alias name CompanyId.
     * @return the value of CompanyId
     */
    public Integer getCompanyId() {
        return (Integer) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CompanyId.
     * @param value value to set the CompanyId
     */
    public void setCompanyId(Integer value) {
        setAttributeInternal(COMPANYID, value);
    }

    /**
     * Gets the attribute value for IsActive, using the alias name IsActive.
     * @return the value of IsActive
     */
    public String getIsActive() {
        return (String) getAttributeInternal(ISACTIVE);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsActive.
     * @param value value to set the IsActive
     */
    public void setIsActive(String value) {
        setAttributeInternal(ISACTIVE, value);
    }

    /**
     * Gets the attribute value for CreatedBy, using the alias name CreatedBy.
     * @return the value of CreatedBy
     */
    public Integer getCreatedBy() {
        return (Integer) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedBy.
     * @param value value to set the CreatedBy
     */
    public void setCreatedBy(Integer value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CreatedDate, using the alias name CreatedDate.
     * @return the value of CreatedDate
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for CreatedDate.
     * @param value value to set the CreatedDate
     */
    public void setCreatedDate(Timestamp value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for LastUpdatedBy, using the alias name LastUpdatedBy.
     * @return the value of LastUpdatedBy
     */
    public Integer getLastUpdatedBy() {
        return (Integer) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedBy.
     * @param value value to set the LastUpdatedBy
     */
    public void setLastUpdatedBy(Integer value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LastUpdatedDate, using the alias name LastUpdatedDate.
     * @return the value of LastUpdatedDate
     */
    public Timestamp getLastUpdatedDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdatedDate.
     * @param value value to set the LastUpdatedDate
     */
    public void setLastUpdatedDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for txtBaseCountryName, using the alias name txtBaseCountryName.
     * @return the value of txtBaseCountryName
     */
    public String gettxtBaseCountryName() {
        return (String) getAttributeInternal(TXTBASECOUNTRYNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtBaseCountryName.
     * @param value value to set the txtBaseCountryName
     */
    public void settxtBaseCountryName(String value) {
        setAttributeInternal(TXTBASECOUNTRYNAME, value);
    }

    /**
     * Gets the attribute value for txtCOADescription, using the alias name txtCOADescription.
     * @return the value of txtCOADescription
     */
    public String gettxtCOADescription() {
        return (String) getAttributeInternal(TXTCOADESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtCOADescription.
     * @param value value to set the txtCOADescription
     */
    public void settxtCOADescription(String value) {
        setAttributeInternal(TXTCOADESCRIPTION, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getGlBankBranch() {
        return (RowIterator) getAttributeInternal(GLBANKBRANCH);
    }

    /**
     * @return the associated entity erpadm.modeladm.admeo.SmCountryImpl.
     */
    public SmCountryImpl getSmCountry() {
        return (SmCountryImpl) getAttributeInternal(SMCOUNTRY);
    }

    /**
     * Sets <code>value</code> as the associated entity erpadm.modeladm.admeo.SmCountryImpl.
     */
    public void setSmCountry(SmCountryImpl value) {
        setAttributeInternal(SMCOUNTRY, value);
    }


    /**
     * @return the associated entity GlChartOfAccountsImpl.
     */
    public GlChartOfAccountsImpl getGlChartOfAccounts() {
        return (GlChartOfAccountsImpl) getAttributeInternal(GLCHARTOFACCOUNTS);
    }

    /**
     * Sets <code>value</code> as the associated entity GlChartOfAccountsImpl.
     */
    public void setGlChartOfAccounts(GlChartOfAccountsImpl value) {
        setAttributeInternal(GLCHARTOFACCOUNTS, value);
    }


    /**
     * @param bankId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer bankId) {
        return new Key(new Object[] { bankId });
    }

    /**
     * Add locking logic here.
     */
    public void lock() {
        super.lock();
    }

    /**
     * Custom DML update/insert/delete logic here.
     * @param operation the operation type
     * @param e the transaction event
     */
    protected void doDML(int operation, TransactionEvent e) {

        if (operation == DML_INSERT) {
            String result =
                ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "BANK_ID",
                                                              this.getEntityDef().getSource(), null, null);

            populateAttributeAsChanged(BANKID, Integer.parseInt(result));
            result =
                ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "BANK_SHORT_CODE",
                                                              this.getEntityDef().getSource(), "COMPANY_ID",
                                                              getCompanyId().toString());
            populateAttributeAsChanged(BANKSHORTCODE, Integer.parseInt(result));

        }
        super.doDML(operation, e);
    }
}

