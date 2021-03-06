package erpfms.modelfms.fmsvo;

import erpglobals.modelglobals.ERPViewObjectImpl;

import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Thu Apr 30 17:17:22 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GlFiscalYearVOImpl extends ERPViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public GlFiscalYearVOImpl() {
    }

    /**
     * Returns the variable value for P_ADF_COMPANY_ID.
     * @return variable value for P_ADF_COMPANY_ID
     */
    public Integer getP_ADF_COMPANY_ID() {
        return (Integer) ensureVariableManager().getVariableValue("P_ADF_COMPANY_ID");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_COMPANY_ID.
     * @param value value to bind as P_ADF_COMPANY_ID
     */
    public void setP_ADF_COMPANY_ID(Integer value) {
        ensureVariableManager().setVariableValue("P_ADF_COMPANY_ID", value);
    }

    /**
     * Returns the variable value for P_ADF_FISCAL_YEAR_SNO.
     * @return variable value for P_ADF_FISCAL_YEAR_SNO
     */
    public Integer getP_ADF_FISCAL_YEAR_SNO() {
        return (Integer) ensureVariableManager().getVariableValue("P_ADF_FISCAL_YEAR_SNO");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_FISCAL_YEAR_SNO.
     * @param value value to bind as P_ADF_FISCAL_YEAR_SNO
     */
    public void setP_ADF_FISCAL_YEAR_SNO(Integer value) {
        ensureVariableManager().setVariableValue("P_ADF_FISCAL_YEAR_SNO", value);
    }
    @Override
    public void afterRollback(TransactionEvent transactionEvent) {
        // TODO Implement this method
        super.afterRollback(transactionEvent);
        setErpPkColumn("FiscalYearSno");
        setErpParameterId("P_ADF_FISCAL_YEAR_SNO");
        setErpViewObjectName("GlFiscalYearCRUD");
    }
}

