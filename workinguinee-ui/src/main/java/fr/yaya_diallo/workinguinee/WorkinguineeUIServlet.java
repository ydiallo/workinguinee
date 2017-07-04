package fr.yaya_diallo.workinguinee;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;

import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.server.VaadinServlet;

import fr.yaya_diallo.workinguinee.web.WorkinguineeUI;

@WebServlet(urlPatterns = "/*", name = "WorkinguineeUIServlet", asyncSupported = true)
@VaadinServletConfiguration(ui = WorkinguineeUI.class, productionMode = false)
public class WorkinguineeUIServlet extends VaadinServlet {

	private static final long serialVersionUID = -6988083646800554269L;
	
	@Override
    protected void servletInitialized() throws ServletException {
        super.servletInitialized();

    }

}
