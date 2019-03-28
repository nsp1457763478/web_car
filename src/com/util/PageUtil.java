package com.util;

import com.entity.PageBean;
import com.entity.PageBean;

/**
 * @autor : WL;
 * @date : 2019/3/18 0018
 */
public class PageUtil {
    public static String getPager(int typeId , PageBean pageBean){
        StringBuffer sb= new StringBuffer("<ul class=\"pager\">");

        int pageIndex = pageBean.getPageIndex();
        int pages = pageBean.getPages();

        if(pageIndex<=1){
            sb.append("<li><a  disabled=\"disabled\" >上一页</a></li>");
        }else {
            sb.append("<li><a href=\"NewsServlet?action=query&typeId="+typeId+"&pageIndex="+(pageIndex-1)+"\">上一页</a></li>");
        }
        sb.append("&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;");
        if(pageIndex>=pages){
            sb.append("<li><a  disabled=\"disabled\" >下一页</a></li>");
        }else{
            sb.append("<li><a href=\"NewsServlet?action=query&typeId="+typeId+"&pageIndex="+(pageIndex+1)+"\">下一页</a></li>");
        }
        sb.append("</ul>");
        return sb.toString();
    }
}
