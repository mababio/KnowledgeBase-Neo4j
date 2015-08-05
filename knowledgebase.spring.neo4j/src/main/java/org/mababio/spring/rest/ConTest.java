/*package org.mababio.spring.rest;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;


@Controller
public class ConTest {

	
	@RequestMapping(value = "/hello", method = RequestMethod.GET)
	    public ModelAndView hello() {
	        ModelAndView mav = new ModelAndView();
	        mav.setViewName("hello");
	        String str = "Hello World!";
	        mav.addObject("message", str);
	        return mav;
	    }

}
*/