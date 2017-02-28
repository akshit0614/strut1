/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author mca1
 */
public class upd extends org.apache.struts.action.Action {

    /* forward name="success" path="" */
    private static final String SUCCESS = "success";

    /**
     * This is the action called from the Struts framework.
     *
     * @param mapping The ActionMapping used to select this instance.
     * @param form The optional ActionForm bean for this request.
     * @param request The HTTP Request we are processing.
     * @param response The HTTP Response we are processing.
     * @throws java.lang.Exception
     * @return
     */
    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form,
            HttpServletRequest request, HttpServletResponse response)
            throws Exception { NewStrutsActionForm obj=(NewStrutsActionForm)form;
        
        int eid,b_sal;
        String fname,lname;
        eid=obj.getEid();
        b_sal=obj.getB_sal();
        fname=obj.getFname();
        lname=obj.getLname();
        try
        {
         Class.forName("com.mysql.jdbc.Driver");
         Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/struts","root","");
         PreparedStatement st=con.prepareStatement("update emp set fname=?,lname=?,b_sal=? where e_id=?");
         st.setInt(4, eid);
         st.setInt(3, b_sal);
         st.setString(1, fname);
         st.setString(2, lname);
         if(eid !=0 &&b_sal !=0 && fname.length()!=0 && lname.length()!=0)
         {
          int n=st.executeUpdate();
                 if(n>0)
                 {
                  request.setAttribute("msg", "Successfully updated");
                  return mapping.findForward("ok");
                 }
         }
        }catch(Exception e)
        {
         request.setAttribute("errmsg", e.getMessage());
         return mapping.findForward("Wrong");
        }
        return mapping.findForward(SUCCESS);
    }
}
