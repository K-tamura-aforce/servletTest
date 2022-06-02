package servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import tool.Page;

@WebServlet(urlPatterns = { "/servlet/contact" })
public class Contact extends HttpServlet {

	public void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		PrintWriter out = response.getWriter();

		String name = request.getParameter("name");
		String company = request.getParameter("company");
		String mail = request.getParameter("mail");
		String review = request.getParameter("review");
		String[] merumaga = request.getParameterValues("merumaga");
		String hope = request.getParameter("hope");

		Page.header(out);
		out.println("<h2>内容のご確認</h2>");
		out.println("<p>名前:" + name + "</p>");
		out.println("<p>会社:" + company + "</p>");
		out.println("<p>メールアドレス:" + mail + "</p>");
		out.println("<p>お問い合わせ内容:" + review + "</p>");
		if (merumaga != null) {
			for (String item : merumaga) {
				out.println("<p>「" + item + "」</p>");
			}

			out.println("に関するメルマガをお送りします。");

		} else {
			out.println("メルマガはお送りしません。");

		}

		if (hope != null && hope.equals("yes")) {
			out.println("<p>この度は資料請求いただきありがとうございます。以下のリンクから資料ダウンロードが可能です。</p>");
			String url = "https://www.uverworld.com/s/n4/?ima=3856";
			out.println("<a href=\"" + url + "\">リンク</a>");

		} else {
			out.println("<p>資料請求はご希望されていません。</p>");
		}

		Page.footer(out);
	}

}
