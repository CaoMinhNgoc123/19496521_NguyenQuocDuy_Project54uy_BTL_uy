package com.se.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.se.entity.DichVu;




public interface DichVuDao extends JpaRepository<DichVu, Integer> {

}
