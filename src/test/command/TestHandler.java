package test.command;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import mvc.command.CommandHandler;

public class TestHandler implements CommandHandler {

	@Override
	public String process(HttpServletRequest request, 
					HttpServletResponse response) throws Exception {

		System.out.println("test.do");
		
		request.setAttribute("test", "model-2");
		request.setAttribute("test2", "모델-2 jsp/servlet");
		
		return "/WEB-INF/view/test.jsp";
	}

}
