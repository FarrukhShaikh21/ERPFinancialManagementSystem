package erpfms.modelfms.fmsvo;

import erpfms.modelfms.fmsvo.common.GlBankBranchVO;

import erpglobals.modelglobals.ERPViewObjectImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Aug 04 15:25:06 PKT 2021
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GlBankBranchVOImpl extends ERPViewObjectImpl implements GlBankBranchVO {
    /**
     * This is the default constructor (do not remove).
     */
    public GlBankBranchVOImpl() {
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
    public void executeEmptyRowSet() {
        // TODO Implement this method
        super.executeEmptyRowSet();
    }
}
