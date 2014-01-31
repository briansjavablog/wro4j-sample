
package com.blog.samples.wro4j;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@Controller
public class TestController 
{		
	
	@RequestMapping(value="/standardView", method = RequestMethod.GET)
	public String loadStandardView()
	{		
		return "testViewNoOptimisation";
	}
	
	@RequestMapping(value="/optimisedView", method = RequestMethod.GET)
	public String loadOptimisedView()
	{		
		return "testViewWithOptimisation";
	}
}