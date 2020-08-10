package erpfms.modelfms.fmseo;

import erpglobals.modelglobals.ERPEntityImpl;
import erpglobals.modelglobals.ERPGlobalPLSQLClass;

import java.sql.Timestamp;

import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon Jul 13 18:41:14 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GlProjectsImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ProjectSno,
        ProjectName,
        StartDate,
        EndDate,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdateDate,
        CompanyId,
        GlobalCompanyId,
        ProjectCode,
        ProjectShortName,
        IsActive,
        GlVoucherHeader,
        GlVoucherLines;
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


    public static final int PROJECTSNO = AttributesEnum.ProjectSno.index();
    public static final int PROJECTNAME = AttributesEnum.ProjectName.index();
    public static final int STARTDATE = AttributesEnum.StartDate.index();
    public static final int ENDDATE = AttributesEnum.EndDate.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDATE = AttributesEnum.LastUpdateDate.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int GLOBALCOMPANYID = AttributesEnum.GlobalCompanyId.index();
    public static final int PROJECTCODE = AttributesEnum.ProjectCode.index();
    public static final int PROJECTSHORTNAME = AttributesEnum.ProjectShortName.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int GLVOUCHERHEADER = AttributesEnum.GlVoucherHeader.index();
    public static final int GLVOUCHERLINES = AttributesEnum.GlVoucherLines.index();

    /**
     * This is the default constructor (do not remove).
     */
    public GlProjectsImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpfms.modelfms.fmseo.GlProjects");
    }


    /**
     * Gets the attribute value for ProjectSno, using the alias name ProjectSno.
     * @return the value of ProjectSno
     */
    public Integer getProjectSno() {
        return (Integer) getAttributeInternal(PROJECTSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectSno.
     * @param value value to set the ProjectSno
     */
    public void setProjectSno(Integer value) {
        setAttributeInternal(PROJECTSNO, value);
    }

    /**
     * Gets the attribute value for ProjectName, using the alias name ProjectName.
     * @return the value of ProjectName
     */
    public String getProjectName() {
        return (String) getAttributeInternal(PROJECTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectName.
     * @param value value to set the ProjectName
     */
    public void setProjectName(String value) {
        setAttributeInternal(PROJECTNAME, value);
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
     * Gets the attribute value for LastUpdateDate, using the alias name LastUpdateDate.
     * @return the value of LastUpdateDate
     */
    public Timestamp getLastUpdateDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for LastUpdateDate.
     * @param value value to set the LastUpdateDate
     */
    public void setLastUpdateDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDATE, value);
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
     * Gets the attribute value for ProjectCode, using the alias name ProjectCode.
     * @return the value of ProjectCode
     */
    public Integer getProjectCode() {
        return (Integer) getAttributeInternal(PROJECTCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectCode.
     * @param value value to set the ProjectCode
     */
    public void setProjectCode(Integer value) {
        setAttributeInternal(PROJECTCODE, value);
    }

    /**
     * Gets the attribute value for ProjectShortName, using the alias name ProjectShortName.
     * @return the value of ProjectShortName
     */
    public String getProjectShortName() {
        return (String) getAttributeInternal(PROJECTSHORTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for ProjectShortName.
     * @param value value to set the ProjectShortName
     */
    public void setProjectShortName(String value) {
        setAttributeInternal(PROJECTSHORTNAME, value);
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
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getGlVoucherHeader() {
        return (RowIterator) getAttributeInternal(GLVOUCHERHEADER);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getGlVoucherLines() {
        return (RowIterator) getAttributeInternal(GLVOUCHERLINES);
    }


    /**
     * @param projectSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer projectSno) {
        return new Key(new Object[] { projectSno });
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
           String result = ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "PROJECT_SNO",this.getEntityDef().getSource(), null, null);
           populateAttributeAsChanged(PROJECTSNO,  Integer.parseInt(result));
           result = ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "PROJECT_CODE",this.getEntityDef().getSource(), "COMPANY_ID", getCompanyId().toString());
           populateAttributeAsChanged(PROJECTCODE,  Integer.parseInt(result));

        }
        super.doDML(operation, e);
    }
}

