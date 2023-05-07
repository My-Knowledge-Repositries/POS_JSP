package com.devstack.pos.bo.custom;

import com.devstack.pos.bo.SuperBo;
import com.devstack.pos.dto.CustomerDto;

import java.sql.SQLException;
import java.util.List;

public interface CustomerBo extends SuperBo {
    public void saveCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException;
    public CustomerDto findCustomer(long id) throws SQLException, ClassNotFoundException;
    public void updateCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException;
    public void deleteCustomer(long id) throws SQLException, ClassNotFoundException;
    public List<CustomerDto> findAllCustomer() throws SQLException, ClassNotFoundException;
}
