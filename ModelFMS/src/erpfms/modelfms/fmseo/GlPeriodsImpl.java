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
// ---    Thu Apr 30 01:09:51 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GlPeriodsImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        PeriodSno,
        PeriodName,
        FiscalYearSno,
        StartDate,
        EndDate,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        IsClosed,
        IsAdjustment,
        QuarterNo,
        PeriodNo,
        LastUpdatedDate,
        IsOpen,
        GlFiscalYear,
        GlVoucherHeader,
        GlUserClosedPeriodRight,
        GlBudget,
        GlBudget1;
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


    public static final int PERIODSNO = AttributesEnum.PeriodSno.index();
    public static final int PERIODNAME = AttributesEnum.PeriodName.index();
    public static final int FISCALYEARSNO = AttributesEnum.FiscalYearSno.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int ISCLOSED = AttributesEnum.IsClosed.index();
    public static final int ISADJUSTMENT = AttributesEnum.IsAdjustment.index();
    public static final int QUARTERNO = AttributesEnum.QuarterNo.index();
    public static final int PERIODNO = AttributesEnum.PeriodNo.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int ISOPEN = AttributesEnum.IsOpen.index();
    public static final int GLFISCALYEAR = AttributesEnum.GlFiscalYear.index();
    public static final int GLVOUCHERHEADER = AttributesEnum.GlVoucherHeader.index();
    public static final int GLUSERCLOSEDPERIODRIGHT = AttributesEnum.GlUserClosedPeriodRight.index();
    public static final int GLBUDGET = AttributesEnum.GlBudget.index();
    public static final int GLBUDGET1 = AttributesEnum.GlBudget1.index();

    /**
     * This is the default constructor (do not remove).
     */
    public GlPeriodsImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpfms.modelfms.fmseo.GlPeriods");
    }


    /**
     * Gets the attribute value for PeriodSno, using the alias name PeriodSno.
     * @return the value of PeriodSno
     */
    public Integer getPeriodSno() {
        return (Integer) getAttributeInternal(PERIODSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for PeriodSno.
     * @param value value to set the PeriodSno
     */
    public void setPeriodSno(Integer value) {
        setAttributeInternal(PERIODSNO, value);
    }

    /**
     * Gets the attribute value for PeriodName, using the alias name PeriodName.
     * @return the value of PeriodName
     */
    public String getPeriodName() {
        return (String) getAttributeInternal(PERIODNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for PeriodName.
     * @param value value to set the PeriodName
     */
    public void setPeriodName(String value) {
        setAttributeInternal(PERIODNAME, value);
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
     * Gets the attribute value for IsClosed, using the alias name IsClosed.
     * @return the value of IsClosed
     */
    public String getIsClosed() {
        return (String) getAttributeInternal(ISCLOSED);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsClosed.
     * @param value value to set the IsClosed
     */
    public void setIsClosed(String value) {
        setAttributeInternal(ISCLOSED, value);
    }

    /**
     * Gets the attribute value for IsAdjustment, using the alias name IsAdjustment.
     * @return the value of IsAdjustment
     */
    public String getIsAdjustment() {
        return (String) getAttributeInternal(ISADJUSTMENT);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsAdjustment.
     * @param value value to set the IsAdjustment
     */
    public void setIsAdjustment(String value) {
        setAttributeInternal(ISADJUSTMENT, value);
    }

    /**
     * Gets the attribute value for QuarterNo, using the alias name QuarterNo.
     * @return the value of QuarterNo
     */
    public Integer getQuarterNo() {
        return (Integer) getAttributeInternal(QUARTERNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for QuarterNo.
     * @param value value to set the QuarterNo
     */
    public void setQuarterNo(Integer value) {
        setAttributeInternal(QUARTERNO, value);
    }

    /**
     * Gets the attribute value for PeriodNo, using the alias name PeriodNo.
     * @return the value of PeriodNo
     */
    public Integer getPeriodNo() {
        return (Integer) getAttributeInternal(PERIODNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for PeriodNo.
     * @param value value to set the PeriodNo
     */
    public void setPeriodNo(Integer value) {
        setAttributeInternal(PERIODNO, value);
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
     * Gets the attribute value for IsOpen, using the alias name IsOpen.
     * @return the value of IsOpen
     */
    public String getIsOpen() {
        return (String) getAttributeInternal(ISOPEN);
    }

    /**
     * Sets <code>value</code> as the attribute value for IsOpen.
     * @param value value to set the IsOpen
     */
    public void setIsOpen(String value) {
        System.out.println("value is open"+ value);
        if (value.equals("N")) {
            setIsClosed("N");
        }
        setAttributeInternal(ISOPEN, value);
       
    }

    /**
     * @return the associated entity GlFiscalYearImpl.
     */
    public GlFiscalYearImpl getGlFiscalYear() {
        return (GlFiscalYearImpl) getAttributeInternal(GLFISCALYEAR);
    }

    /**
     * Sets <code>value</code> as the associated entity GlFiscalYearImpl.
     */
    public void setGlFiscalYear(GlFiscalYearImpl value) {
        setAttributeInternal(GLFISCALYEAR, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getGlVoucherHeader() {
        return (RowIterator) getAttributeInternal(GLVOUCHERHEADER);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getGlUserClosedPeriodRight() {
        return (RowIterator) getAttributeInternal(GLUSERCLOSEDPERIODRIGHT);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getGlBudget() {
        return (RowIterator) getAttributeInternal(GLBUDGET);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getGlBudget1() {
        return (RowIterator) getAttributeInternal(GLBUDGET1);
    }


    /**
     * @param periodSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer periodSno) {
        return new Key(new Object[] { periodSno });
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
            String result =ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "PERIOD_SNO",this.getEntityDef().getSource(), null, null);
            populateAttributeAsChanged(PERIODSNO, Integer.parseInt(result));
        }
        super.doDML(operation, e);
    }
    
}

