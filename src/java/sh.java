/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author mca1
 */
public class sh extends org.apache.struts.action.Action {

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
            throws Exception {
        NewStrutsActionForm obj=(NewStrutsActionForm)form;
        
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
            Statement st=con.createStatement();
     
         
         if(eid !=0)
         {
             ResultSet rs=st.executeQuery("select * from emp");
                 while(rs.next())
                 {
                  request.setAttribute("msg", "Successfully Deleted");
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
