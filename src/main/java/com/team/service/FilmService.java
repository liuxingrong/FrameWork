package com.team.service;

import java.util.List;

import com.team.dto.Film;

public interface FilmService {
	
	List<Film>getAllFilm(int currentPage, int pageSize);

	int getTotalPage(int pageSize);

}
