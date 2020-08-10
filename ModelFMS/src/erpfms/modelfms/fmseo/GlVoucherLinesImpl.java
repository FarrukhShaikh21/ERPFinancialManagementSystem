package erpfms.modelfms.fmseo;

import erpadm.modeladm.admeo.AdminCompanyImpl;

import erpglobals.modelglobals.ERPEntityImpl;
import erpglobals.modelglobals.ERPGlobalPLSQLClass;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.ApplicationModule;
import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.Row;
import oracle.jbo.RowSet;
import oracle.jbo.ViewObject;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.EntityImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri May 15 17:05:47 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GlVoucherLinesImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        VoucherLinesSno,
        VoucherHeaderSno,
        ChartOfAccountId,
        Debit,
        Credit,
        ChequeNo,
        Naration,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        ProjectSno,
        DepartmentId,
        ChequeDate,
        Quantity,
        LastUpdatedDate,
        txtCOADescription,
        txtCOACode,
        txtProjectName,
        txtDepartmentName,
        GlVoucherHeader,
        GlChartOfAccounts,
        GlProjects,
        AdminCompany,
        AccGlVoucherLinesVOSEQ;
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


    public static final int VOUCHERLINESSNO = AttributesEnum.VoucherLinesSno.index();
    public static final int VOUCHERHEADERSNO = AttributesEnum.VoucherHeaderSno.index();
    public static final int CHARTOFACCOUNTID = AttributesEnum.ChartOfAccountId.index();
    public static final int DEBIT = AttributesEnum.Debit.index();
    public static final int CREDIT = AttributesEnum.Credit.index();
    public static final int CHEQUENO = AttributesEnum.ChequeNo.index();
    public static final int NARATION = AttributesEnum.Naration.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int PROJECTSNO = AttributesEnum.ProjectSno.index();
    public static final int DEPARTMENTID = AttributesEnum.DepartmentId.index();
    public static final int CHEQUEDATE = AttributesEnum.ChequeDate.index();
    public static final int QUANTITY = AttributesEnum.Quantity.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int TXTCOADESCRIPTION = AttributesEnum.txtCOADescription.index();
    public static final int TXTCOACODE = AttributesEnum.txtCOACode.index();
    public static final int TXTPROJECTNAME = AttributesEnum.txtProjectName.index();
    public static final int TXTDEPARTMENTNAME = AttributesEnum.txtDepartmentName.index();
    public static final int GLVOUCHERHEADER = AttributesEnum.GlVoucherHeader.index();
    public static final int GLCHARTOFACCOUNTS = AttributesEnum.GlChartOfAccounts.index();
    public static final int GLPROJECTS = AttributesEnum.GlProjects.index();
    public static final int ADMINCOMPANY = AttributesEnum.AdminCompany.index();
    public static final int ACCGLVOUCHERLINESVOSEQ = AttributesEnum.AccGlVoucherLinesVOSEQ.index();

    /**
     * This is the default constructor (do not remove).
     */
    public GlVoucherLinesImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpfms.modelfms.fmseo.GlVoucherLines");
    }


    /**
     * Gets the attribute value for VoucherLinesSno, using the alias name VoucherLinesSno.
     * @return the value of VoucherLinesSno
     */
    public Integer getVoucherLinesSno() {
        return (Integer) getAttributeInternal(VOUCHERLINESSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for VoucherLinesSno.
     * @param value value to set the VoucherLinesSno
     */
    public void setVoucherLinesSno(Integer value) {
        setAttributeInternal(VOUCHERLINESSNO, value);
    }

    /**
     * Gets the attribute value for VoucherHeaderSno, using the alias name VoucherHeaderSno.
     * @return the value of VoucherHeaderSno
     */
    public Integer getVoucherHeaderSno() {
        return (Integer) getAttributeInternal(VOUCHERHEADERSNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for VoucherHeaderSno.
     * @param value value to set the VoucherHeaderSno
     */
    public void setVoucherHeaderSno(Integer value) {
        setAttributeInternal(VOUCHERHEADERSNO, value);
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
     * Gets the attribute value for Debit, using the alias name Debit.
     * @return the value of Debit
     */
    public BigDecimal getDebit() {
        return (BigDecimal) getAttributeInternal(DEBIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Debit.
     * @param value value to set the Debit
     */
    public void setDebit(BigDecimal value) {
        setAttributeInternal(DEBIT, value);
        
    }

    /**
     * Gets the attribute value for Credit, using the alias name Credit.
     * @return the value of Credit
     */
    public BigDecimal getCredit() {
        return (BigDecimal) getAttributeInternal(CREDIT);
    }

    /**
     * Sets <code>value</code> as the attribute value for Credit.
     * @param value value to set the Credit
     */
    public void setCredit(BigDecimal value) {
        setAttributeInternal(CREDIT, value);
    }

    /**
     * Gets the attribute value for ChequeNo, using the alias name ChequeNo.
     * @return the value of ChequeNo
     */
    public String getChequeNo() {
        return (String) getAttributeInternal(CHEQUENO);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChequeNo.
     * @param value value to set the ChequeNo
     */
    public void setChequeNo(String value) {
        setAttributeInternal(CHEQUENO, value);
    }

    /**
     * Gets the attribute value for Naration, using the alias name Naration.
     * @return the value of Naration
     */
    public String getNaration() {
        return (String) getAttributeInternal(NARATION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Naration.
     * @param value value to set the Naration
     */
    public void setNaration(String value) {
        setAttributeInternal(NARATION, value);
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
     * Gets the attribute value for DepartmentId, using the alias name DepartmentId.
     * @return the value of DepartmentId
     */
    public BigDecimal getDepartmentId() {
        return (BigDecimal) getAttributeInternal(DEPARTMENTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for DepartmentId.
     * @param value value to set the DepartmentId
     */
    public void setDepartmentId(BigDecimal value) {
        setAttributeInternal(DEPARTMENTID, value);
    }

    /**
     * Gets the attribute value for ChequeDate, using the alias name ChequeDate.
     * @return the value of ChequeDate
     */
    public Timestamp getChequeDate() {
        return (Timestamp) getAttributeInternal(CHEQUEDATE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChequeDate.
     * @param value value to set the ChequeDate
     */
    public void setChequeDate(Timestamp value) {
        setAttributeInternal(CHEQUEDATE, value);
    }

    /**
     * Gets the attribute value for Quantity, using the alias name Quantity.
     * @return the value of Quantity
     */
    public Integer getQuantity() {
        return (Integer) getAttributeInternal(QUANTITY);
    }

    /**
     * Sets <code>value</code> as the attribute value for Quantity.
     * @param value value to set the Quantity
     */
    public void setQuantity(Integer value) {
        setAttributeInternal(QUANTITY, value);
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
     * Gets the attribute value for txtCOACode, using the alias name txtCOACode.
     * @return the value of txtCOACode
     */
    public String gettxtCOACode() {
        return (String) getAttributeInternal(TXTCOACODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtCOACode.
     * @param value value to set the txtCOACode
     */
    public void settxtCOACode(String value) {
        setAttributeInternal(TXTCOACODE, value);
    }

    /**
     * Gets the attribute value for txtProjectName, using the alias name txtProjectName.
     * @return the value of txtProjectName
     */
    public String gettxtProjectName() {
        return (String) getAttributeInternal(TXTPROJECTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtProjectName.
     * @param value value to set the txtProjectName
     */
    public void settxtProjectName(String value) {
        setAttributeInternal(TXTPROJECTNAME, value);
    }

    /**
     * Gets the attribute value for txtDepartmentName, using the alias name txtDepartmentName.
     * @return the value of txtDepartmentName
     */
    public String gettxtDepartmentName() {
        return (String) getAttributeInternal(TXTDEPARTMENTNAME);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtDepartmentName.
     * @param value value to set the txtDepartmentName
     */
    public void settxtDepartmentName(String value) {
        setAttributeInternal(TXTDEPARTMENTNAME, value);
    }

    /**
     * @return the associated entity GlVoucherHeaderImpl.
     */
    public GlVoucherHeaderImpl getGlVoucherHeader() {
        return (GlVoucherHeaderImpl) getAttributeInternal(GLVOUCHERHEADER);
    }

    /**
     * Sets <code>value</code> as the associated entity GlVoucherHeaderImpl.
     */
    public void setGlVoucherHeader(GlVoucherHeaderImpl value) {
        setAttributeInternal(GLVOUCHERHEADER, value);
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
     * @return the associated entity oracle.jbo.server.EntityImpl.
     */
    public EntityImpl getGlProjects() {
        return (EntityImpl) getAttributeInternal(GLPROJECTS);
    }

    /**
     * Sets <code>value</code> as the associated entity oracle.jbo.server.EntityImpl.
     */
    public void setGlProjects(EntityImpl value) {
        setAttributeInternal(GLPROJECTS, value);
    }

    /**
     * @return the associated entity erpadm.modeladm.admeo.AdminCompanyImpl.
     */
    public AdminCompanyImpl getAdminCompany() {
        return (AdminCompanyImpl) getAttributeInternal(ADMINCOMPANY);
    }

    /**
     * Sets <code>value</code> as the associated entity erpadm.modeladm.admeo.AdminCompanyImpl.
     */
    public void setAdminCompany(AdminCompanyImpl value) {
        setAttributeInternal(ADMINCOMPANY, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccGlVoucherLinesVOSEQ.
     */
    public RowSet getAccGlVoucherLinesVOSEQ() {
        return (RowSet) getAttributeInternal(ACCGLVOUCHERLINESVOSEQ);
    }


    /**
     * @param voucherLinesSno key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer voucherLinesSno) {
        return new Key(new Object[] { voucherLinesSno });
    }

    /**
     * Add attribute defaulting logic in this method.
     * @param attributeList list of attribute names/values to initialize the row
     */
    protected void create(AttributeList attributeList) {
        super.create(attributeList);
    }

    /**
     * Add entity remove logic in this method.
     */
    public void remove() {
        super.remove();
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
        if (operation==DML_INSERT) {
           String result = ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "VOUCHER_LINES_SNO",this.getEntityDef().getSource(), null, null);
           ApplicationModule am=getDBTransaction().getRootApplicationModule();
           ViewObject vo=am.findViewObject("GlVoucherHeaderByVoucherIDCRUD");
           if (vo.getCurrentRow().getAttribute("IsReversed").equals("Y")) {
                vo=am.findViewObject("GlVoucherHeaderForReverseCRUD");
           }
           populateAttributeAsChanged(VOUCHERHEADERSNO,vo.getCurrentRow().getAttribute("VoucherHeaderSno"));
            //setVoucherHeaderSno((Integer)vo.getCurrentRow().getAttribute("VoucherHeaderSno"));
           //populateAttributeAsChanged(VOUCHERLINESSNO,  Integer.parseInt(result));
           setVoucherLinesSno(Integer.parseInt(result));
            
        System.out.println(" voucher lines ");
        }
        super.doDML(operation, e);
    }
    @Override
    public void afterCommit(TransactionEvent transactionEvent) {
        // TODO Implement this method
        //System.out.println("getid"+ getVoucherLinesSno());
        //refresh(Row.REF);
        super.afterCommit(transactionEvent);
        
    }
    
}

