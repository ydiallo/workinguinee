package fr.yaya_diallo.workinguinee.web;

import com.vaadin.annotations.Theme;
import com.vaadin.data.provider.CallbackDataProvider;
import com.vaadin.data.provider.DataProvider;
import com.vaadin.server.VaadinRequest;
import com.vaadin.ui.Button;
import com.vaadin.ui.Grid;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

import fr.yaya_diallo.workinguinee.Person;
import fr.yaya_diallo.workinguinee.backend.CrudService;

/**
 *
 */
@Theme("workinguineetheme")
public class WorkinguineeUI extends UI {

	private static final long serialVersionUID = -2433807075966063573L;
	private CrudService<Person> service = new CrudService<>();
    private DataProvider<Person, String> dataProvider = new CallbackDataProvider<>(
                    query -> service.findAll().stream(),
                    query -> service.findAll().size());

    @Override
    protected void init(VaadinRequest vaadinRequest) {
    	
        final VerticalLayout layout = new VerticalLayout();
        final TextField name = new TextField();
        name.setCaption("Type your name here (NOT MOBILE):");

        final Button button = new Button("Click Me");
        button.addClickListener(e -> {
            service.save(new Person(name.getValue()));
            dataProvider.refreshAll();
        });

        final Grid<Person> grid = new Grid<>();
        grid.addColumn(Person::getName).setCaption("Name");
        grid.setDataProvider(dataProvider);
        grid.setSizeFull();

        // This is a component from the workinguinee-addon module
        //layout.addComponent(new MyComponent());
        layout.addComponents(name, button, grid);
        layout.setSizeFull();
        layout.setExpandRatio(grid, 1.0f);

        setContent(layout);
    }
    
   /* @WebServlet(urlPatterns = "/*", name = "WorkinguineeUIServlet", asyncSupported = true)
    @VaadinServletConfiguration(ui = WorkinguineeUI.class, productionMode = false)
    public static class WorkinguineeUIServlet extends VaadinServlet {

		private static final long serialVersionUID = -3813053250589341338L;
  	  
    }*/
}
