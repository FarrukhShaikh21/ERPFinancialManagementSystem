package erpfms.modelfms.fmsvo;

import erpfms.modelfms.fmseo.GlParameterImpl;

import erpglobals.modelglobals.ERPViewRowImpl;

import java.sql.Timestamp;

import oracle.jbo.RowIterator;
import oracle.jbo.RowSet;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Apr 07 13:15:12 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GlParameterVORowImpl extends ERPViewRowImpl {


    public static final int ENTITY_GLPARAMETER = 0;

    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        ParameterId,
        ParameterValue,
        ParameterDescrption,
        CompanyId,
        CreatedBy,
        CreatedDate,
        LastUpdatedBy,
        LastUpdatedDate,
        GlobalCompanyId,
        IsActive,
        txtGetMinEntityState,
        txtGetMaxEntityState,
        txtGetEntityState,
        GlChartOfAccountsVO,
        AccSysGeneralValueVO;
        static AttributesEnum[] vals = null;
        ;
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


    public static final int PARAMETERID = AttributesEnum.ParameterId.index();
    public static final int PARAMETERVALUE = AttributesEnum.ParameterValue.index();
    public static final int PARAMETERDESCRPTION = AttributesEnum.ParameterDescrption.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int CREATEDBY = AttributesEnum.CreatedBy.index();
    public static final int CREATEDDATE = AttributesEnum.CreatedDate.index();
    public static final int LASTUPDATEDBY = AttributesEnum.LastUpdatedBy.index();
    public static final int LASTUPDATEDDATE = AttributesEnum.LastUpdatedDate.index();
    public static final int GLOBALCOMPANYID = AttributesEnum.GlobalCompanyId.index();
    public static final int ISACTIVE = AttributesEnum.IsActive.index();
    public static final int TXTGETMINENTITYSTATE = AttributesEnum.txtGetMinEntityState.index();
    public static final int TXTGETMAXENTITYSTATE = AttributesEnum.txtGetMaxEntityState.index();
    public static final int TXTGETENTITYSTATE = AttributesEnum.txtGetEntityState.index();
    public static final int GLCHARTOFACCOUNTSVO = AttributesEnum.GlChartOfAccountsVO.index();
    public static final int ACCSYSGENERALVALUEVO = AttributesEnum.AccSysGeneralValueVO.index();

    /**
     * This is the default constructor (do not remove).
     */
    public GlParameterVORowImpl() {
    }

    /**
     * Gets GlParameter entity object.
     * @return the GlParameter
     */
    public GlParameterImpl getGlParameter() {
        return (GlParameterImpl) getEntity(ENTITY_GLPARAMETER);
    }

    /**
     * Gets the attribute value for PARAMETER_ID using the alias name ParameterId.
     * @return the PARAMETER_ID
     */
    public String getParameterId() {
        return (String) getAttributeInternal(PARAMETERID);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAMETER_ID using the alias name ParameterId.
     * @param value value to set the PARAMETER_ID
     */
    public void setParameterId(String value) {
        setAttributeInternal(PARAMETERID, value);
    }

    /**
     * Gets the attribute value for PARAMETER_VALUE using the alias name ParameterValue.
     * @return the PARAMETER_VALUE
     */
    public String getParameterValue() {
        return (String) getAttributeInternal(PARAMETERVALUE);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAMETER_VALUE using the alias name ParameterValue.
     * @param value value to set the PARAMETER_VALUE
     */
    public void setParameterValue(String value) {
        setAttributeInternal(PARAMETERVALUE, value);
    }

    /**
     * Gets the attribute value for PARAMETER_DESCRPTION using the alias name ParameterDescrption.
     * @return the PARAMETER_DESCRPTION
     */
    public String getParameterDescrption() {
        return (String) getAttributeInternal(PARAMETERDESCRPTION);
    }

    /**
     * Sets <code>value</code> as attribute value for PARAMETER_DESCRPTION using the alias name ParameterDescrption.
     * @param value value to set the PARAMETER_DESCRPTION
     */
    public void setParameterDescrption(String value) {
        setAttributeInternal(PARAMETERDESCRPTION, value);
    }

    /**
     * Gets the attribute value for COMPANY_ID using the alias name CompanyId.
     * @return the COMPANY_ID
     */
    public Integer getCompanyId() {
        return (Integer) getAttributeInternal(COMPANYID);
    }

    /**
     * Sets <code>value</code> as attribute value for COMPANY_ID using the alias name CompanyId.
     * @param value value to set the COMPANY_ID
     */
    public void setCompanyId(Integer value) {
        setAttributeInternal(COMPANYID, value);
    }

    /**
     * Gets the attribute value for CREATED_BY using the alias name CreatedBy.
     * @return the CREATED_BY
     */
    public Integer getCreatedBy() {
        return (Integer) getAttributeInternal(CREATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_BY using the alias name CreatedBy.
     * @param value value to set the CREATED_BY
     */
    public void setCreatedBy(Integer value) {
        setAttributeInternal(CREATEDBY, value);
    }

    /**
     * Gets the attribute value for CREATED_DATE using the alias name CreatedDate.
     * @return the CREATED_DATE
     */
    public Timestamp getCreatedDate() {
        return (Timestamp) getAttributeInternal(CREATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for CREATED_DATE using the alias name CreatedDate.
     * @param value value to set the CREATED_DATE
     */
    public void setCreatedDate(Timestamp value) {
        setAttributeInternal(CREATEDDATE, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @return the LAST_UPDATED_BY
     */
    public Integer getLastUpdatedBy() {
        return (Integer) getAttributeInternal(LASTUPDATEDBY);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_BY using the alias name LastUpdatedBy.
     * @param value value to set the LAST_UPDATED_BY
     */
    public void setLastUpdatedBy(Integer value) {
        setAttributeInternal(LASTUPDATEDBY, value);
    }

    /**
     * Gets the attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @return the LAST_UPDATED_DATE
     */
    public Timestamp getLastUpdatedDate() {
        return (Timestamp) getAttributeInternal(LASTUPDATEDDATE);
    }

    /**
     * Sets <code>value</code> as attribute value for LAST_UPDATED_DATE using the alias name LastUpdatedDate.
     * @param value value to set the LAST_UPDATED_DATE
     */
    public void setLastUpdatedDate(Timestamp value) {
        setAttributeInternal(LASTUPDATEDDATE, value);
    }

    /**
     * Gets the attribute value for GLOBAL_COMPANY_ID using the alias name GlobalCompanyId.
     * @return the GLOBAL_COMPANY_ID
     */
    public Integer getGlobalCompanyId() {
        return (Integer) getAttributeInternal(GLOBALCOMPANYID);
    }

    /**
     * Sets <code>value</code> as attribute value for GLOBAL_COMPANY_ID using the alias name GlobalCompanyId.
     * @param value value to set the GLOBAL_COMPANY_ID
     */
    public void setGlobalCompanyId(Integer value) {
        setAttributeInternal(GLOBALCOMPANYID, value);
    }

    /**
     * Gets the attribute value for IS_ACTIVE using the alias name IsActive.
     * @return the IS_ACTIVE
     */
    public String getIsActive() {
        return (String) getAttributeInternal(ISACTIVE);
    }

    /**
     * Sets <code>value</code> as attribute value for IS_ACTIVE using the alias name IsActive.
     * @param value value to set the IS_ACTIVE
     */
    public void setIsActive(String value) {
        setAttributeInternal(ISACTIVE, value);
    }

    /**
     * Gets the attribute value for the calculated attribute txtGetMinEntityState.
     * @return the txtGetMinEntityState
     */
    public Integer gettxtGetMinEntityState() {
        return (Integer) getAttributeInternal(TXTGETMINENTITYSTATE);
    }


    /**
     * Gets the attribute value for the calculated attribute txtGetMaxEntityState.
     * @return the txtGetMaxEntityState
     */
    public Integer gettxtGetMaxEntityState() {
        return (Integer) getAttributeInternal(TXTGETMAXENTITYSTATE);
    }

    /**
     * Gets the attribute value for the calculated attribute txtGetEntityState.
     * @return the txtGetEntityState
     */
    public Integer gettxtGetEntityState() {
        return (Integer) getAttributeInternal(TXTGETENTITYSTATE);
    }

    /**
     * Gets the associated <code>RowIterator</code> using master-detail link GlChartOfAccountsVO.
     */
    public RowIterator getGlChartOfAccountsVO() {
        return (RowIterator) getAttributeInternal(GLCHARTOFACCOUNTSVO);
    }

    /**
     * Gets the view accessor <code>RowSet</code> AccSysGeneralValueVO.
     */
    public RowSet getAccSysGeneralValueVO() {
        return (RowSet) getAttributeInternal(ACCSYSGENERALVALUEVO);
    }
   
   @Override
    public byte ERPdoGetEntityState() {
        // TODO Implement this method
        return super.ERPdoGetEntityState();
    }
    
}

