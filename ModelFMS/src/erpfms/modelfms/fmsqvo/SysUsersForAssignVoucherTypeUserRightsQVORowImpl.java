package erpfms.modelfms.fmsqvo;

import erpfms.modelfms.fmsqvo.common.SysUsersForAssignVoucherTypeUserRightsQVORow;

import oracle.jbo.Row;
import oracle.jbo.ViewObject;
import oracle.jbo.server.ViewRowImpl;
// ---------------------------------------------------------------------
// ---    File generated by Oracle ADF Business Components Design Time.
// ---    Wed Jun 10 17:41:52 PKT 2020
// ---    Custom code may be added to this class.
// ---    Warning: Do not modify method signatures of generated methods.
// ---------------------------------------------------------------------
public class SysUsersForAssignVoucherTypeUserRightsQVORowImpl extends ViewRowImpl implements SysUsersForAssignVoucherTypeUserRightsQVORow {
    /**
     * AttributesEnum: generated enum for identifying attributes and accessors. DO NOT MODIFY.
     */
    public enum AttributesEnum {
        UserId,
        UserCode,
        UserName,
        MobileNo,
        CnicNo,
        CitySno,
        Email,
        PhoneNo,
        CompanyId,
        GlobalCompanyId,
        txtSelected;
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


    public static final int USERID = AttributesEnum.UserId.index();
    public static final int USERCODE = AttributesEnum.UserCode.index();
    public static final int USERNAME = AttributesEnum.UserName.index();
    public static final int MOBILENO = AttributesEnum.MobileNo.index();
    public static final int CNICNO = AttributesEnum.CnicNo.index();
    public static final int CITYSNO = AttributesEnum.CitySno.index();
    public static final int EMAIL = AttributesEnum.Email.index();
    public static final int PHONENO = AttributesEnum.PhoneNo.index();
    public static final int COMPANYID = AttributesEnum.CompanyId.index();
    public static final int GLOBALCOMPANYID = AttributesEnum.GlobalCompanyId.index();
    public static final int TXTSELECTED = AttributesEnum.txtSelected.index();

    /**
     * This is the default constructor (do not remove).
     */
    public SysUsersForAssignVoucherTypeUserRightsQVORowImpl() {
    }

    /**
     * Gets the attribute value for the calculated attribute UserId.
     * @return the UserId
     */
    public Integer getUserId() {
        return (Integer) getAttributeInternal(USERID);
    }

    /**
     * Gets the attribute value for the calculated attribute UserCode.
     * @return the UserCode
     */
    public String getUserCode() {
        return (String) getAttributeInternal(USERCODE);
    }

    /**
     * Gets the attribute value for the calculated attribute UserName.
     * @return the UserName
     */
    public String getUserName() {
        return (String) getAttributeInternal(USERNAME);
    }

    /**
     * Gets the attribute value for the calculated attribute MobileNo.
     * @return the MobileNo
     */
    public String getMobileNo() {
        return (String) getAttributeInternal(MOBILENO);
    }

    /**
     * Gets the attribute value for the calculated attribute CnicNo.
     * @return the CnicNo
     */
    public String getCnicNo() {
        return (String) getAttributeInternal(CNICNO);
    }

    /**
     * Gets the attribute value for the calculated attribute CitySno.
     * @return the CitySno
     */
    public Integer getCitySno() {
        return (Integer) getAttributeInternal(CITYSNO);
    }

    /**
     * Gets the attribute value for the calculated attribute Email.
     * @return the Email
     */
    public String getEmail() {
        return (String) getAttributeInternal(EMAIL);
    }

    /**
     * Gets the attribute value for the calculated attribute PhoneNo.
     * @return the PhoneNo
     */
    public String getPhoneNo() {
        return (String) getAttributeInternal(PHONENO);
    }

    /**
     * Gets the attribute value for the calculated attribute CompanyId.
     * @return the CompanyId
     */
    public Integer getCompanyId() {
        return (Integer) getAttributeInternal(COMPANYID);
    }

    /**
     * Gets the attribute value for the calculated attribute GlobalCompanyId.
     * @return the GlobalCompanyId
     */
    public Integer getGlobalCompanyId() {
        return (Integer) getAttributeInternal(GLOBALCOMPANYID);
    }

    /**
     * Gets the attribute value for the calculated attribute txtSelected.
     * @return the txtSelected
     */
    public String gettxtSelected() {
        return (String) getAttributeInternal(TXTSELECTED);
    }

    /**
     * Sets <code>value</code> as the attribute value for the calculated attribute txtSelected.
     * @param value value to set the  txtSelected
     */
    public void settxtSelected(String value) {
        setAttributeInternal(TXTSELECTED, value);
    }
  
    public void doErpAssignSingleUserToVoucherType() {
            ViewObject vo = getDBTransaction().getRootApplicationModule().findViewObject("GlUserVoucherTypeCRUD");
            Row cr = vo.createRow();
            cr.setAttribute("CompanyId", getDBTransaction().getRootApplicationModule().findViewObject("AdminCompanyVOByCompanyRO").first().getAttribute("CompCode"));
            cr.setAttribute("VoucherTypeId", getDBTransaction().getRootApplicationModule().findViewObject("GlVoucherTypesByVoucherTypeIdRO").first().getAttribute("VoucherTypeId"));
            cr.setAttribute("IsActive", "Y");
            cr.setAttribute("UserId", getUserId());
            //cr.setAttribute("Remarks", "Copied" + getModuleAction());
            settxtSelected("Y");
            vo.insertRow(cr);
            getDBTransaction().commit();
            //getDBTransaction().rollback();
        vo.clearCache();
        vo.executeQuery();
        //executeQuery();
        //getDBTransaction().rollback();        
    }
    
}

