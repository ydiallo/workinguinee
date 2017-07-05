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
		
		if(event!=null && event.getRequest()!=null && event.getRequest().getHeader("user-agent")!=null){
			String userAgent = event.getRequest().getHeader("user-agent").toLowerCase();
			
			// on teste que l'utilisateur est sous WP ou accède via un navigateur compatible webkit
			if(userAgent.contains("Webkit") || userAgent.contains("webkit") || userAgent.contains("windows phone 8")
					|| userAgent.contains("windows phone 9")) {
				//On va vers la version mobile
				return WorkinguineeUIMobile.class;
			} else{
				//On affiche la page proposant une redirection vers la version Desktop
				return WorkinguineeUI.class;
			}
		}
		return WorkinguineeUI.class;
	}
}
