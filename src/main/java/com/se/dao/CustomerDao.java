package com.se.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.se.entity.Customer;

public interface CustomerDao extends JpaRepository<Customer, String> {
//	public  Customer FindCustomeṛ̣̣̣ById(String maKhachHang);
//	public  Customer FindCustomeṛ̣̣̣BySoCC(String soCC);
}
