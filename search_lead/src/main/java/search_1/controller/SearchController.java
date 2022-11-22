package search_1.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import search_1.dto.search;

@Controller
public class SearchController {
      @RequestMapping("/search")
	public String viewpage() {
		return"searchpage";
	}
      @RequestMapping("/meghamilgayi")
      public String milgya(@RequestParam("id")Long id,ModelMap map ) {
    	  SearchRestClient babu = new SearchRestClient();
    	    search idm = babu.idmelega(id);
    	  map.addAttribute("lund", idm);
    	  return"lundkaresult";
      }
}
