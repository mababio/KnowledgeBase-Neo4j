package org.mababio.spring.vaadin.ui;

import org.mababio.spring.domain.Person;
import org.mababio.spring.domain.Problem;

import com.vaadin.annotations.Theme;
import com.vaadin.data.fieldgroup.BeanFieldGroup;
import com.vaadin.data.fieldgroup.FieldGroup;
import com.vaadin.data.util.BeanItem;
import com.vaadin.data.util.ObjectProperty;
import com.vaadin.data.util.PropertysetItem;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Button;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;


@Theme("valo")
@SpringUI(path="/test")
public class vaadinTest extends UI {

	@Override
	protected void init(VaadinRequest request) {
		VerticalLayout layout = new VerticalLayout();
        setContent(layout);
        
        
        
        final Button add_field = new Button("new Tag");
        add_field.addClickListener(event -> layout.addComponent(new TextField("Tag")));
        layout.addComponent(add_field);
	}

	
	
	
	
	
	
	
	/*USING A LOOP TO CONSTRUCT FORM*/
	/*@Override
	protected void init(VaadinRequest request) {
		  VerticalLayout layout = new VerticalLayout();
	        setContent(layout);

	        FieldGroup fieldGroup = new BeanFieldGroup<Person>(Person.class);

	        // We need an item data source before we create the fields to be able to
	        // find the properties, otherwise we have to specify them by hand
	        fieldGroup.setItemDataSource(new BeanItem<Person>(new Person()));

	        // Loop through the properties, build fields for them and add the fields
	        // to this UI
	        
	        fieldGroup.getUnboundPropertyIds().stream().forEach(s -> layout.addComponent(fieldGroup.buildAndBind(s)));
	        
	      fieldGroup.clear();
	      final Button persist_Button = new Button("Persist");
	      
	      layout.addComponent(persist_Button);
	      
	      persist_Button.addClickListener( s -> fieldGroup.getFields().stream().forEach(ss-> System.out.println("hey" + ss))); 
			
		
	}
*/
}
