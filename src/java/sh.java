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
        int id,bsal;
        String fname,lname,s1,s2;
        PreparedStatement preparedStatement;
        ResultSet rs;
        int count = 0;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/struts","root","");
            Statement st = con.createStatement();
            String sql = "select * from emp";
            preparedStatement = con.prepareStatement(sql);
            rs = preparedStatement.executeQuery();
            String forward = "<table>\n" +
            "<tr>\n" +
            "<th class='id'>Id</th>\n" +
            "<th class='name'>First name</th>\n" +
            "<th class='rollno'>Last name</th>\n" +
            "<th class='course'>Basic salary</th>\n" +
            "</tr>";
            while(rs.next()) {
                id = rs.getInt("e_id"); 
                fname = rs.getString("fname"); 
                lname = rs.getString("lname"); 
                bsal = rs.getInt("b_sal"); 
                s1=Integer.toString(id);
                s2=Integer.toString(bsal);
                count++;
                forward += "<tr align=center>\n" +
                "<td>"+s1+"</td>\n" +
                "<td>"+fname+"</td>\n" +
                "<td>"+lname+"</td>\n" +
                "<td>"+s2+"</td>\n" +
                "</tr>";
            }
            forward += "</table>";
            if(count > 0) {
                request.setAttribute("test", rs);
                request.setAttribute("msg", forward);
                return mapping.findForward("ok");
            } else {
                request.setAttribute("msg", "Fail to Update");
                return mapping.findForward("Wrong");
            }
        } catch (Exception e) {
            request.setAttribute("errmsg",e.getMessage());
            return mapping.findForward("Wrong");
        }
    }
}
