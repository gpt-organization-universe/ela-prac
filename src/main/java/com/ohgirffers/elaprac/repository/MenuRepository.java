package com.ohgirffers.elaprac.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ohgirffers.elaprac.entity.Menu;

public interface MenuRepository extends JpaRepository<Menu, Integer> {
}
