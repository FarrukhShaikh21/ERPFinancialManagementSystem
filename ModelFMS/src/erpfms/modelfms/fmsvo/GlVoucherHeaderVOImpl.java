package erpfms.modelfms.fmsvo;

import erpglobals.modelglobals.ERPViewObjectImpl;

import oracle.jbo.server.TransactionEvent;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Mon May 25 11:00:37 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class GlVoucherHeaderVOImpl extends ERPViewObjectImpl {
    /**
     * This is the default constructor (do not remove).
     */
    public GlVoucherHeaderVOImpl() {
    }

    /**
     * Returns the variable value for P_ADF_VOUCHER_HEADER_SNO.
     * @return variable value for P_ADF_VOUCHER_HEADER_SNO
     */
    public Integer getP_ADF_VOUCHER_HEADER_SNO() {
        return (Integer) ensureVariableManager().getVariableValue("P_ADF_VOUCHER_HEADER_SNO");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_VOUCHER_HEADER_SNO.
     * @param value value to bind as P_ADF_VOUCHER_HEADER_SNO
     */
    public void setP_ADF_VOUCHER_HEADER_SNO(Integer value) {
        ensureVariableManager().setVariableValue("P_ADF_VOUCHER_HEADER_SNO", value);
    }
    @Override
    public void afterRollback(TransactionEvent transactionEvent) {
        // TODO Implement this method
        //System.out.println("i am calling after rollback>>+"/*+getDBTransaction().getRootApplicationModule().findViewObject("GlVoucherHeaderByVoucherIDCRUD").first().getAttribute("VoucherHeaderSno")*/);
       // System.out.println("header:>>"+getDBTransaction().getRootApplicationModule().findViewObject("GlVoucherHeaderByVoucherIDCRUD").first().getAttribute("VoucherHeaderSno"));
        setErpPkColumn("VoucherHeaderSno");
        setErpParameterId("P_ADF_VOUCHER_HEADER_SNO");
        setErpViewObjectName("GlVoucherHeaderByVoucherIDCRUD");

        super.afterRollback(transactionEvent);

        
    }

    /**
     * Returns the variable value for P_ADF_USER_ID.
     * @return variable value for P_ADF_USER_ID
     */
    public Integer getP_ADF_USER_ID() {
        return (Integer) ensureVariableManager().getVariableValue("P_ADF_USER_ID");
    }

    /**
     * Sets <code>value</code> for variable P_ADF_USER_ID.
     * @param value value to bind as P_ADF_USER_ID
     */
    public void setP_ADF_USER_ID(Integer value) {
        ensureVariableManager().setVariableValue("P_ADF_USER_ID", value);
    }
}

