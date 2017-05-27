package com.team.mapper;

import java.util.List;

import com.team.dto.Film;

public interface FilmMapper {

	public List<Film> getAllFilm();

	public int getTotal();
	
}
