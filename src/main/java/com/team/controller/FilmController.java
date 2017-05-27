package com.team.controller;

import java.util.Enumeration;
import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.context.SecurityContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.team.dto.Film;
import com.team.service.FilmService;

/**
 * Created by fantasy on 16-12-4.
 */
@RequestMapping("/film")
@Controller
public class FilmController {
	
	@Autowired
	private FilmService filmService;
	
    @RequestMapping("/index")
    public String test(HttpServletRequest request){
    	HttpSession session = request.getSession();
    	Enumeration<String> enumeration = session.getAttributeNames();
    	while (enumeration.hasMoreElements()) {
			System.out.println(enumeration.nextElement());
		}
    	SecurityContext securityContext = (SecurityContext) session.getAttribute("SPRING_SECURITY_CONTEXT");
    	System.out.println(securityContext);
        return "film";
    }
    
    @RequestMapping("/getTotalPage")
    @ResponseBody
    public int getTotalPage(int pageSize){
    	return filmService.getTotalPage(pageSize);
    }
    
    @RequestMapping("/getAllFilm")
    @ResponseBody
    public List<Film> getAllFilm(int currentPage, int pageSize){
    	List<Film> list = filmService.getAllFilm(currentPage, pageSize);
    	return list;
    }
    
    
}
