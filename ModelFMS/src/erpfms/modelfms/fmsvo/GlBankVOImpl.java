package erpfms.modelfms.fmsvo;

import erpglobals.modelglobals.ERPViewObjectImpl;

import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Tue Aug 18 13:38:42 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GlBankVOImpl extends ERPViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public GlBankVOImpl() {
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
     * Returns the variable value for P_ADF_BANK_ID.
     * @return variable value for P_ADF_BANK_ID
     */
    public Integer getP_ADF_BANK_ID() {
        return (Integer) ensureVariableManager().getVariableValue("P_ADF_BANK_ID");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_BANK_ID.
     * @param value value to bind as P_ADF_BANK_ID
     */
    public void setP_ADF_BANK_ID(Integer value) {
        ensureVariableManager().setVariableValue("P_ADF_BANK_ID", value);
    }
    @Override
    public void afterRollback(TransactionEvent transactionEvent) {
        // TODO Implement this method
        super.afterRollback(transactionEvent);
        setErpPkColumn("BankId");
        setErpParameterId("P_ADF_BANK_ID");
        setErpViewObjectName("GlBankByCompanyCRUD");
    } 
}

