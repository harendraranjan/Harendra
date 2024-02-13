package com.portfolio.Dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.portfolio.entity.contact;

public interface UserReposetry  extends JpaRepository<contact, Integer>{

}
