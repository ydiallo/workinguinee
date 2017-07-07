/**
 * 
 */
package fr.yaya_diallo.workinguinee.mobile;

import org.vaadin.touchkit.ui.TabBarView;

import com.vaadin.ui.Component;
import com.vaadin.ui.TabSheet.Tab;

/**
 * @author pg8pf
 *
 */
public class MainTabsheet extends TabBarView implements Component {

	private static final long serialVersionUID = -6739689860117723241L;
	
	public MainTabsheet() {
        /*
         * Populate main views
         */
		
        addTab(new SearchView(), "SearchView", "Search");

        addTab(new SavedJobsView(), "SavedJobsView", "SavedJobs");

        addTab(new SettingsView(), "SettingView", "Settings");

        setSelectedTab(new SearchView());
    }

    private void addTab(final Component component, final String styleName,
            final String caption) {
        Tab tab = addTab(component);
        tab.setStyleName(styleName);
        tab.setCaption(caption);
        
    }

}
