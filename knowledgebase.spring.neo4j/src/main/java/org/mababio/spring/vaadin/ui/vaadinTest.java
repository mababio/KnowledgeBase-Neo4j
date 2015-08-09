package org.mababio.spring.vaadin.ui;


import org.mababio.spring.domain.Problem;
import org.mababio.spring.domain.Solution;
import org.mababio.spring.domain.Tag;
import org.mababio.spring.inter.PersistService;
import org.springframework.beans.factory.annotation.Autowired;

import com.vaadin.annotations.Theme;
import com.vaadin.data.Validator;
import com.vaadin.data.validator.StringLengthValidator;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.ui.Alignment;
import com.vaadin.ui.Button;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;
import com.vaadin.ui.Window;


@Theme("valo")
@SpringUI(path="/test")
public class vaadinTest extends UI {

	@Autowired
	PersistService service;
	
	
	@Override
	protected void init(VaadinRequest request) {
		
		Problem problem = new Problem();
		
		
		
		VerticalLayout  mainLayout= new VerticalLayout();
		mainLayout.setSizeFull();
		setContent(mainLayout);
	
		VerticalLayout layout = new VerticalLayout(); 
		mainLayout.addComponent(layout);
       mainLayout.setComponentAlignment(layout, Alignment.MIDDLE_CENTER);
      
       
       //form Components
        TextField probField = new TextField("Problem");
         probField.setSizeFull();
 
        TextField tagField = new TextField("Tag"); 
        Button addTag = new Button("Add Tag");
        
        Button perButton = new Button("Persist");
        
        
        //Listener
        addTag.addClickListener(listener -> {
       //Notification.show("This is just the beginning!!!!" +fName.getValue()); 
        	problem.consume(new Tag().setContent(tagField.getValue()));
        }  );
        
        perButton.addClickListener(listner ->
        {
        	problem.setContent(probField.getValue());
        	service.persist(problem);
        	getUI().getPage().setLocation("localhost:8080/test"/*getUI().toString()*/);
        	//close(); 
        	

        });
        
        layout.addComponents(probField, tagField, addTag, perButton);
        
        
        
        
        
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
