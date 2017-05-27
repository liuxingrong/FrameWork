package com.team.service.impl;

import com.github.pagehelper.PageHelper;
import com.team.dto.Film;
import com.team.mapper.FilmMapper;
import com.team.service.FilmService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FilmServiceImpl implements FilmService{
	
	@Autowired
	private FilmMapper filmMapper;

	public List<Film> getAllFilm(int currentPage, int pageSize) {
		PageHelper.startPage(currentPage, pageSize);
		return filmMapper.getAllFilm();
	}

	public int getTotalPage(int pageSize) {
		int total = filmMapper.getTotal();
		int totalPage = 0;
		if(total % pageSize == 0){
			totalPage = total / pageSize;
		}else{
			totalPage = total / pageSize + 1;
		}
		return totalPage;
	}
	
}
