package com.oto.oto;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;

@Transactional
public interface OtoDao extends JpaRepository<Oto, Integer> {

}
