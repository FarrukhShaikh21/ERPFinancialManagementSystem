package erpfms.modelfms.fmseo;

import erpglobals.modelglobals.ERPEntityImpl;

import erpglobals.modelglobals.ERPGlobalPLSQLClass;

import java.math.BigDecimal;

import java.sql.Timestamp;

import oracle.jbo.ApplicationModule;
import oracle.jbo.AttributeList;
import oracle.jbo.Key;
import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
import oracle.jbo.RowSetIterator;
import oracle.jbo.ViewObject;
import oracle.jbo.client.Configuration;
import oracle.jbo.server.EntityDefImpl;
import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Fri Apr 10 22:00:00 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GlChartOfAccountsImpl extends ERPEntityImpl {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ChartOfAccountId,
        ChartOfAccountCode,
        Description,
        ParentChartOfAccountId,
        CoaTypeSno,
        IsActive,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        CompanyId,
        GlobalCompanyId,
        LevelNo,
        txtParentCOACode,
        txtParentCOADescription,
        txtParentCOALevel,
        CoaHierarchyPath,
        txtParentHierarchyPath,
        GlChartOfAccounts,
        ParentChartOfAccountIdGlChartOfAccounts,
        GlVoucherLines,
        GlBank,
        GlBankBranch,
        GlParameter,
        AccGlParameterVO;
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


    public static final int CHARTOFACCOUNTID = AttributesEnum.ChartOfAccountId.index();
    public static final int CHARTOFACCOUNTCODE = AttributesEnum.ChartOfAccountCode.index();
    public static final int DESCRIPTION = AttributesEnum.Description.index();
    public static final int PARENTCHARTOFACCOUNTID = AttributesEnum.ParentChartOfAccountId.index();
    public static final int COATYPESNO = AttributesEnum.CoaTypeSno.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int GLOBALCOMPANYID = AttributesEnum.GlobalCompanyId.index();
    public static final int LEVELNO = AttributesEnum.LevelNo.index();
    public static final int TXTPARENTCOACODE = AttributesEnum.txtParentCOACode.index();
    public static final int TXTPARENTCOADESCRIPTION = AttributesEnum.txtParentCOADescription.index();
    public static final int TXTPARENTCOALEVEL = AttributesEnum.txtParentCOALevel.index();
    public static final int COAHIERARCHYPATH = AttributesEnum.CoaHierarchyPath.index();
    public static final int TXTPARENTHIERARCHYPATH = AttributesEnum.txtParentHierarchyPath.index();
    public static final int GLCHARTOFACCOUNTS = AttributesEnum.GlChartOfAccounts.index();
    public static final int PARENTCHARTOFACCOUNTIDGLCHARTOFACCOUNTS =
        AttributesEnum.ParentChartOfAccountIdGlChartOfAccounts.index();
    public static final int GLVOUCHERLINES = AttributesEnum.GlVoucherLines.index();
    public static final int GLBANK = AttributesEnum.GlBank.index();
    public static final int GLBANKBRANCH = AttributesEnum.GlBankBranch.index();
    public static final int GLPARAMETER = AttributesEnum.GlParameter.index();
    public static final int ACCGLPARAMETERVO = AttributesEnum.AccGlParameterVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public GlChartOfAccountsImpl() {
    }

    /**
     * @return the definition object for this instance class.
     */
    public static synchronized EntityDefImpl getDefinitionObject() {
        return EntityDefImpl.findDefObject("erpfms.modelfms.fmseo.GlChartOfAccounts");
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
     * Gets the attribute value for ChartOfAccountCode, using the alias name ChartOfAccountCode.
     * @return the value of ChartOfAccountCode
     */
    public String getChartOfAccountCode() {
        return (String) getAttributeInternal(CHARTOFACCOUNTCODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for ChartOfAccountCode.
     * @param value value to set the ChartOfAccountCode
     */
    public void setChartOfAccountCode(String value) {
        setAttributeInternal(CHARTOFACCOUNTCODE, value);
    }

    /**
     * Gets the attribute value for Description, using the alias name Description.
     * @return the value of Description
     */
    public String getDescription() {
        return (String) getAttributeInternal(DESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for Description.
     * @param value value to set the Description
     */
    public void setDescription(String value) {
        setAttributeInternal(DESCRIPTION, value);
    }

    /**
     * Gets the attribute value for ParentChartOfAccountId, using the alias name ParentChartOfAccountId.
     * @return the value of ParentChartOfAccountId
     */
    public Integer getParentChartOfAccountId() {
        return (Integer) getAttributeInternal(PARENTCHARTOFACCOUNTID);
    }

    /**
     * Sets <code>value</code> as the attribute value for ParentChartOfAccountId.
     * @param value value to set the ParentChartOfAccountId
     */
    public void setParentChartOfAccountId(Integer value) {
        setAttributeInternal(PARENTCHARTOFACCOUNTID, value);
    }

    /**
     * Gets the attribute value for CoaTypeSno, using the alias name CoaTypeSno.
     * @return the value of CoaTypeSno
     */
    public Integer getCoaTypeSno() {
        return (Integer) getAttributeInternal(COATYPESNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for CoaTypeSno.
     * @param value value to set the CoaTypeSno
     */
    public void setCoaTypeSno(Integer value) {
        setAttributeInternal(COATYPESNO, value);
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
     * Gets the attribute value for LevelNo, using the alias name LevelNo.
     * @return the value of LevelNo
     */
    public Integer getLevelNo() {
        return (Integer) getAttributeInternal(LEVELNO);
    }

    /**
     * Sets <code>value</code> as the attribute value for LevelNo.
     * @param value value to set the LevelNo
     */
    public void setLevelNo(Integer value) {
        setAttributeInternal(LEVELNO, value);
    }

    /**
     * Gets the attribute value for txtParentCOACode, using the alias name txtParentCOACode.
     * @return the value of txtParentCOACode
     */
    public String gettxtParentCOACode() {
        return (String) getAttributeInternal(TXTPARENTCOACODE);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtParentCOACode.
     * @param value value to set the txtParentCOACode
     */
    public void settxtParentCOACode(String value) {
        setAttributeInternal(TXTPARENTCOACODE, value);
    }

    /**
     * Gets the attribute value for txtParentCOADescription, using the alias name txtParentCOADescription.
     * @return the value of txtParentCOADescription
     */
    public String gettxtParentCOADescription() {
        return (String) getAttributeInternal(TXTPARENTCOADESCRIPTION);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtParentCOADescription.
     * @param value value to set the txtParentCOADescription
     */
    public void settxtParentCOADescription(String value) {
        setAttributeInternal(TXTPARENTCOADESCRIPTION, value);
    }

    /**
     * Gets the attribute value for txtParentCOALevel, using the alias name txtParentCOALevel.
     * @return the value of txtParentCOALevel
     */
    public Integer gettxtParentCOALevel() {
        return (Integer) getAttributeInternal(TXTPARENTCOALEVEL);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtParentCOALevel.
     * @param value value to set the txtParentCOALevel
     */
    public void settxtParentCOALevel(Integer value) {
        setAttributeInternal(TXTPARENTCOALEVEL, value);
    }


    /**
     * Gets the attribute value for CoaHierarchyPath, using the alias name CoaHierarchyPath.
     * @return the value of CoaHierarchyPath
     */
    public String getCoaHierarchyPath() {
        return (String) getAttributeInternal(COAHIERARCHYPATH);
    }

    /**
     * Sets <code>value</code> as the attribute value for CoaHierarchyPath.
     * @param value value to set the CoaHierarchyPath
     */
    public void setCoaHierarchyPath(String value) {
        setAttributeInternal(COAHIERARCHYPATH, value);
    }

    /**
     * Gets the attribute value for txtParentHierarchyPath, using the alias name txtParentHierarchyPath.
     * @return the value of txtParentHierarchyPath
     */
    public String gettxtParentHierarchyPath() {
        return (String) getAttributeInternal(TXTPARENTHIERARCHYPATH);
    }

    /**
     * Sets <code>value</code> as the attribute value for txtParentHierarchyPath.
     * @param value value to set the txtParentHierarchyPath
     */
    public void settxtParentHierarchyPath(String value) {
        setAttributeInternal(TXTPARENTHIERARCHYPATH, value);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getGlChartOfAccounts() {
        return (RowIterator) getAttributeInternal(GLCHARTOFACCOUNTS);
    }

    /**
     * @return the associated entity GlChartOfAccountsImpl.
     */
    public GlChartOfAccountsImpl getParentChartOfAccountIdGlChartOfAccounts() {
        return (GlChartOfAccountsImpl) getAttributeInternal(PARENTCHARTOFACCOUNTIDGLCHARTOFACCOUNTS);
    }

    /**
     * Sets <code>value</code> as the associated entity GlChartOfAccountsImpl.
     */
    public void setParentChartOfAccountIdGlChartOfAccounts(GlChartOfAccountsImpl value) {
        setAttributeInternal(PARENTCHARTOFACCOUNTIDGLCHARTOFACCOUNTS, value);
    }


    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getGlVoucherLines() {
        return (RowIterator) getAttributeInternal(GLVOUCHERLINES);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getGlBank() {
        return (RowIterator) getAttributeInternal(GLBANK);
    }

    /**
     * @return the associated entity oracle.jbo.RowIterator.
     */
    public RowIterator getGlBankBranch() {
        return (RowIterator) getAttributeInternal(GLBANKBRANCH);
    }

    /**
     * @return the associated entity GlParameterImpl.
     */
    public GlParameterImpl getGlParameter() {
        return (GlParameterImpl) getAttributeInternal(GLPARAMETER);
    }

    /**
     * Sets <code>value</code> as the associated entity GlParameterImpl.
     */
    public void setGlParameter(GlParameterImpl value) {
        setAttributeInternal(GLPARAMETER, value);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccGlParameterVO.
     */
    public RowSet getAccGlParameterVO() {
        return (RowSet) getAttributeInternal(ACCGLPARAMETERVO);
    }


    /**
     * @param chartOfAccountId key constituent

     * @return a Key object based on given key constituents.
     */
    public static Key createPrimaryKey(Integer chartOfAccountId) {
        return new Key(new Object[] { chartOfAccountId });
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
           String result = ERPGlobalPLSQLClass.doGetPrimaryKeyValueModel(getDBTransaction(), "CHART_OF_ACCOUNT_ID",this.getEntityDef().getSource(), null, null);
           
           populateAttributeAsChanged(CHARTOFACCOUNTID,  Integer.parseInt(result));
           populateAttributeAsChanged(COAHIERARCHYPATH, (getParentChartOfAccountId()==null?result:gettxtParentHierarchyPath()+"-"+result) );
           populateAttributeAsChanged(LEVELNO, (gettxtParentCOALevel()==null?1:gettxtParentCOALevel()+1 ) );
            RowSet rs=getAccGlParameterVO();
        //////////////////////////////
        String pad="0000000000";///this is for padding only
        String posFix="";//this is for padding upto end
        rs.setNamedWhereClauseParam("P_ADF_PARAMETER_ID","COA_LEVELS");//total coa levels
        rs.executeQuery();
        Integer coaLevels=Integer.parseInt(rs.first().getAttribute("ParameterValue").toString());//total coa levels
        
        rs.setNamedWhereClauseParam("P_ADF_PARAMETER_ID","COA_LEVEL_SEPARATOR");//coa level separator
        rs.executeQuery();
        
        String seperator=rs.first().getAttribute("ParameterValue").toString();//coa level separator
        String parentCOAID=gettxtParentCOACode()==null?"":gettxtParentCOACode();
        //System.out.println("current level"+getLevelNo());
        Integer currentLevel=getLevelNo();
        Integer lSubStr=0;//this is from where we need to get maximum, substr parameter
        for (int i = 1; i < currentLevel; i++) {
        rs.setNamedWhereClauseParam("P_ADF_PARAMETER_ID","COA_LEVEL"+i+"_LENGTH");
        rs.executeQuery();
        lSubStr=lSubStr+Integer.parseInt(""+rs.first().getAttribute("ParameterValue"));
        lSubStr++;
        }
        
        
        String preFix=parentCOAID.substring(0,lSubStr);//GETTING PRFIX
        lSubStr++;
        rs.setNamedWhereClauseParam("P_ADF_PARAMETER_ID","COA_LEVEL"+currentLevel+"_LENGTH");
        rs.executeQuery();
        Integer lLevelLength=Integer.parseInt(""+rs.first().getAttribute("ParameterValue"));
        String sql=" SELECT LPAD(COALESCE(MAX(SUBSTR(COA.CHART_OF_ACCOUNT_CODE,"+lSubStr+","+lLevelLength+")*1),0)+1,"+lLevelLength+",0) SR\n" + 
        "  FROM   GL_CHART_OF_ACCOUNTS COA \n" +
        "  WHERE  COA.COMPANY_ID=" +getCompanyId()+
        "  AND    COA.GLOBAL_COMPANY_ID=" + getGlobalCompanyId()+
        (getParentChartOfAccountId()==null?"":"  AND    PARENT_CHART_OF_ACCOUNT_ID="+getParentChartOfAccountId());
        
       // System.out.println("this is sql");
        //System.out.println(sql);
        result=ERPGlobalPLSQLClass.doExecuteSQLQueryModel(getDBTransaction(), sql);
        
        //checking how many levels exist after this level, then it will add zero accordingly
        for (int i = currentLevel+1; i <= coaLevels; i++) {
            rs.setNamedWhereClauseParam("P_ADF_PARAMETER_ID","COA_LEVEL"+i+"_LENGTH");
            rs.executeQuery();
            lLevelLength=Integer.parseInt(""+rs.first().getAttribute("ParameterValue"));
            posFix=posFix+seperator+pad.substring(0, lLevelLength);  
        }
        //System.out.println(preFix+"0001");
        //System.out.println(posFix+"<posFix");
        
        populateAttributeAsChanged(CHARTOFACCOUNTCODE, preFix+result+posFix);
        //////////////////////////
       }
        super.doDML(operation, e);
    }
}

