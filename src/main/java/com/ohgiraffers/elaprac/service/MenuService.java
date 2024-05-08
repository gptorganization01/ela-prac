package com.ohgiraffers.elaprac.service;

import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ohgiraffers.elaprac.dto.MenuDTO;
import com.ohgiraffers.elaprac.entity.Menu;
import com.ohgiraffers.elaprac.repository.MenuRepository;

@Service
public class MenuService {

	private final MenuRepository menuRepository;
	private final ModelMapper mapper;

	@Autowired
	public MenuService(MenuRepository menuRepository, ModelMapper mapper) {
		this.menuRepository = menuRepository;
		this.mapper = mapper;
	}

	public MenuDTO findMenuByMenuCode(int menuCode) {
		Menu selectedMenu = menuRepository.findById(menuCode).orElseThrow(IllegalArgumentException::new);

		return mapper.map(selectedMenu, MenuDTO.class);
	}
}
