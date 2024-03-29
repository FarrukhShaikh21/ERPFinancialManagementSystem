package erpfms.modelfms.fmseo;

import erpglobals.modelglobals.ERPEntityImpl;

import erpglobals.modelglobals.ERPGlobalPLSQLClass;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Apr 27 23:44:48 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GlFiscalYearImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        FiscalYearSno,
        YearDescription,
        IsActive,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        StartDate,
        EndDate,
        CompanyId,
        GlobalCompanyId,
        IsSupervised,
        SupervisedDate,
        IsUnsupervised,
        UnSupervisedDate,
        FiscalYearr,
        FiscalYearCode,
        SupervisedBy,
        UnSupervisedBy,
        GlPeriods,
        GlBudget;
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


    public static final int FISCALYEARSNO = AttributesEnum.FiscalYearSno.index();
    public static final int YEARDESCRIPTION = AttributesEnum.YearDescription.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int GLOBALCOMPANYID = AttributesEnum.GlobalCompanyId.index();
    public static final int ISSUPERVISED = AttributesEnum.IsSupervised.index();
    public static final int SUPERVISEDDATE = AttributesEnum.SupervisedDate.index();
    public static final int ISUNSUPERVISED = AttributesEnum.IsUnsupervised.index();
    public static final int UNSUPERVISEDDATE = AttributesEnum.UnSupervisedDate.index();
    public static final int FISCALYEARR = AttributesEnum.FiscalYearr.index();
    public static final int FISCALYEARCODE = AttributesEnum.FiscalYearCode.index();
    public static final int SUPERVISEDBY = AttributesEnum.SupervisedBy.index();
    public static final int UNSUPERVISEDBY = AttributesEnum.UnSupervisedBy.index();
    public static final int GLPERIODS = AttributesEnum.GlPeriods.index();
    public static final int GLBUDGET = AttributesEnum.GlBudget.index();

    /**
     * This is the default constructor (do not remove).
     */
    public GlFiscalYearImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpfms.modelfms.fmseo.GlFiscalYear");
    }


    /**
     * Gets the attribute value for FiscalYearSno, using the alias name FiscalYearSno.
     * @return the value of FiscalYearSno
     */
    public Integer getFiscalYearSno() {
        return (Integer) getAttributeInternal(FISCALYEARSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for FiscalYearSno.
     * @param value value to set the FiscalYearSno
     */
    public void setFiscalYearSno(Integer value) {
        setAttributeInternal(FISCALYEARSNO, value);
    }

    /**
     * Gets the attribute value for YearDescription, using the alias name YearDescription.
     * @return the value of YearDescription
     */
    public String getYearDescription() {
        return (String) getAttributeInternal(YEARDESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for YearDescription.
     * @param value value to set the YearDescription
     */
    public void setYearDescription(String value) {
        setAttributeInternal(YEARDESCRIPTION, value);
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
     * Gets the attribute value for StartDate, using the alias name StartDate.
     * @return the value of StartDate
     */
    public Timestamp getStartDate() {
        return (Timestamp) getAttributeInternal(STARTDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for StartDate.
     * @param value value to set the StartDate
     */
    public void setStartDate(Timestamp value) {
        setAttributeInternal(STARTDATE, value);
    }

    /**
     * Gets the attribute value for EndDate, using the alias name EndDate.
     * @return the value of EndDate
     */
    public Timestamp getEndDate() {
        return (Timestamp) getAttributeInternal(ENDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for EndDate.
     * @param value value to set the EndDate
     */
    public void setEndDate(Timestamp value) {
        setAttributeInternal(ENDDATE, value);
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
     * Gets the attribute value for IsSupervised, using the alias name IsSupervised.
     * @return the value of IsSupervised
     */
    public String getIsSupervised() {
        return (String) getAttributeInternal(ISSUPERVISED);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsSupervised.
     * @param value value to set the IsSupervised
     */
    public void setIsSupervised(String value) {
        setAttributeInternal(ISSUPERVISED, value);
    }

    /**
     * Gets the attribute value for SupervisedDate, using the alias name SupervisedDate.
     * @return the value of SupervisedDate
     */
    public Timestamp getSupervisedDate() {
        return (Timestamp) getAttributeInternal(SUPERVISEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupervisedDate.
     * @param value value to set the SupervisedDate
     */
    public void setSupervisedDate(Timestamp value) {
        setAttributeInternal(SUPERVISEDDATE, value);
    }

    /**
     * Gets the attribute value for IsUnsupervised, using the alias name IsUnsupervised.
     * @return the value of IsUnsupervised
     */
    public String getIsUnsupervised() {
        return (String) getAttributeInternal(ISUNSUPERVISED);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsUnsupervised.
     * @param value value to set the IsUnsupervised
     */
    public void setIsUnsupervised(String value) {
        setAttributeInternal(ISUNSUPERVISED, value);
    }

    /**
     * Gets the attribute value for UnSupervisedDate, using the alias name UnSupervisedDate.
     * @return the value of UnSupervisedDate
     */
    public Timestamp getUnSupervisedDate() {
        return (Timestamp) getAttributeInternal(UNSUPERVISEDDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for UnSupervisedDate.
     * @param value value to set the UnSupervisedDate
     */
    public void setUnSupervisedDate(Timestamp value) {
        setAttributeInternal(UNSUPERVISEDDATE, value);
    }

    /**
     * Gets the attribute value for FiscalYearr, using the alias name FiscalYearr.
     * @return the value of FiscalYearr
     */
    public Integer getFiscalYearr() {
        return (Integer) getAttributeInternal(FISCALYEARR);
    }

    /**
     * Sets <code>value</code> as the attribute value for FiscalYearr.
     * @param value value to set the FiscalYearr
     */
    public void setFiscalYearr(Integer value) {
        setAttributeInternal(FISCALYEARR, value);
    }

    /**
     * Gets the attribute value for FiscalYearCode, using the alias name FiscalYearCode.
     * @return the value of FiscalYearCode
     */
    public Integer getFiscalYearCode() {
        return (Integer) getAttributeInternal(FISCALYEARCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for FiscalYearCode.
     * @param value value to set the FiscalYearCode
     */
    public void setFiscalYearCode(Integer value) {
        setAttributeInternal(FISCALYEARCODE, value);
    }

    /**
     * Gets the attribute value for SupervisedBy, using the alias name SupervisedBy.
     * @return the value of SupervisedBy
     */
    public Integer getSupervisedBy() {
        return (Integer) getAttributeInternal(SUPERVISEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for SupervisedBy.
     * @param value value to set the SupervisedBy
     */
    public void setSupervisedBy(Integer value) {
        setAttributeInternal(SUPERVISEDBY, value);
    }

    /**
     * Gets the attribute value for UnSupervisedBy, using the alias name UnSupervisedBy.
     * @return the value of UnSupervisedBy
     */
    public Integer getUnSupervisedBy() {
        return (Integer) getAttributeInternal(UNSUPERVISEDBY);
    }

    /**
     * Sets <code>value</code> as the attribute value for UnSupervisedBy.
     * @param value value to set the UnSupervisedBy
     */
    public void setUnSupervisedBy(Integer value) {
        setAttributeInternal(UNSUPERVISEDBY, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getGlPeriods() {
        return (RowIterator) getAttributeInternal(GLPERIODS);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getGlBudget() {
        return (RowIterator) getAttributeInternal(GLBUDGET);
    }


    /**
     * @param fiscalYearSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer fiscalYearSno) {
        return new Key(new Object[] { fiscalYearSno });
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
        if (operation==DML_INSERT ) {
           String result = ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "FISCAL_YEAR_SNO",this.getEntityDef().getSource(), null, null);
           populateAttributeAsChanged(FISCALYEARSNO,  Integer.parseInt(result));
           result = ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "FISCAL_YEAR_CODE",this.getEntityDef().getSource(), "COMPANY_ID", getCompanyId().toString());
           populateAttributeAsChanged(FISCALYEARCODE,  Integer.parseInt(result));

       }
        super.doDML(operation, e);
    }
}

