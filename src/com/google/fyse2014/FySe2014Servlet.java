package com.google.fyse2014;

import java.io.IOException;
import javax.servlet.http.*;

@SuppressWarnings("serial")
public class FySe2014Servlet extends HttpServlet {
	public void doGet(HttpServletRequest req, HttpServletResponse resp)
			throws IOException {
		resp.setContentType("text/plain");
		resp.getWriter().println("Hello, world");
	}
}
