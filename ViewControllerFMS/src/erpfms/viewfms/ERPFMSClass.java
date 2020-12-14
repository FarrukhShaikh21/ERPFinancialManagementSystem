package erpfms.viewfms;

import erpglobals.modelglobals.ERPGlobalPLSQLClass;
import erpglobals.modelglobals.ERPUserAttribute;

import java.text.ParseException;

import org.apache.myfaces.trinidad.util.Service;

import erpglobals.viewglobals.ERPGlobalsClass;


import java.io.IOException;

import java.io.InputStream;

import java.math.BigDecimal;

import java.sql.CallableStatement;
import java.sql.PreparedStatement;

import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Timestamp;
import java.sql.Types;

import java.text.ParseException;
import java.text.SimpleDateFormat;

import java.util.ArrayList;
import java.util.Iterator;

import java.util.List;

import javax.faces.application.FacesMessage;
import javax.faces.component.UIComponent;
import javax.faces.component.UIViewRoot;
import javax.faces.context.FacesContext;

import javax.faces.event.ActionEvent;

import javax.faces.event.ValueChangeEvent;

import oracle.adf.model.BindingContext;
import oracle.adf.model.binding.DCBindingContainer;
import oracle.adf.model.binding.DCDataControl;
import oracle.adf.model.binding.DCIteratorBinding;
import oracle.adf.share.ADFContext;
import oracle.adf.view.rich.component.rich.RichPopup;
import oracle.adf.view.rich.component.rich.data.RichTable;
import oracle.adf.view.rich.component.rich.data.RichTreeTable;

import oracle.adf.view.rich.component.rich.input.RichInputComboboxListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputDate;
import oracle.adf.view.rich.component.rich.input.RichInputListOfValues;
import oracle.adf.view.rich.component.rich.input.RichInputText;
import oracle.adf.view.rich.component.rich.input.RichSelectOneChoice;
import oracle.adf.view.rich.component.rich.layout.RichPanelBox;
import oracle.adf.view.rich.component.rich.layout.RichPanelFormLayout;
import oracle.adf.view.rich.component.rich.layout.RichPanelTabbed;

import oracle.adf.view.rich.component.rich.nav.RichButton;
import oracle.adf.view.rich.component.rich.nav.RichCommandButton;
import oracle.adf.view.rich.component.rich.nav.RichLink;
import oracle.adf.view.rich.component.rich.output.RichPanelCollection;
import oracle.adf.view.rich.context.AdfFacesContext;
import oracle.adf.view.rich.event.DialogEvent;

import oracle.adf.view.rich.event.PopupCanceledEvent;
import oracle.adf.view.rich.event.PopupFetchEvent;
import oracle.adf.view.rich.render.ClientEvent;

import oracle.binding.BindingContainer;
import oracle.binding.OperationBinding;

import oracle.jbo.ApplicationModule;
import oracle.jbo.Row;

import oracle.jbo.ViewObject;

import oracle.jbo.server.DBTransaction;

import org.apache.myfaces.trinidad.model.RowKeySet;
import org.apache.myfaces.trinidad.model.UploadedFile;
import org.apache.myfaces.trinidad.render.ExtendedRenderKitService;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
class ErpVoucherUoload {
    String  ErpCoaAccountno;
    Double  Erpdebit;
    Double  Erpcredit;
    String  Erpnarration;
    Double  Erpdepartmentid;
    Double  ErppProjectId;
    Double  ErpQuantity;
    String  ErpChequeNo;
    String  ErpChequeDate;
}

public class ERPFMSClass {
    public ERPFMSClass() {
        super();
    }
 
    private String ERPBackActionName="ERPBACKCRUD";
    private String lIteratorName="SysUsersCRUDIterator";
    private String lIteratorDetailName=null;
    private String l_operation;
    private Integer ERPuserId;
    private String ERPuserCode = "";
    private ERPUserAttribute ERPUserAttributes;
    private RichTreeTable ErpCOATreeTable;
    private RichTreeTable ErpDefaultTreeTable;  
    private Integer ERPCoaID;
    private RichPanelTabbed ERPCOATab;
    private RichPanelTabbed ERPFMSDefaultTab;
    private RichPopup lerpSupervisePopupConfirm;
    private RichPopup lerpUnSupervisePopupConfirm;
    private RichPopup lerpReversePopupConfirm;
    private RichTable erpTable;
    private RichInputText erpFocusText;
    private RichPanelFormLayout erpReportForm;
    private RichInputText erpInputText;
    private RichSelectOneChoice erpSelectOneChoice;
    private RichPanelBox erpReportBoxForm;
    private String erpShowCompany;
    private RichInputText erpMaxOrgLevel;
    private RichInputText erpReportHeaderSno;
    private List erpbulkVoucher;
    private RichInputComboboxListOfValues erpModuleAction;
    private RichInputText erpReportName;
    private String erpScreenSize;
    private String ERPFinanceReportName;
    private String ERPPKForReport;


    public void setERPPKForReport(String ERPPKForReport) {
        this.ERPPKForReport = ERPPKForReport;
    }

    public String getERPPKForReport() {
        return ERPPKForReport;
    }

    public void setERPFinanceReportName(String ERPFinanceReportName) {
        this.ERPFinanceReportName = ERPFinanceReportName;
    }

    public String getERPFinanceReportName() {
        return ERPFinanceReportName;
    }

    public void setErpScreenSize(String erpScreenSize) {
        this.erpScreenSize = erpScreenSize;
    }

    public String getErpScreenSize() {
        return erpScreenSize;
    }

    public void setErpReportName(RichInputText erpReportName) {
        this.erpReportName = erpReportName;
    }

    public RichInputText getErpReportName() {
        return erpReportName;
    }

    public void setErpModuleAction(RichInputComboboxListOfValues erpModuleAction) {
              this.erpModuleAction = erpModuleAction;
    }

    public RichInputComboboxListOfValues getErpModuleAction() {
        return erpModuleAction;
    }

    public void setErpReportHeaderSno(RichInputText erpReportHeaderSno) {
        this.erpReportHeaderSno = erpReportHeaderSno;
    }

    public RichInputText getErpReportHeaderSno() {
        return erpReportHeaderSno;
    }


    public void setErpMaxOrgLevel(RichInputText erpMaxOrgLevel) {
        this.erpMaxOrgLevel = erpMaxOrgLevel;
    }

    public RichInputText getErpMaxOrgLevel() {
        return erpMaxOrgLevel;
    }

    public void setErpShowCompany(String erpShowCompany) {
        this.erpShowCompany = erpShowCompany;
    }

    public String getErpShowCompany() {
        return erpShowCompany;
    }

    public void setErpReportBoxForm(RichPanelBox erpReportBoxForm) {
        this.erpReportBoxForm = erpReportBoxForm;
    }

    public RichPanelBox getErpReportBoxForm() {
        return erpReportBoxForm;
    }

    public void setErpInputText(RichInputText erpInputText) {
        this.erpInputText = erpInputText;
    }

    public RichInputText getErpInputText() {
        return erpInputText;
    }

    public void setErpSelectOneChoice(RichSelectOneChoice erpSelectOneChoice) {
        this.erpSelectOneChoice = erpSelectOneChoice;
    }

    public RichSelectOneChoice getErpSelectOneChoice() {
        return erpSelectOneChoice;
    }


    public void setErpReportForm(RichPanelFormLayout erpReportForm) {
        this.erpReportForm = erpReportForm;
    }

    public RichPanelFormLayout getErpReportForm() {
        return erpReportForm;
    }


    public void setLerpReversePopupConfirm(RichPopup lerpReversePopupConfirm) {
        this.lerpReversePopupConfirm = lerpReversePopupConfirm;
    }

    public RichPopup getLerpReversePopupConfirm() {
        return lerpReversePopupConfirm;
    }

    public void setErpFocusText(RichInputText erpFocusText) {
        this.erpFocusText = erpFocusText;
    }

    public RichInputText getErpFocusText() {
        return erpFocusText;
    }

    public void setErpTable(RichTable erpTable) {
        this.erpTable = erpTable;
    }

    public RichTable getErpTable() {
        return erpTable;
    }

    public void setLerpSupervisePopupConfirm(RichPopup lerpSupervisePopupConfirm) {
        this.lerpSupervisePopupConfirm = lerpSupervisePopupConfirm;
    }

    public RichPopup getLerpSupervisePopupConfirm() {
        return lerpSupervisePopupConfirm;
    }

    public void setLerpUnSupervisePopupConfirm(RichPopup lerpUnSupervisePopupConfirm) {
        this.lerpUnSupervisePopupConfirm = lerpUnSupervisePopupConfirm;
    }

    public RichPopup getLerpUnSupervisePopupConfirm() {
        return lerpUnSupervisePopupConfirm;
    }

    public void setERPCOATab(RichPanelTabbed ERPCOATab) {
        this.ERPCOATab = ERPCOATab;
    }

    public RichPanelTabbed getERPCOATab() {
        return ERPCOATab;
    }


    public void setERPFMSDefaultTab(RichPanelTabbed ERPFMSDefaultTab) {
        this.ERPFMSDefaultTab = ERPFMSDefaultTab;
    }

    public RichPanelTabbed getERPFMSDefaultTab() {
        return ERPFMSDefaultTab;
    }

    public void setERPCoaID(Integer ERPCoaID) {
        this.ERPCoaID = ERPCoaID;
    }

    public Integer getERPCoaID() {
        return ERPCoaID;
    }

    public void setErpDefaultTreeTable(RichTreeTable ErpDefaultTreeTable) {
        this.ErpDefaultTreeTable = ErpDefaultTreeTable;
    }

    public RichTreeTable getErpDefaultTreeTable() {
        return ErpDefaultTreeTable;
    }

    public void setErpCOATreeTable(RichTreeTable ErpCOATreeTable) {
        this.ErpCOATreeTable = ErpCOATreeTable;
    }

    public RichTreeTable getErpCOATreeTable() {
        return ErpCOATreeTable;
    }

    public void setERPBackActionName(String ERPBackActionName) {
        this.ERPBackActionName = ERPBackActionName;
    }

    public String getERPBackActionName() {
        return ERPBackActionName;
    }

    public void setLIteratorName(String lIteratorName) {
        this.lIteratorName = lIteratorName;
    }

    public String getLIteratorName() {
        return lIteratorName;
    }

    public void setLIteratorDetailName(String lIteratorDetailName) {
        this.lIteratorDetailName = lIteratorDetailName;
    }

    public String getLIteratorDetailName() {
        return lIteratorDetailName;
    }

    public void setL_operation(String l_operation) {
        this.l_operation = l_operation;
    }

    public String getL_operation() {
        return l_operation;
    }

    public void setERPuserId(Integer ERPuserId) {
        this.ERPuserId = ERPuserId;
    }

    public Integer getERPuserId() {
        return ERPuserId;
    }

    public void setERPuserCode(String ERPuserCode) {
        this.ERPuserCode = ERPuserCode;
    }

    public String getERPuserCode() {
        return ERPuserCode;
    }

    public void setERPUserAttributes(ERPUserAttribute ERPUserAttributes) {
        this.ERPUserAttributes = ERPUserAttributes;
    }

    public ERPUserAttribute getERPUserAttributes() {
        return ERPUserAttributes;
    }
 

    public String doBackFromEdit() {
        
        if (ERPGlobalsClass.doCheckERPTransactionDirty()) {
           FacesMessage fm=new FacesMessage("Please Save/Undo Changes Before Going Back.");
           FacesContext.getCurrentInstance().addMessage(null,fm);
           
           return null;
                }
        /*if (ERPGlobalsClass.isRecordChanged(lIteratorName).equals("YES") ||(lIteratorDetailName!=null && ERPGlobalsClass.isRecordChanged(lIteratorDetailName).equals("YES"))) {
            lIteratorDetailName=null;
           FacesMessage fm=new FacesMessage("Please Save/Undo Changes Before Going Back.");
           FacesContext.getCurrentInstance().addMessage(null,fm);
           
           return null;
        } */       
        return ERPBackActionName;
    }
    
    public void doSetFMSErpApplicationGlobals() {
        /*
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_SNO",1);
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_CODE","FARRUKH");
        ADFContext.getCurrent().getPageFlowScope().put("G_GLOBAL_DEF_COMPANY",1);
        ADFContext.getCurrent().getPageFlowScope().put("G_ERP_MODULE_ACTION","SEC_0011");
        ADFContext.getCurrent().getPageFlowScope().put("G_TEMP_COMP_ACCESS_TABLE","temp_admin_company_access");
        ADFContext.getCurrent().getPageFlowScope().put("G_TEMP_DEPT_ACCESS_TABLE","temp_admin_department_access");
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_NAME","FARRUKH SHAIKH");
        System.out.println("five erp");
        //getERPUserAttributes().setUserCode(getERPuserCode());
        //getERPUserAttributes().setUserId(getERPuserId());
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_PICTURE","PICTURE NAME");
               
         if (1==1) {
            return;
         }*/
       
        //System.out.println("one erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_SNO",getERPUserAttributes().getUserId());
        //System.out.println("two erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_CODE",getERPUserAttributes().getUserCode());
        //System.out.println("three erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_GLOBAL_DEF_COMPANY",getERPUserAttributes().getErpDefGloalCompany());
        //System.out.println("four erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_TEMP_COMP_ACCESS_TABLE",getERPUserAttributes().getErpTempCompanyAccessTable());
        //System.out.println("four erp");
        ADFContext.getCurrent().getPageFlowScope().put("G_TEMP_DEPT_ACCESS_TABLE",getERPUserAttributes().getErpTempDepartAccessTable());
        ////////////////
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_NAME",getERPUserAttributes().getERPUserName());
        System.out.println("five erp");
        getERPUserAttributes().setUserCode(getERPuserCode());
        getERPUserAttributes().setUserId(getERPuserId());
        ADFContext.getCurrent().getPageFlowScope().put("G_USER_PICTURE",getERPUserAttributes().getERPUserPicture());
        System.out.println("six erp-01-new:"+getERPuserId());
       //////// 
        
    } 

    public String doERPAddRecordWithParaVouch() {
    
        if (ERPGlobalsClass.isRecordChanged(lIteratorName).equals("YES") ) {
            lIteratorDetailName=null;
           FacesMessage fm=new FacesMessage("Please Save/Undo Changes Before Adding Record.");
           FacesContext.getCurrentInstance().addMessage(null,fm);
           return null;
        }        
        OperationBinding ob = ERPGlobalsClass.doGetERPOperation("executeEmptyRowSet");
            ob.execute();
            ob=ERPGlobalsClass.doGetERPOperation("CreateWithParams");
            ob.execute();
                
        return null;
    }
    
    public String doERPAddRecordWithPara() {
    
        if (ERPGlobalsClass.doCheckERPTransactionDirty() ) {
            lIteratorDetailName=null;
           FacesMessage fm=new FacesMessage("Please Save/Undo Changes Before Adding Record.");
           FacesContext.getCurrentInstance().addMessage(null,fm);
           return null;
        }        
        OperationBinding ob=ERPGlobalsClass.doGetERPOperation("CreateWithParams");
        ob.execute();
                
        return null;
    }
 
    public void doERPConfirmDelete(DialogEvent erpde) {
         //this is using on form sec_0006_edit
         if (erpde.getOutcome()==DialogEvent.Outcome.yes) {
             OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Delete");
             ob.execute();
             ob = ERPGlobalsClass.doGetERPOperation("Commit");
             Object o= ob.execute();
             doERPShowSaveMessage("Record Deleted Successfully.");      
         }
     }    

    public void doERPShowSaveMessage(String pMessage){
           FacesContext context = FacesContext.getCurrentInstance();
           ExtendedRenderKitService erks = Service.getService(context.getRenderKit(), ExtendedRenderKitService.class);
           erks.addScript(context, "showNotificationCallback('"+pMessage+"')");
       }

    public String doERPPopSupervisedRecord() {

        OperationBinding ob=ERPGlobalsClass.doGetERPOperation("Commit");
        Object execute = ob.execute(); 
        ob.execute();
        //error occurs during saving the record.
        if (!ob.getErrors().isEmpty()) {
          FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(ob.getErrors().toString()));  
          return null;
        }
        RichPopup.PopupHints hints = new RichPopup.PopupHints();
        this.lerpSupervisePopupConfirm.show(hints); 
         return null;
    }   
    
    public String doERPPopUnSuperviseRecord() {
         RichPopup.PopupHints hints = new RichPopup.PopupHints();
         this.lerpUnSupervisePopupConfirm.show(hints); 
          return null;
     }
    
    public void doERPConfirmUnSuperviseDialog(DialogEvent de) {
        ///user wants to save the record
        if (de.getOutcome() == DialogEvent.Outcome.yes) {
            BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
            DCIteratorBinding ib = (DCIteratorBinding) bc.get(lIteratorName);
            ib.getCurrentRow().setAttribute("IsSupervised", "N");
            ib.getCurrentRow().setAttribute("SupervisedDate", null);
            ib.getCurrentRow().setAttribute("SupervisedBy", null);
            ib.getCurrentRow().setAttribute("IsUnsupervised", "Y");
            
            OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Commit");
            ob.execute();
            //error occurs during saving the record.
            if (!ob.getErrors().isEmpty()) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(ob.getErrors().toString()));
                return;
            }
            doERPShowSaveMessage("Record Unupervised Successfully.");   
        }
    } 





    public void doERPConfirmSuperviseDialog(DialogEvent de) {
        ///user wants to save the record
        if (de.getOutcome() == DialogEvent.Outcome.yes) {
            OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Commit");
            //error occurs during saving the record.
            ob.execute();
            if (!ob.getErrors().isEmpty()) {
                FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(ob.getErrors().toString()));
                return;
            }
            BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
            DCIteratorBinding ib = (DCIteratorBinding) bc.get(lIteratorName);
            ib.getCurrentRow().setAttribute("IsSupervised", "Y");
            ib.getCurrentRow().setAttribute("IsUnsupervised", "N");
            ib.getCurrentRow().setAttribute("UnSupervisedDate", null);
            ib.getCurrentRow().setAttribute("UnSupervisedBy", null);
            
            ob.execute();
            
            //error occurs during saving the record.
            if (!ob.getErrors().isEmpty()) {
                System.out.println("erorr while supervising");
                //FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(ob.getErrors().toString()));
                ib.getCurrentRow().refresh(Row.REFRESH_UNDO_CHANGES);
                return;
            }
            doERPShowSaveMessage("Record Supervised Successfully."); 
        }
    } 
    
    public String doErpsetFocus() {
    FacesContext facesCtx = FacesContext.getCurrentInstance();
    RowKeySet rks = getErpTable().getSelectedRowKeys();
    String inputId ="";
    if(rks != null && rks.size() > 0) {
    Object rowKey = rks.iterator().next();
    String rowId = getErpTable().getClientRowKeyManager().getClientRowKey(facesCtx, getErpTable(), rowKey);
    //inputId = getErpTable().getClientId(facesCtx) + ":" + rowId + ":" + "it10"; //here it3 is id for inputtext in1st column.
    inputId = getErpTable().getClientId(facesCtx) + ":" +  "it10"; //here it3 is id for inputtext in1st column.
    System.out.println("inputId>"+inputId);
    //System.out.println(“inputid “+inputId);
    } else {
    // handle error
    }
    ExtendedRenderKitService service = Service.getRenderKitService(facesCtx, ExtendedRenderKitService.class);
    service.addScript(facesCtx, "comp = AdfPage.PAGE.findComponent('"+inputId+"');\n" +"comp.focus()");      // javascript method is used
    return null;
    }
  
    public void doSetFocus(ActionEvent event) {
       RichLink rcb = (RichLink)event.getSource();
       String focusOn = (String)rcb.getAttributes().get("focusField");
        FacesContext fctx = FacesContext.getCurrentInstance();
           UIViewRoot viewRoot = fctx.getViewRoot();
          
        //search can be improved to include naming containers 
        RichInputText rit = (RichInputText)viewRoot.findComponent(focusOn);
       
        if (rit != null) {
           String clientId = rit.getClientId(fctx); 
           //compose JavaScript to be executed on the client 
           StringBuilder script = new StringBuilder();
           //use client id to ensure component is found if located in  //naming container  
           script.append("var textInput = ");
           //script.append("AdfPage.PAGE.findComponentByAbsoluteId");
           script.append("AdfPage.PAGE.findComponent");
               
           script.append ("('"+clientId+"');");
           script.append("if(textInput != null){"); 
           script.append("textInput.focus();");
           script.append("}");
           //invoke JavaScript  
           writeJavaScriptToClient(script.toString()); 
           }  
         
        //return null;
    }
        //generic, reusable helper method to call JavaScript on a client 
        private void writeJavaScriptToClient(String script) {
            FacesContext fctx = FacesContext.getCurrentInstance();
            ExtendedRenderKitService erks = null;
            erks = Service.getRenderKitService(
                         fctx, ExtendedRenderKitService.class);
            erks.addScript(fctx, script); 
            }
     
    public void createRecordAndSetFocus(ActionEvent ae) {
        // TODO: create the record
        /*
        OperationBinding ob = ERPGlobalsClass.doGetERPOperation("CreateInsert");
        ob.execute();
        */
        FacesContext facesContext = FacesContext.getCurrentInstance();
        String tableId = getErpTable().getClientId(facesContext);
        RowKeySet rks = getErpTable().getSelectedRowKeys();
        String inputId="";
        if(rks != null && rks.size() >0) {
            Object rowKey = rks.iterator().next();
            String rowId = getErpTable().getClientRowKeyManager().getClientRowKey(facesContext, getErpTable(), rowKey);
            inputId = tableId + ":" + rowId + ":" + "it10";
        } else {
            // handle error
        }
        
        System.out.println(inputId + "input id");
        ExtendedRenderKitService service = Service.getRenderKitService(facesContext, ExtendedRenderKitService.class);
        service.addScript(facesContext, "comp = AdfPage.PAGE.findComponent('"+inputId+"'); \n" +
        "comp.focus()");
        //AdfFacesContext.getCurrentInstance().addPartialTarget(getErpTable());
        
    }
    
    public void genericActionListener(ActionEvent actionEvent) {
            UIComponent comp = actionEvent.getComponent();
            //String actionName = (String)comp.getAttributes().get("actionName");
            System.out.println(actionEvent.getComponent()+ "actionEvent.getComponent()");
            OperationBinding ob = ERPGlobalsClass.doGetERPOperation("CreateInsert");
            if (ob != null) {  
                ob.execute();  
            }  
            
            RichTable table = this.getRichTableBinding(comp);
            if (table != null) {
                RowKeySet selection = table.getSelectedRowKeys();
                for (Object selectedRowKey : selection) {
                    String focusComponentTarget = (String)comp.getAttributes().get("focusComponentTarget");
                    
                    table.setActiveRowKey(selectedRowKey);
                    
                    FacesContext context = FacesContext.getCurrentInstance();
                    String rowId = table.getClientRowKeyManager().getClientRowKey(context, table, selectedRowKey);
                    String tableClientId = table.getClientId(context);
                    String focusId = tableClientId + ":" + rowId + ":" + focusComponentTarget;
                    
                    //LOGGER.finest("Focus ID: " + focusId);
                    System.out.println("focusId>"+focusId);
                    ExtendedRenderKitService erks = Service.getService(context.getRenderKit(), ExtendedRenderKitService.class);
                    erks.addScript(context, "setFocusByComponentId('" + focusId + "')");
                }
            }
        }
    
    private RichTable getRichTableBinding(UIComponent comp) {
        while (comp.getParent() != null) {
            comp = comp.getParent();
            if (RichPanelCollection.class.isInstance(comp)) {
                comp = comp.getChildren().get(0);
                if (RichTable.class.isInstance(comp)) {
                    return (RichTable)comp;
                }
                
                break;
            }
        }
        
        return null;
    }
   
    public void handleEnterEvent(ClientEvent actionEvent) {
        
          UIComponent comp = actionEvent.getComponent();
          //String actionName = (String)comp.getAttributes().get("actionName");
          System.out.println(actionEvent.getComponent()+ "actionEvent.getComponent()");
          OperationBinding ob = ERPGlobalsClass.doGetERPOperation("CreateInsert");
          if (ob != null) {  
              ob.execute();  
          }  
          
          RichTable table = this.getRichTableBinding(comp);
          if (table != null) {
              RowKeySet selection = table.getSelectedRowKeys();
              for (Object selectedRowKey : selection) {
                  String focusComponentTarget = (String)comp.getAttributes().get("focusComponentTarget");
                  
                  table.setActiveRowKey(selectedRowKey);
                  
                  FacesContext context = FacesContext.getCurrentInstance();
                  String rowId = table.getClientRowKeyManager().getClientRowKey(context, table, selectedRowKey);
                  String tableClientId = table.getClientId(context);
                  String focusId = tableClientId + ":" + rowId + ":" + focusComponentTarget;
                  
                  //LOGGER.finest("Focus ID: " + focusId);
                  System.out.println("focusId>"+focusId);
                  ExtendedRenderKitService erks = Service.getService(context.getRenderKit(), ExtendedRenderKitService.class);
                  erks.addScript(context, "setFocusByComponentId('" + focusId + "')");
              }
          }

      } 

    public String doERPCommitRecord() {
       OperationBinding ob=ERPGlobalsClass.doGetERPOperation("Commit");
        Object execute = ob.execute(); 
        //error occurs during saving the record.
        if (!ob.getErrors().isEmpty()) {
         // FacesContext.getCurrentInstance().addMessage(null, new FacesMessage(ob.getErrors().toString()));  
          return null;
        }
          doERPShowSaveMessage("Record Saved Successfully.");      
         return null;
    }
    
    public String doErpUndoRecord() {
        OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Rollback");
        ob.execute();
        doERPShowSaveMessage("Record Undo Successfully.");
        return null;
    }
   
   public void doERPPopupCancel(PopupCanceledEvent pce) {//using on voucher entry form
    System.out.println("i am calling popup cancel");    
       OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Rollback");
       ob.execute();
   }
   
   public String dpERPReversVoucher() {
       
           BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
           DCIteratorBinding ib = (DCIteratorBinding) bc.get("GlVoucherHeaderByVoucherIDCRUDIterator");
           ib.getCurrentRow().setAttribute("IsReversed", "Y");
           OperationBinding ob = ERPGlobalsClass.doGetERPOperation("Commit");
           ob.execute();
           if (!ob.getErrors().isEmpty()) {
            ib.getCurrentRow().setAttribute("IsReversed", "N"); 
           return null;
           }
           this.lerpReversePopupConfirm.hide(); 
           //System.out.println("erorr - 0");
           //doERPShowSaveMessage("Voucher has been Reversed Successfully."); 
           //System.out.println("erorr - 1");
           ViewObject vo= ib.getViewObject().getApplicationModule().findViewObject("GlVoucherHeaderForReverseCRUD");
           FacesMessage fm=new FacesMessage("Reversal Voucher ID : ("+vo.getCurrentRow().getAttribute("VoucherHeaderCode")+")");
           //System.out.println("erorr - 2");
           FacesContext.getCurrentInstance().addMessage(null,fm);
           
       return null; 
   }
 
 public void doErpFinanceReportAction(ValueChangeEvent pVce) {
       // System.out.println(getErpModuleAction().getValue() + " pvalue ");
        doHideComponent();
        if (("" + pVce.getNewValue()).toString().length() > 0) {
            System.out.println("select a.module_action from sys_module_detail a where a.action_type='R' and a.module_id='FMS' and a.action_name='"+pVce.getNewValue()+"'");
            BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
            DCIteratorBinding ib = (DCIteratorBinding) bc.get("GLFinancialManagementReportROIterator");
            ViewObject vo = ib.getViewObject();
            DBTransaction Erpdbt=(DBTransaction)vo.getApplicationModule().getTransaction();
            String erpActionId=ERPGlobalsClass.doExecuteSQLQuery(Erpdbt, "select a.module_action from sys_module_detail a where a.action_type='R' and a.module_id='FMS' and a.action_name='"+pVce.getNewValue()+"'");
            doShowComponent(erpActionId);
            // erpdoSetLocationsLabels();
        }
    }
   public void doERPFinanceReport(ValueChangeEvent pVCE) {
      // System.out.println(( ""+pVCE.getNewValue()).toString().length() +" new value");
      //  System.out.println("value change listner");   
            doHideComponent();
        if (( ""+pVCE.getNewValue()).toString().length()>0) {
            doShowComponent(pVCE.getNewValue().toString());
           // erpdoSetLocationsLabels();
        }
    }

    public void erpdoSetLocationsLabels() {
        //setting up the labels name of company hierarchy
        RichInputComboboxListOfValues rit;
        BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
        DCIteratorBinding ib = (DCIteratorBinding) bc.get("AdminCompanyTypeForLabelsROIterator");
        ViewObject vo = ib.getViewObject();
        vo.setOrderByClause("TYPE_LEVEL");
        vo.executeQuery();
        System.out.println(vo.getRowCount()+ "vo.getRowCount()");
        vo.setRangeSize(-1);
        for (int i = 0; i < vo.getRowCount(); i++) {
            Row r = vo.getRowAtRangeIndex(i);
            if (r.getAttribute("CompanyGroupSno").toString().equals("7")) {
                 rit =
                    (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelOneCompanyNameId");
                rit.setLabel(r.getAttribute("CompanyTypeName").toString());
                
                rit =
                   (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelOneDepartmentNameId");
                rit.setLabel(r.getAttribute("CompanyTypeName").toString());


            }
            
           else if (r.getAttribute("TypeLevel").toString().equals("2") && r.getAttribute("CompanyGroupSno").toString().equals("5")) {
                 rit =
                    (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelTwoCompanyNameId");
                rit.setLabel(r.getAttribute("CompanyTypeName").toString());

            }

                else if (r.getAttribute("TypeLevel").toString().equals("3") && r.getAttribute("CompanyGroupSno").toString().equals("5")) {
                rit  =
                     (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelThreeCompanyNameId");
                 rit.setLabel(r.getAttribute("CompanyTypeName").toString());

             }
 
                else if (r.getAttribute("TypeLevel").toString().equals("4") && r.getAttribute("CompanyGroupSno").toString().equals("5")) {
                rit  =
                     (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelFourCompanyNameId");
                 rit.setLabel(r.getAttribute("CompanyTypeName").toString());

             }
  
                else if (r.getAttribute("TypeLevel").toString().equals("5") && r.getAttribute("CompanyGroupSno").toString().equals("5")) {
                rit  =
                     (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelFiveCompanyNameId");
                 rit.setLabel(r.getAttribute("CompanyTypeName").toString());

             }

                else if (r.getAttribute("TypeLevel").toString().equals("6") && r.getAttribute("CompanyGroupSno").toString().equals("5")) {
                rit  =
                     (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelSixCompanyNameId");
                 rit.setLabel(r.getAttribute("CompanyTypeName").toString());

             }

                else if (r.getAttribute("TypeLevel").toString().equals("7") && r.getAttribute("CompanyGroupSno").toString().equals("5")) {
                rit  =
                     (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelSevenCompanyNameId");
                 rit.setLabel(r.getAttribute("CompanyTypeName").toString());

             }
            
                else if (r.getAttribute("TypeLevel").toString().equals("8") && r.getAttribute("CompanyGroupSno").toString().equals("5")) {
                rit  =
                     (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelEightCompanyNameId");
                 rit.setLabel(r.getAttribute("CompanyTypeName").toString());

             }
            
                else if (r.getAttribute("TypeLevel").toString().equals("9") && r.getAttribute("CompanyGroupSno").toString().equals("5")) {
                rit  =
                     (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelNineCompanyNameId");
                 rit.setLabel(r.getAttribute("CompanyTypeName").toString());

             }
            
                else if (r.getAttribute("TypeLevel").toString().equals("10") && r.getAttribute("CompanyGroupSno").toString().equals("5")) {
                rit  =
                     (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelTenCompanyNameId");
                 rit.setLabel(r.getAttribute("CompanyTypeName").toString());

             }
            
            else if (r.getAttribute("TypeLevel").toString().equals("2") && r.getAttribute("CompanyGroupSno").toString().equals("6")) {
            rit  =
                 (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelTwoDepartmenNameId");
             rit.setLabel(r.getAttribute("CompanyTypeName").toString());

            }

            else if (r.getAttribute("TypeLevel").toString().equals("3") && r.getAttribute("CompanyGroupSno").toString().equals("6")) {
            rit  =
                 (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelThreeDepartmentNameId");
             rit.setLabel(r.getAttribute("CompanyTypeName").toString());

            }
            

            else if (r.getAttribute("TypeLevel").toString().equals("4") && r.getAttribute("CompanyGroupSno").toString().equals("6")) {
            rit  =
                 (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelFourDepartmentNameId");
             rit.setLabel(r.getAttribute("CompanyTypeName").toString());

            }  

            else if (r.getAttribute("TypeLevel").toString().equals("5") && r.getAttribute("CompanyGroupSno").toString().equals("6")) {
            rit  =
                 (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelFiveDepartmentNameId");
             rit.setLabel(r.getAttribute("CompanyTypeName").toString());

            }  
            
            else if (r.getAttribute("TypeLevel").toString().equals("6") && r.getAttribute("CompanyGroupSno").toString().equals("6")) {
            rit  =
                 (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelSixDepartmentNameId");
             rit.setLabel(r.getAttribute("CompanyTypeName").toString());

            } 
            
            
            else if (r.getAttribute("TypeLevel").toString().equals("7") && r.getAttribute("CompanyGroupSno").toString().equals("6")) {
            rit  =
                 (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelSevenDepartmentNameId");
             rit.setLabel(r.getAttribute("CompanyTypeName").toString());

            } 

            else if (r.getAttribute("TypeLevel").toString().equals("8") && r.getAttribute("CompanyGroupSno").toString().equals("6")) {
            rit  =
                 (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelEightDepartmentNameId");
             rit.setLabel(r.getAttribute("CompanyTypeName").toString());

            } 

            else if (r.getAttribute("TypeLevel").toString().equals("9") && r.getAttribute("CompanyGroupSno").toString().equals("6")) {
            rit  =
                 (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelNineDepartmentNameId");
             rit.setLabel(r.getAttribute("CompanyTypeName").toString());

            } 

            else if (r.getAttribute("TypeLevel").toString().equals("10") && r.getAttribute("CompanyGroupSno").toString().equals("6")) {
            rit  =
                 (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLevelTenDepartmentNameId");
             rit.setLabel(r.getAttribute("CompanyTypeName").toString());

            } 
            
            if (r.getAttribute("TypeLevel").toString().equals(getErpMaxOrgLevel().getValue().toString()) && r.getAttribute("CompanyGroupSno").toString().equals("5")) {
               rit  =
                    (RichInputComboboxListOfValues) getErpReportBoxForm().findComponent("txtLocationNameId");
                rit.setLabel(r.getAttribute("CompanyTypeName").toString());

           }
            
        }
    }
     
       
    
    public void doHideComponent() {
        BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
        DCIteratorBinding ib = (DCIteratorBinding) bc.get("AdminUiComponentHideROIterator");
        ViewObject vo=ib.getViewObject();
        vo.executeQuery();
        vo.setRangeSize(-1);
        Row r=null;
        for (int i = 0; i < vo.getRowCount(); i++) {
        try
        {
         r =vo.getRowAtRangeIndex(i);
           if (r.getAttribute("UiComponentType").toString().equals("TEXT")) {
               RichInputText rit=(RichInputText) getErpReportBoxForm().findComponent(r.getAttribute("UiComponentName").toString());
               rit.setVisible(false);
            }
            else
            if (r.getAttribute("UiComponentType").toString().equals("CHOIC")) {
                 //System.out.println("b");  
                RichSelectOneChoice rit=(RichSelectOneChoice) getErpReportBoxForm().findComponent(r.getAttribute("UiComponentName").toString());
                if (r.getAttribute("UiComponentName").toString().equals("soc2")) {
                     setErpShowCompany("N");
                     
                }
                else
                {rit.setVisible(false);}
                // System.out.println("b-");   
             }
            else
            if (r.getAttribute("UiComponentType").toString().equals("COMBO")) {
                // System.out.println("c" + r.getAttribute("UiComponentName"));
                RichInputComboboxListOfValues rit=(RichInputComboboxListOfValues) getErpReportBoxForm().findComponent(r.getAttribute("UiComponentName").toString());
                rit.setVisible(false);
                // System.out.println("c-");
             } 

            else
            if (r.getAttribute("UiComponentType").toString().equals("DATE")) {
               //  System.out.println("d");
                RichInputDate rit=(RichInputDate) getErpReportBoxForm().findComponent(r.getAttribute("UiComponentName").toString());
                rit.setVisible(false);
                /// System.out.println("d-");
             }   

            else
            if (r.getAttribute("UiComponentType").toString().equals("LOV")) {
                 //System.out.println("e");
                RichInputListOfValues rit=(RichInputListOfValues) getErpReportBoxForm().findComponent(r.getAttribute("UiComponentName").toString());
                rit.setVisible(false);
                // System.out.println("e-");
             }
            else
            if (r.getAttribute("UiComponentType").toString().equals("RUNTM")) {
                 UIComponent uic=getErpReportForm().findComponent(r.getAttribute("UiComponentName").toString());
                 if (uic!=null) {
                   RichInputText rit=(RichInputText) getErpReportForm().findComponent(r.getAttribute("UiComponentName").toString());
                    List<UIComponent> children = getErpReportForm().getChildren();
                    System.out.println("this is index of text"+children.indexOf(rit));
                    children.remove(children.indexOf(rit));
                }       
            }
        }
            catch(Exception exc) {
            ERPGlobalsClass.doShowERPMessage("Error While Hiding Component:("+r.getAttribute("UiComponentName")+")"+exc.getMessage(), FacesMessage.SEVERITY_ERROR); 
                        
        }
        }//FOR LOOP
       // RichInputText rrr=new RichInputText();
        //getErpReportForm().getChildren().add(rrr);
    }   
   public String doShowComponent(String pModuleAction) {
       BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
       DCIteratorBinding ib = (DCIteratorBinding) bc.get("AdminReportParameterByReportROIterator");
       ViewObject vo=ib.getViewObject();
       vo.setNamedWhereClauseParam("P_ADF_MODULE_ACTION", pModuleAction);
       vo.setNamedWhereClauseParam("P_ADF_MODULE_ID", "FMS");
       getErpReportHeaderSno().setValue( vo.first().getAttribute("ReportHeaderSno") );
       vo.executeQuery();
       vo.setRangeSize(-1);
       Row r=null;
       for (int i = 0; i < vo.getRowCount(); i++) {
    try { 
        r=vo.getRowAtRangeIndex(i);
          if (r.getAttribute("txtUiComponentType").toString().equals("TEXT")) {
              RichInputText rit=(RichInputText) getErpReportBoxForm().findComponent(r.getAttribute("txtUiComponentName").toString());
               rit.setLabel(r.getAttribute("txtUiComponentLabel").toString());
              rit.setVisible(true);
           }
           else
           if (r.getAttribute("txtUiComponentType").toString().equals("CHOIC")) {
               RichSelectOneChoice rit=(RichSelectOneChoice) getErpReportBoxForm().findComponent(r.getAttribute("txtUiComponentName").toString());
               if (r.getAttribute("txtUiComponentName").toString().equals("soc2")) {
                   rit.setLabel(r.getAttribute("txtUiComponentLabel").toString());
                    setErpShowCompany("Y");
                    
               }
               else
               {rit.setVisible(true);}
               
            }
           else
           if (r.getAttribute("txtUiComponentType").toString().equals("COMBO")) {
               RichInputComboboxListOfValues rit=(RichInputComboboxListOfValues) getErpReportBoxForm().findComponent(r.getAttribute("txtUiComponentName").toString());
                rit.setLabel(r.getAttribute("txtUiComponentLabel").toString());
               rit.setVisible(true);
               
            } 

           else
           if (r.getAttribute("txtUiComponentType").toString().equals("DATE")) {
               RichInputDate rit=(RichInputDate) getErpReportBoxForm().findComponent(r.getAttribute("txtUiComponentName").toString());
                rit.setLabel(r.getAttribute("txtUiComponentLabel").toString());
               rit.setVisible(true);
            }   

           else
           if (r.getAttribute("txtUiComponentType").toString().equals("LOV")) {
               RichInputListOfValues rit=(RichInputListOfValues) getErpReportBoxForm().findComponent(r.getAttribute("txtUiComponentName").toString());
               rit.setLabel(r.getAttribute("txtUiComponentLabel").toString());
               rit.setVisible(true);
            }
           else
           if (r.getAttribute("txtUiComponentType").toString().equals("RUNTM")) {
                UIComponent uic=getErpReportForm().findComponent(r.getAttribute("txtUiComponentName").toString());
                System.out.println(uic==null);
                    
                System.out.println("mull comp");
                RichInputText erpNewText=new RichInputText();
                erpNewText.setId(r.getAttribute("txtUiComponentName").toString());
                erpNewText.setLabel(r.getAttribute("txtUiComponentLabel").toString());
                getErpReportForm().getChildren().add(erpNewText);     
                
                }
    }
           catch(Exception exc) {
            ERPGlobalsClass.doShowERPMessage("Error While Showing Component:("+r.getAttribute("txtUiComponentName")+")"+exc.getMessage(), FacesMessage.SEVERITY_ERROR); 
            return null;
    }
           }//for i loop
       
             return null;
   }


    public String doErpExecuteReport() {
        RichInputText erprit;
        RichInputDate erpriD;
        RichInputComboboxListOfValues erpcomb;
        RichSelectOneChoice erpchoice;

        erprit  = (RichInputText)getErpReportBoxForm().findComponent("it35");
        String strGlobHierarchy=erprit.getValue()==null?"":""+erprit.getValue();
        System.out.println(erprit.getValue()+ " this is get value");
        erprit  = (RichInputText)getErpReportBoxForm().findComponent("it37");
        String strOrgHierarchy=erprit.getValue()==null?"":""+erprit.getValue();
        
        erprit  = (RichInputText)getErpReportBoxForm().findComponent("it38");
        String strGlobTypeHierarchy=erprit.getValue()==null?"":""+erprit.getValue();
        erprit  = (RichInputText)getErpReportBoxForm().findComponent("it39");
        String strOrgTypeHierarchy=erprit.getValue()==null?"":""+erprit.getValue();

        erprit  = (RichInputText)getErpReportBoxForm().findComponent("it44");
        String strFromCOAHierarchy=erprit.getValue()==null?"":""+erprit.getValue();
        erprit  = (RichInputText)getErpReportBoxForm().findComponent("it46");
        String strToCOAHierarchy=erprit.getValue()==null?"":""+erprit.getValue();
        
        String insertColumns =
            "insert into admin_report_run_parameter(report_id,global_type_hierarchy_path,org_type_hierarchy_path,global_hierarchy_path,org_hierarchy_path,from_coa_hierarchy_path,to_coa_hierarchy_path ";
        String insertValues = "values("+getErpReportHeaderSno().getValue()+",'"+strGlobTypeHierarchy+"','"+strOrgTypeHierarchy+"','"+strGlobHierarchy+"','"+strOrgHierarchy+"','"+strFromCOAHierarchy+"','"+strToCOAHierarchy+"'";
    
        BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
        DCIteratorBinding ib = (DCIteratorBinding) bc.get("AdminReportParameterByReportROIterator");
        ViewObject vo = ib.getViewObject();
        DBTransaction pDBT=(DBTransaction)vo.getApplicationModule().getTransaction();
        vo.executeQuery();
        vo.setRangeSize(-1);
        for (int i = 0; i < vo.getRowCount(); i++) {
           
            Row r = vo.getRowAtRangeIndex(i);


            UIComponent uic = getErpReportBoxForm().findComponent(r.getAttribute("txtUiComponentIdField").toString());
            
            if (uic instanceof RichInputText) {
                erprit = (RichInputText) uic;
                insertValues = insertValues+","+(erprit.getValue()==null?"null":erprit.getValue());    
            } else if (uic instanceof RichInputComboboxListOfValues) {
                erpcomb = (RichInputComboboxListOfValues) uic;
                insertValues = insertValues+","+(erpcomb.getValue()==null?"null":erpcomb.getValue());    
            } else if (uic instanceof RichSelectOneChoice) {
                erpchoice = (RichSelectOneChoice) uic;
                insertValues = insertValues+","+(erpchoice.getValue()==null?"null":erpchoice.getValue());    
            }
             else if (uic instanceof RichInputDate) {
                erpriD = (RichInputDate) uic;
                String erpDate=(erpriD.getValue()==null?"null":""+erpriD.getValue());
                //System.out.println("this is date:"+erpDate.length());
                
                if (erpDate.length()>0) {
                    SimpleDateFormat sdfDate=new SimpleDateFormat("yyyy-MM-dd");
                    SimpleDateFormat sdfString;
                    if (ERPGlobalPLSQLClass.doErpGetConnTypeModel((DBTransaction)vo.getApplicationModule().getTransaction()).equals("ERPORACLE") ) {
                      sdfString =new SimpleDateFormat("dd-MMM-yyyy");
                   }
                    else {
                      sdfString =new SimpleDateFormat("yyyy-MM-dd");  
                    }
                    try {
                      erpDate="'"+sdfString.format(sdfDate.parse(erpDate)).toUpperCase()+"'";
                    } catch (ParseException e) {
                        erpDate="null";
                    }
                    catch (NullPointerException npe) {
                        erpDate="null";
                    }
                }
                
        insertValues = insertValues+","+erpDate;    
            }            
        insertColumns = insertColumns +","+r.getAttribute("txtFieldName");
         
         }
        insertColumns=insertColumns+")";
        insertValues=insertValues+")";
        
        System.out.println(insertColumns);
        System.out.println(insertValues);
        
        //DBTransaction erpDBT=(DBTransaction)vo.getApplicationModule().getTransaction();
        String erpRunReportSno="";
        if (ERPGlobalPLSQLClass.doErpGetConnTypeModel(pDBT).equals("ERPMYSQL") ) {
           ERPGlobalPLSQLClass.doErpExecutePLSQLModel(pDBT, insertColumns +" "+insertValues , "Y");
         PreparedStatement    erpps= pDBT.createPreparedStatement("select last_insert_id()", 1);
            try {
                erpps.executeQuery();
                ResultSet erprs=erpps.getResultSet();
                erprs.next();
                erpRunReportSno = erprs.getString(1);
              //  System.out.println(erpRunReportSno + " <<<this is last inserted id");
                
            } catch (SQLException e) {
                ERPGlobalsClass.doShowERPMessage("Error While Executing Report:"+e.getMessage(), FacesMessage.SEVERITY_ERROR);
                return null;
            }
         //erpRunReportSno=ERPGlobalPLSQLClass.doExecuteSQLQueryModel(erpDBT, "select last_insert_id() as c1 from dual");
           
         }   
           else {
            CallableStatement   erpcs= pDBT.createCallableStatement("declare l_sequence number(10); begin l_sequence:=seq_admin_report_run_parameter.nextval;"+insertColumns.replace("(report_id,", "(report_run_parameter_sno,report_id,") +" "+insertValues.replace("values(", "values(l_sequence,")+"; ?:=l_sequence; commit; end;", 1);
            try {
                System.out.println("declare l_sequence number(10); begin l_sequence:=seq_admin_report_run_parameter.nextval;"+insertColumns.replace("(report_id,", "(report_run_parametrer_sno,report_id,") +" "+insertValues.replace("values(", "values(l_sequence,")+"; ?:=l_sequence; end;");
                erpcs.registerOutParameter(1, Types.VARCHAR);
                erpcs.executeUpdate();
               erpRunReportSno= erpcs.getString(1);
                System.out.println(erpRunReportSno + " <<<this is last inserted id");
                
            } catch (SQLException e) {
                ERPGlobalsClass.doShowERPMessage("Error While Executing Report:"+e.getMessage(), FacesMessage.SEVERITY_ERROR);
                return null;
                
            }
            finally{
                try {
                    erpcs.close();
                } catch (SQLException e) {
                }
            }
    
           }
        
        String pUrl=ERPGlobalPLSQLClass.doExecuteSQLQueryModel(pDBT, "select value_description from sys_general_value v where v.value_set_id=8");
        ERPGlobalsClass.ErpdoOpenUrl(pUrl.replace("<P_REPORT_NAME>", ""+getErpReportName().getValue()).replace("<P_REPORT_RUN_SNO>", erpRunReportSno)  );
        
        return null;
    }
    
 
 /*voucher upload*/
 public void doErpVoucherUpload(ValueChangeEvent valueChangeEvent) {
             UploadedFile file = (UploadedFile) valueChangeEvent.getNewValue();

             try {
                 //Check if file is XLSX
                 if (file.getContentType().equalsIgnoreCase("application/vnd.openxmlformats-officedocument.spreadsheetml.sheet") ||
                     file.getContentType().equalsIgnoreCase("application/xlsx")) {

                     doERPreadNProcessExcelx(file.getInputStream()); //for xlsx

                 }
                 //Check if file is XLS
                 else if (file.getContentType().equalsIgnoreCase("application/vnd.ms-excel")) {

                     if (file.getFilename().toUpperCase().endsWith(".XLS")) {
                         //readNProcessExcel(file.getInputStream()); //for xls
                     }

                 } else {
                     FacesMessage msg = new FacesMessage("File format not supported.-- Upload XLS or XLSX file");
                     msg.setSeverity(FacesMessage.SEVERITY_WARN);
                     FacesContext.getCurrentInstance().addMessage(null, msg);
                 }
                // AdfFacesContext.getCurrentInstance().addPartialTarget(getT1());

             } catch (Exception e) {
                 // TODO
             }
            // getIf4().resetValue();

             
         }
   
    public void doERPreadNProcessExcelx(InputStream pXlsx) throws IOException {
            
            DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
            DCIteratorBinding iter = bc.findIteratorBinding("GlVoucherLinesDETCRUDIterator");
           
            while(iter.getViewObject().getRowCount()>0) {
                iter.getViewObject().first().remove();
            }
            //Integer erpCompany=iter
            //Use XSSFWorkbook for XLS file
            XSSFWorkbook WorkBook = null;
            int sheetIndex = 0;

            try {
                WorkBook = new XSSFWorkbook(pXlsx);
            } catch (IOException e) {

            }
            XSSFSheet sheet = WorkBook.getSheetAt(sheetIndex);

            Integer skipRw = 1;
            Integer skipcnt = 1;
            erpbulkVoucher =new ArrayList();
            //Iterate over excel rows
            for (org.apache.poi.ss.usermodel.Row tempRow : sheet) {

                if (skipcnt > skipRw) { //skip first n row for labels.
                    //Create new row in table

                    //Get current row from iterator
                    int Index = 0;
                    ErpVoucherUoload ErpBulkupload=new ErpVoucherUoload();
                    //Iterate over row's columns
                    for (int column = 0; column < tempRow.getPhysicalNumberOfCells(); column++) {
                        
                        Cell MytempCell = tempRow.getCell(column);
                        if (MytempCell != null) {
                            Index = MytempCell.getColumnIndex();
                        } else {
                            Index++;
                        }
                    if (Index == 0) {
                        try {
                            ErpBulkupload.ErpCoaAccountno = MytempCell.getStringCellValue();
                        } catch (NullPointerException e) {
                            // TODO: Add catch code
                            ERPGlobalsClass.doShowERPMessage("Account Code should not be null at line " + skipcnt,
                                                             FacesMessage.SEVERITY_ERROR);
                            e.printStackTrace();
                            return;
                        }
                        //row.setAttribute("ClearDate", jboDate);
                    }
                    else if (Index == 1) {
                        try {
                            ErpBulkupload.Erpdepartmentid = MytempCell.getNumericCellValue();
                        } catch (Exception e) {
                            // TODO: Add catch code
                            ERPGlobalsClass.doShowERPMessage("Department Code should not be null  at line " + skipcnt,
                                                             FacesMessage.SEVERITY_ERROR);
                            //doShowMessage("Debit Amount should not be null  at line "+skipcnt);
                            e.printStackTrace();
                            return;

                        }
                    } else if (Index == 2) {
                        try {
                            ErpBulkupload.ErppProjectId = MytempCell.getNumericCellValue();
                        } catch (Exception e) {
                            // TODO: Add catch code
                            ERPGlobalsClass.doShowERPMessage("Project Code should not be null  at line " + skipcnt,
                                                             FacesMessage.SEVERITY_ERROR);
                            //doShowMessage("Debit Amount should not be null  at line "+skipcnt);
                            e.printStackTrace();
                            return;

                        }
                    } 
                        else if (Index == 3) {
                        try {
                            ErpBulkupload.ErpChequeNo = MytempCell.getStringCellValue();
                        } catch (Exception e) {
                            // TODO: Add catch code
                            ERPGlobalsClass.doShowERPMessage("Cheque No should not be null  at line " + skipcnt,
                                                             FacesMessage.SEVERITY_ERROR);
                            e.printStackTrace();
                            return;

                        }
                    } else if (Index == 4) {
                        try {
                            ErpBulkupload.ErpChequeDate = MytempCell.getStringCellValue();
                        } catch (Exception e) {
                            // TODO: Add catch code
                            ERPGlobalsClass.doShowERPMessage("Cheque Date should not be null  at line " + skipcnt,
                                                             FacesMessage.SEVERITY_ERROR);
                            //doShowMessage("Debit Amount should not be null  at line "+skipcnt);
                            e.printStackTrace();
                            return;
                        }
                    }
                        else if (Index == 5) {
                        try {
                            ErpBulkupload.ErpQuantity = MytempCell.getNumericCellValue();
                        } catch (Exception e) {
                            // TODO: Add catch code
                            ERPGlobalsClass.doShowERPMessage("Quantity should not be null  at line " + skipcnt,
                                                             FacesMessage.SEVERITY_ERROR);
                            //doShowMessage("Debit Amount should not be null  at line "+skipcnt);
                            e.printStackTrace();
                            return;

                        }
                    }
                            else if (Index == 6) {
                        try {
                            ErpBulkupload.Erpdebit = MytempCell.getNumericCellValue();
                        } catch (Exception e) {
                            // TODO: Add catch code
                            ERPGlobalsClass.doShowERPMessage("Debit Amount should not be null  at line " + skipcnt,
                                                             FacesMessage.SEVERITY_ERROR);
                            //doShowMessage("Debit Amount should not be null  at line "+skipcnt);
                            e.printStackTrace();
                            return;

                        }
                    } else if (Index == 7) {
                        try {
                            ErpBulkupload.Erpcredit = MytempCell.getNumericCellValue();

                        } catch (Exception e) {
                            // TODO: Add catch code
                            e.printStackTrace();
                            ERPGlobalsClass.doShowERPMessage("Credit Amount should not be null  at line " + skipcnt,
                                                             FacesMessage.SEVERITY_ERROR);
                            return;
                        }

                    } else if (Index == 8) {
                        try {
                            ErpBulkupload.Erpnarration = MytempCell.getStringCellValue();
                        } catch (Exception e) {
                            e.printStackTrace();
                            ERPGlobalsClass.doShowERPMessage("Narration should not be null  at line " + skipcnt,
                                                             FacesMessage.SEVERITY_ERROR);
                            return;
                        }
                    }                     
                    }
                    erpbulkVoucher.add(ErpBulkupload);
                    //iter.getViewObject().insertRow(row);
                }
                skipcnt++;
            }
            //Acess the ADF iterator binding that is used with ADF table binding
            doErpValidateAndUpload(erpbulkVoucher);
        }
    
    public void doErpValidateAndUpload(List pErpBulkVoucher)    {
        DCBindingContainer bc=(DCBindingContainer)BindingContext.getCurrent().getCurrentBindingsEntry();
        DCIteratorBinding iter = bc.findIteratorBinding("GlVoucherLinesDETCRUDIterator");
        ApplicationModule am=iter.getViewObject().getApplicationModule();
        DCIteratorBinding iterHead = bc.findIteratorBinding("GlVoucherHeaderByVoucherIDCRUDIterator");
        Integer erpCompanyId=(Integer)iterHead.getCurrentRow().getAttribute("CompanyId");

        
        ViewObject vo=null;
        Integer debit=0;
        Integer credit=0;
        Integer projectid=null;
        Integer departmentid=null;
        Integer quantity=null;
        String  chequeno="";
        Timestamp  chequeDate=null;
        String narration="";
        Integer erpCoaId=0;
        
        
        
        for (int i = 0; i < pErpBulkVoucher.size(); i++) {
            ///creating for validating account code
                ErpVoucherUoload vupload=(ErpVoucherUoload)pErpBulkVoucher.get(i);
                vo=am.findViewObject("validateAccount");
              
                if (vo!=null) {
                   vo.remove();
                }
                vo=am.createViewObjectFromQueryStmt("validateAccount", "select chart_of_account_id val from GL_CHART_OF_ACCOUNTS v where v.level_no=(select max(c.level_no) from gl_chart_of_accounts c where c.company_id="+erpCompanyId+") and chart_of_account_code='"+vupload.ErpCoaAccountno+"' and company_id="+erpCompanyId);
                vo.executeQuery();
                
                if (vo.getRowCount()==0) {
                   ERPGlobalsClass.doShowERPMessage("Account Code should be of last level("+vupload.ErpCoaAccountno+")",FacesMessage.SEVERITY_ERROR);
                   return;
               }
                else {
                    erpCoaId= Integer.parseInt(vo.first().getAttribute(0).toString());
                }
            //checking project id
            if (vupload.ErppProjectId.intValue()>0) {
                if (vo != null) {
                    vo.remove();
                }
                vo =
                    am.createViewObjectFromQueryStmt("validateAccount",
                                                     "select project_sno val from gl_projects v  where v.project_code=" +
                                                     vupload.ErppProjectId.intValue() + " and company_id=" + erpCompanyId);
                vo.executeQuery();

                if (vo.getRowCount() == 0) {
                    ERPGlobalsClass.doShowERPMessage("Project Code Does Not Exist In This Company.(" +
                                                     vupload.ErppProjectId.intValue() + ")", FacesMessage.SEVERITY_ERROR);
                    return;
                } 
            }
            //checking department id

            if (vupload.Erpdepartmentid.intValue()>0) {
                if (vo != null) {
                    vo.remove();
                }
                vo =
                am.createViewObjectFromQueryStmt("validateAccount",
                                                     "select department_id val from temp_admin_department_access v,admin_company com  where com.comp_code=v.department_id and com.company_short_code=" +
                                                     vupload.Erpdepartmentid+ " and company_id=" + erpCompanyId);
                vo.executeQuery();

                if (vo.getRowCount() == 0) {
                    ERPGlobalsClass.doShowERPMessage("Department Code Does Not Exist In This Company.(" +
                                                     vupload.Erpdepartmentid.intValue() + ")", FacesMessage.SEVERITY_ERROR);
                    return;
                } 
            }            
            
               debit=debit+vupload.Erpdebit.intValue();
               credit=credit+vupload.Erpcredit.intValue();        
        }
        if (!debit.equals(credit)) {
            ERPGlobalsClass.doShowERPMessage("Debit and Credit are not equals Debit:"+debit+", Credit:"+credit+",Difference:"+(debit-credit),FacesMessage.SEVERITY_ERROR);
            //doShowMessage("Debit and Credit are not equals Debit:"+debit+", Credit:"+credit+",Difference:"+(debit-credit));
            return;
        }
        ViewObject vodet=iter.getViewObject();
        for (int i = 0; i < pErpBulkVoucher.size(); i++) {
            ErpVoucherUoload mu=(ErpVoucherUoload)pErpBulkVoucher.get(i);
            
            //projectid=(mu.ErppProjectId.intValue()==0?null:mu.ErppProjectId.intValue());
            //departmentid=(mu.Erpdepartmentid.intValue()==0?null:mu.Erpdepartmentid.intValue());
            quantity=(mu.ErpQuantity.intValue()==0?null:mu.ErpQuantity.intValue());
            chequeno=(mu.ErpChequeNo.equals("-")?null:mu.ErpChequeNo);
            if (!mu.ErpChequeDate.equals("-")) {
                SimpleDateFormat sdf=new SimpleDateFormat("dd-MMM-yyyy");
                try {
                    java.util.Date jdate = sdf.parse(mu.ErpChequeDate);
                    chequeDate=new java.sql.Timestamp(jdate.getTime());
                    //ChequeDate = mu.ErpChequeDate;
                } catch (ParseException pe) {
                    // TODO: Add catch code
                    pe.printStackTrace();
                }
            }
            
            if (vo!=null) {
                vo.remove();
           }
             vo=am.createViewObjectFromQueryStmt("validateAccount", "select chart_of_account_id val from GL_CHART_OF_ACCOUNTS v where chart_of_account_code='"+mu.ErpCoaAccountno+"'");
             vo.executeQuery();
             erpCoaId= Integer.parseInt(vo.first().getAttribute(0).toString());
                
            //checking project id
            if (mu.ErppProjectId.intValue()>0) {
                if (vo != null) {
                    vo.remove();
                }
                vo =
                    am.createViewObjectFromQueryStmt("validateAccount",
                                                     "select project_sno val from gl_projects v  where v.project_code=" +
                                                     mu.ErppProjectId.intValue() + " and company_id=" + erpCompanyId);
                    vo.executeQuery();
                    projectid = Integer.parseInt(vo.first().getAttribute(0).toString());
            }
            
        //PROJECT ID
         
        //checking project id
        if (mu.Erpdepartmentid.intValue()>0) {
            if (vo != null) {
                vo.remove();
            }
            vo =
            am.createViewObjectFromQueryStmt("validateAccount",
                                                 "select department_id val from temp_admin_department_access v,admin_company com  where com.comp_code=v.department_id and com.company_short_code=" +
                                                 mu.Erpdepartmentid+ " and company_id=" + erpCompanyId);
            vo.executeQuery();
            departmentid = Integer.parseInt(vo.first().getAttribute(0).toString());
        }
                            
            debit=mu.Erpdebit.intValue();
            credit=mu.Erpcredit.intValue();
            if (debit.equals(0)) {
                    debit=null;
              }
            else {
                credit=null;
            }
            System.out.println("going to insert record");
            oracle.jbo.Row vrow=vodet.createRow();
            vrow.setAttribute("Debit", debit);
            vrow.setAttribute("Credit", credit);
            vrow.setAttribute("ChartOfAccountId", erpCoaId);
            vrow.setAttribute("Naration", mu.Erpnarration);
            if (projectid!=null) {
                vrow.setAttribute("ProjectSno", projectid);

            }
            if (departmentid!=null) {
                vrow.setAttribute("DepartmentId", new BigDecimal(departmentid));
            }
            vrow.setAttribute("Quantity",quantity);
            vrow.setAttribute("ChequeNo",chequeno);
            vrow.setAttribute("ChequeDate",chequeDate);
            projectid=null;
            departmentid=null;
            chequeDate=null;
            vodet.insertRow(vrow);
        }
        vodet.executeQuery();
    }
    public void handleEvent(ClientEvent clientEvent) {
        //UIComponent form = clientEvent.getComponent().getChildren().get(1);
        //form=form.getChildren().get(0);
        AdfFacesContext afContext = AdfFacesContext.getCurrentInstance();
        String screen = clientEvent.getParameters().get("screenSize").toString();
        ADFContext.getCurrent().getSessionScope().put("screenSize", screen);
       
      setErpScreenSize(screen);
      
        System.out.println("this is java script"+ screen);
            System.out.println("setScreenSize"+ getErpScreenSize());
       // afContext.addPartialTarget(getRit());  
        //System.out.println(form.getId() +" get form id");
        } 
 
    public String doExecuteFinanceReport() {
        BindingContainer bc = ERPGlobalsClass.doGetERPBindings();
        DCIteratorBinding ib = (DCIteratorBinding) bc.get(lIteratorName);
        DBTransaction Erpdbt=(DBTransaction)ib.getViewObject().getApplicationModule().getTransaction();
        String pUrl=ERPGlobalPLSQLClass.doExecuteSQLQueryModel(Erpdbt, "select value_description from sys_general_value v where v.value_set_id=8");
        ERPGlobalsClass.ErpdoOpenUrl(pUrl.replace("<P_REPORT_NAME>", ""+getERPFinanceReportName()).replace("<P_REPORT_RUN_SNO>", ( getERPPKForReport()==null?"":"P_REPORT_RUN_SNO="+getERPPKForReport()) )  );
        return null;   
    }   
}
