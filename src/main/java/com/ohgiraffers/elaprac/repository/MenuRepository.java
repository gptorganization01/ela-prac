package com.ohgiraffers.elaprac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ohgiraffers.elaprac.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
