package test.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;

public class Test2Handler implements CommandHandler {

	@Override
	public String process(HttpServletRequest req, HttpServletResponse res) throws Exception {

		System.out.println("test2.do");
		
		String txt = req.getParameter("txt")==null ?
				"인자 없음" : req.getParameter("txt");
		
		req.setAttribute("msg", txt);
		
		return "/WEB-INF/view/test2.jsp";
	}

}
