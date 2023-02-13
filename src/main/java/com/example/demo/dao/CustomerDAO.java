package com.example.demo.dao;

import com.example.demo.db.DBManager;
import com.example.demo.vo.CustomerVO;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CustomerDAO {
    public List<CustomerVO> findAll(){
        return DBManager.findAll();

    }

}
