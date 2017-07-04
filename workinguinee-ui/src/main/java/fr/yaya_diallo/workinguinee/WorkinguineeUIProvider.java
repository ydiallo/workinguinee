package fr.yaya_diallo.workinguinee;

import com.vaadin.server.UIClassSelectionEvent;
import com.vaadin.server.UIProvider;
import com.vaadin.ui.UI;

import fr.yaya_diallo.workinguinee.mobile.WorkinguineeUIMobile;
import fr.yaya_diallo.workinguinee.web.WorkinguineeUI;


public class WorkinguineeUIProvider extends UIProvider {

	private static final long serialVersionUID = -7586076813235524491L;

	@Override
	public Class<? extends UI> getUIClass(UIClassSelectionEvent event) {
		 String mobile = event.getRequest().getParameter("mobile");
		 
		 if(mobile == null){
			 return WorkinguineeUI.class;
		 }else {
			 return WorkinguineeUIMobile.class;
		 }
	}
}
