package com.devstack.pos.bo.custom;

import com.devstack.pos.bo.SuperBo;
import com.devstack.pos.dto.CustomerDto;

import java.util.List;

public interface CustomerBo extends SuperBo {
    public void saveCustomer(CustomerDto dto);
    public CustomerDto findCustomer(long id);
    public void updateCustomer(CustomerDto dto);
    public void deleteCustomer(long id);
    public List<CustomerDto> findAllCustomer();
}
