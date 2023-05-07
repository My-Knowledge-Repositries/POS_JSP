package com.devstack.pos.bo.custom.impl;

import com.devstack.pos.bo.custom.CustomerBo;
import com.devstack.pos.dao.DaoFactory;
import com.devstack.pos.dao.custom.CustomerDao;
import com.devstack.pos.dto.CustomerDto;
import com.devstack.pos.entity.Customer;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class CustomerBoImpl implements CustomerBo {
  CustomerDao customerDao = (CustomerDao) DaoFactory.getInstance().getDao(DaoFactory.DaoType.CUSTOMER);
    @Override
    public void saveCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException {
customerDao.save(new Customer(dto.getCustomerId(), dto.getName(), dto.getAddress(), dto.getSalary()));
    }

    @Override
    public CustomerDto findCustomer(long id) throws SQLException, ClassNotFoundException {
        Customer customer = customerDao.find(id);
        if (customer!=null) {
            return new CustomerDto(
                    customer.getCustomerId(),
                    customer.getName(),
                    customer.getAddress(),
                    customer.getSalary()
            );

        }
        return null;
    }

    @Override
    public void updateCustomer(CustomerDto dto) throws SQLException, ClassNotFoundException {
        customerDao.update(new Customer(dto.getCustomerId(), dto.getName(), dto.getAddress(), dto.getSalary()));
    }

    @Override
    public void deleteCustomer(long id) throws SQLException, ClassNotFoundException {
customerDao.delete(id);
    }

    @Override
    public List<CustomerDto> findAllCustomer() throws SQLException, ClassNotFoundException {
        List<CustomerDto> list = new ArrayList<>();
        for (Customer c: customerDao.findAll()
             ) {
            new CustomerDto(
                    c.getCustomerId(),
                    c.getName(),
                    c.getAddress(),
                    c.getSalary()
            );
        }
        return list;
    }
}
