package util;

import dataAccessLayer.Customer;
import dataAccessLayer.LegalCustomer;

/**
 * Created by Dotin school 6 on 8/10/2016.
 */
public class OutPutGenerator {
    public static String generate(LegalCustomer legalCustomer , Customer customer){
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<!DOCTYPE html>");
        stringBuilder.append("<html>");
        stringBuilder.append("<head lang=fa>");
        stringBuilder.append("    <meta charset=UTF-8>");
        stringBuilder.append("    <link href=style/Style.css rel=stylesheet>");
        stringBuilder.append("    <title>ثبت مشتری حقوقی</title>");
        stringBuilder.append("<body>");
        stringBuilder.append("<div class=pageHeader>");
        stringBuilder.append("</div>");
        stringBuilder.append("<div><h6>نسخه آزمایشی</h6></div>");
        stringBuilder.append("<h2 color = saddlebrown >اطلاعات شما با موفقیت ثبت شد.</h2>");
        stringBuilder.append("<br>");
        stringBuilder.append("<div class=tableBox>");
        stringBuilder.append("    <form>");
        stringBuilder.append("        <table>");
        stringBuilder.append("            <tr>");
        stringBuilder.append("                <td>نام شرکت :</td>");
        stringBuilder.append("                <td><h5>"+legalCustomer.getCompanyName()+"</h5></td>");
        stringBuilder.append("            </tr>");
        stringBuilder.append("            <tr>");
        stringBuilder.append("                <td>تاریخ ثبت :</td>");
        stringBuilder.append("                <td><h5>"+legalCustomer.getRegisterDate()+"</h5></td>");
        stringBuilder.append("            </tr>");
        stringBuilder.append("            <tr>");
        stringBuilder.append("                <td>کد اقتصادی :</td>");
        stringBuilder.append("                <td><h5>"+legalCustomer.getEconomicId()+"</h5></td>");
        stringBuilder.append("            </tr>");
        stringBuilder.append("            <tr>");
        stringBuilder.append("                <td>شماره مشتری :</td>");
        stringBuilder.append("                <td><h5>"+customer.getCustomerNumber()+"</h5></td>");
        stringBuilder.append("            </tr>");
        stringBuilder.append("        </table>");
        stringBuilder.append("        <a href=index.html class=button>بازگشت به صفحه اول</a>");
        stringBuilder.append("    </form>");
        stringBuilder.append("</div>");
        stringBuilder.append("</body>");
        stringBuilder.append("</html>");
       /* stringBuilder.append("<!DOCTYPE html>\n" +
                "<html>\n" +
                "<head lang=\"fa\">\n" +
                "    <meta charset=\"UTF-8\">\n" +
                "    <link href=\"style/Style.css\" rel=\"stylesheet\">\n" +
                "    <title>اطلاعات مشتری</title>\n" +
                "<body>\n" +
                "<div class=\"pageHeader\">\n" +
                "</div>\n" +
                "<div><h6>نسخه آزمایشی</h6></div>\n" +
                "<h2 color=\"saddlebrown\">اطلاعات شما با موفقیت ثبت شد.</h2>\n" +
                "<br>\n" +
                "<div class=\"tableBox\">\n" +
                "    <form>\n" +
                "        <table>\n" +
                "            <tr>\n" +
                "                <td>نام شرکت :</td>\n" +
                "                <td><h5>legalCustomer.getName</h5></td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td>تاریخ ثبت :</td>\n" +
                "                <td><h5>legalCustomer.getDate</h5></td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td>کد اقتصادی :</td>\n" +
                "                <td><h5>legalCustomer.getEconomic</h5></td>\n" +
                "            </tr>\n" +
                "            <tr>\n" +
                "                <td>شماره مشتری :</td>\n" +
                "                <td><h5>customer.getEconomic</h5></td>\n" +
                "            </tr>\n" +
                "        </table>\n" +
                "        <a href=\"index.html\" class=\"button\">بازگشت به صفحه اول</a>\n" +
                "    </form>\n" +
                "</div>\n" +
                "</body>\n" +
                "</html>");*/
        return stringBuilder.toString();

    }
}
