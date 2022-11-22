package search_1.controller;

import org.springframework.web.client.RestTemplate;

import search_1.dto.search;

public class SearchRestClient {
public search idmelega(Long id) {
	RestTemplate sona =new RestTemplate();
	search ser = sona.getForObject("http://localhost:8080/rahul/api/get/"+id, search.class);
	return ser;
	
}
}
