package erpfms.modelfms.fmseo;

import erpadm.modeladm.admeo.SmCityImpl;
import erpadm.modeladm.admeo.SmCountryImpl;

import erpglobals.modelglobals.ERPEntityImpl;
import erpglobals.modelglobals.ERPGlobalPLSQLClass;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.RowSet;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Sat Aug 15 12:15:59 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GlBankBranchImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        BankId,
        BankBranchId,
        BranchShortName,
        BranchName,
        BranchDate,
        ChartOfAccountId,
        CountryId,
        CityId,
        MobileNo,
        PhoneNo,
        FaxNo,
        ContactPerson,
        IsActive,
        IsHeadOffice,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        txtCOAName,
        txtCountryName,
        txtCityName,
        GlBank,
        GlChartOfAccounts,
        SmCountry,
        SmCity,
        AccGlBankBranchSEQ;
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
    public static final int BANKBRANCHID = AttributesEnum.BankBranchId.index();
    public static final int BRANCHSHORTNAME = AttributesEnum.BranchShortName.index();
    public static final int BRANCHNAME = AttributesEnum.BranchName.index();
    public static final int BRANCHDATE = AttributesEnum.BranchDate.index();
    public static final int CHARTOFACCOUNTID = AttributesEnum.ChartOfAccountId.index();
    public static final int COUNTRYID = AttributesEnum.CountryId.index();
    public static final int CITYID = AttributesEnum.CityId.index();
    public static final int MOBILENO = AttributesEnum.MobileNo.index();
    public static final int PHONENO = AttributesEnum.PhoneNo.index();
    public static final int FAXNO = AttributesEnum.FaxNo.index();
    public static final int CONTACTPERSON = AttributesEnum.ContactPerson.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int ISHEADOFFICE = AttributesEnum.IsHeadOffice.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int TXTCOANAME = AttributesEnum.txtCOAName.index();
    public static final int TXTCOUNTRYNAME = AttributesEnum.txtCountryName.index();
    public static final int TXTCITYNAME = AttributesEnum.txtCityName.index();
    public static final int GLBANK = AttributesEnum.GlBank.index();
    public static final int GLCHARTOFACCOUNTS = AttributesEnum.GlChartOfAccounts.index();
    public static final int SMCOUNTRY = AttributesEnum.SmCountry.index();
    public static final int SMCITY = AttributesEnum.SmCity.index();
    public static final int ACCGLBANKBRANCHSEQ = AttributesEnum.AccGlBankBranchSEQ.index();

    /**
     * This is the default constructor (do not remove).
     */
    public GlBankBranchImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpfms.modelfms.fmseo.GlBankBranch");
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
     * Gets the attribute value for BankBranchId, using the alias name BankBranchId.
     * @return the value of BankBranchId
     */
    public Integer getBankBranchId() {
        return (Integer) getAttributeInternal(BANKBRANCHID);
    }

    /**
     * Sets <code>value</code> as the attribute value for BankBranchId.
     * @param value value to set the BankBranchId
     */
    public void setBankBranchId(Integer value) {
        setAttributeInternal(BANKBRANCHID, value);
    }


    /**
     * Gets the attribute value for BranchShortName, using the alias name BranchShortName.
     * @return the value of BranchShortName
     */
    public String getBranchShortName() {
        return (String) getAttributeInternal(BRANCHSHORTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchShortName.
     * @param value value to set the BranchShortName
     */
    public void setBranchShortName(String value) {
        setAttributeInternal(BRANCHSHORTNAME, value);
    }

    /**
     * Gets the attribute value for BranchName, using the alias name BranchName.
     * @return the value of BranchName
     */
    public String getBranchName() {
        return (String) getAttributeInternal(BRANCHNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchName.
     * @param value value to set the BranchName
     */
    public void setBranchName(String value) {
        setAttributeInternal(BRANCHNAME, value);
    }

    /**
     * Gets the attribute value for BranchDate, using the alias name BranchDate.
     * @return the value of BranchDate
     */
    public Timestamp getBranchDate() {
        return (Timestamp) getAttributeInternal(BRANCHDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for BranchDate.
     * @param value value to set the BranchDate
     */
    public void setBranchDate(Timestamp value) {
        setAttributeInternal(BRANCHDATE, value);
    }

    /**
     * Gets the attribute value for ChartOfAccountId, using the alias name ChartOfAccountId.
     * @return the value of ChartOfAccountId
     */
    public Integer getChartOfAccountId() {
        return (Integer) getAttributeInternal(CHARTOFACCOUNTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChartOfAccountId.
     * @param value value to set the ChartOfAccountId
     */
    public void setChartOfAccountId(Integer value) {
        setAttributeInternal(CHARTOFACCOUNTID, value);
    }

    /**
     * Gets the attribute value for CountryId, using the alias name CountryId.
     * @return the value of CountryId
     */
    public Integer getCountryId() {
        return (Integer) getAttributeInternal(COUNTRYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CountryId.
     * @param value value to set the CountryId
     */
    public void setCountryId(Integer value) {
        setAttributeInternal(COUNTRYID, value);
    }

    /**
     * Gets the attribute value for CityId, using the alias name CityId.
     * @return the value of CityId
     */
    public Integer getCityId() {
        return (Integer) getAttributeInternal(CITYID);
    }

    /**
     * Sets <code>value</code> as the attribute value for CityId.
     * @param value value to set the CityId
     */
    public void setCityId(Integer value) {
        setAttributeInternal(CITYID, value);
    }

    /**
     * Gets the attribute value for MobileNo, using the alias name MobileNo.
     * @return the value of MobileNo
     */
    public String getMobileNo() {
        return (String) getAttributeInternal(MOBILENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for MobileNo.
     * @param value value to set the MobileNo
     */
    public void setMobileNo(String value) {
        setAttributeInternal(MOBILENO, value);
    }

    /**
     * Gets the attribute value for PhoneNo, using the alias name PhoneNo.
     * @return the value of PhoneNo
     */
    public String getPhoneNo() {
        return (String) getAttributeInternal(PHONENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for PhoneNo.
     * @param value value to set the PhoneNo
     */
    public void setPhoneNo(String value) {
        setAttributeInternal(PHONENO, value);
    }

    /**
     * Gets the attribute value for FaxNo, using the alias name FaxNo.
     * @return the value of FaxNo
     */
    public String getFaxNo() {
        return (String) getAttributeInternal(FAXNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for FaxNo.
     * @param value value to set the FaxNo
     */
    public void setFaxNo(String value) {
        setAttributeInternal(FAXNO, value);
    }

    /**
     * Gets the attribute value for ContactPerson, using the alias name ContactPerson.
     * @return the value of ContactPerson
     */
    public String getContactPerson() {
        return (String) getAttributeInternal(CONTACTPERSON);
    }

    /**
     * Sets <code>value</code> as the attribute value for ContactPerson.
     * @param value value to set the ContactPerson
     */
    public void setContactPerson(String value) {
        setAttributeInternal(CONTACTPERSON, value);
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
     * Gets the attribute value for IsHeadOffice, using the alias name IsHeadOffice.
     * @return the value of IsHeadOffice
     */
    public String getIsHeadOffice() {
        return (String) getAttributeInternal(ISHEADOFFICE);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsHeadOffice.
     * @param value value to set the IsHeadOffice
     */
    public void setIsHeadOffice(String value) {
        setAttributeInternal(ISHEADOFFICE, value);
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
     * Gets the attribute value for txtCOAName, using the alias name txtCOAName.
     * @return the value of txtCOAName
     */
    public String gettxtCOAName() {
        return (String) getAttributeInternal(TXTCOANAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtCOAName.
     * @param value value to set the txtCOAName
     */
    public void settxtCOAName(String value) {
        setAttributeInternal(TXTCOANAME, value);
    }

    /**
     * Gets the attribute value for txtCountryName, using the alias name txtCountryName.
     * @return the value of txtCountryName
     */
    public String gettxtCountryName() {
        return (String) getAttributeInternal(TXTCOUNTRYNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtCountryName.
     * @param value value to set the txtCountryName
     */
    public void settxtCountryName(String value) {
        setAttributeInternal(TXTCOUNTRYNAME, value);
    }

    /**
     * Gets the attribute value for txtCityName, using the alias name txtCityName.
     * @return the value of txtCityName
     */
    public String gettxtCityName() {
        return (String) getAttributeInternal(TXTCITYNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtCityName.
     * @param value value to set the txtCityName
     */
    public void settxtCityName(String value) {
        setAttributeInternal(TXTCITYNAME, value);
    }

    /**
     * @return the associated entity GlBankImpl.
     */
    public GlBankImpl getGlBank() {
        return (GlBankImpl) getAttributeInternal(GLBANK);
    }

    /**
     * Sets <code>value</code> as the associated entity GlBankImpl.
     */
    public void setGlBank(GlBankImpl value) {
        setAttributeInternal(GLBANK, value);
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
     * @return the associated entity erpadm.modeladm.admeo.SmCityImpl.
     */
    public SmCityImpl getSmCity() {
        return (SmCityImpl) getAttributeInternal(SMCITY);
    }

    /**
     * Sets <code>value</code> as the associated entity erpadm.modeladm.admeo.SmCityImpl.
     */
    public void setSmCity(SmCityImpl value) {
        setAttributeInternal(SMCITY, value);
    }


    /**
     * Gets the view accessor <code>RowSet</code> AccGlBankBranchSEQ.
     */
    public RowSet getAccGlBankBranchSEQ() {
        return (RowSet) getAttributeInternal(ACCGLBANKBRANCHSEQ);
    }


    /**
     * @param bankBranchId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer bankBranchId) {
        return new Key(new Object[] { bankBranchId });
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
                ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "BANK_BRANCH_ID",
                                                              this.getEntityDef().getSource(), null, null);

                populateAttributeAsChanged(BANKBRANCHID, Integer.parseInt(result));

        }
        super.doDML(operation, e);
    }

}

