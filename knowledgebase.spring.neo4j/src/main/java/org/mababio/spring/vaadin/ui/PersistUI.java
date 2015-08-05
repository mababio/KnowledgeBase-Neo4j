package org.mababio.spring.vaadin.ui;

import org.mababio.spring.domain.Problem;
import org.mababio.spring.domain.Solution;
import org.mababio.spring.domain.Tag;
import org.mababio.spring.inter.PersistService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

import com.vaadin.annotations.Theme;
import com.vaadin.annotations.VaadinServletConfiguration;
import com.vaadin.data.util.BeanItem;
import com.vaadin.event.MouseEvents.ClickListener;
import com.vaadin.server.VaadinRequest;
import com.vaadin.spring.annotation.SpringUI;
import com.vaadin.spring.annotation.VaadinSessionScope;
import com.vaadin.ui.Button;
import com.vaadin.ui.Form;
import com.vaadin.ui.FormLayout;
import com.vaadin.ui.Notification;
import com.vaadin.ui.TextField;
import com.vaadin.ui.UI;
import com.vaadin.ui.VerticalLayout;

//@Scope(value="prototype")
@Theme("valo")
@SpringUI
public class PersistUI extends UI {

	
	@Autowired
	PersistService service;
	
	
	@Override
	protected void init(VaadinRequest request) {
		
		
		
		/* inputfields*/
		final TextField problem_content = new TextField("Problem");
		final TextField solution_content = new TextField("Solution");
		final TextField tag_content = new TextField("Tag");
		
		final Button add_field = new Button("new Tag");
        
        
		
		 
		
		final Button persist_Button = new Button("Persist");
		persist_Button.addClickListener(e -> 
			{
				Problem beanP = new Problem();
				Solution beanS = new Solution();
				Tag beanT = new Tag();
				
				beanP.setContent(problem_content.getValue());
				beanS.setContent(solution_content.getValue());
				beanT.setContent(tag_content.getValue());
				beanP.consume(beanS).consume(beanT);
				service.persist(beanP);
				
	
				
			}
		);
				
		VerticalLayout layout = new VerticalLayout(problem_content,solution_content,tag_content, persist_Button);
		add_field.addClickListener(event -> layout.addComponent(new TextField("Tag")));
		layout.addComponent(add_field);
		
		
		setContent(layout);
				
				
				
		
		
		
	
		
	}

}
