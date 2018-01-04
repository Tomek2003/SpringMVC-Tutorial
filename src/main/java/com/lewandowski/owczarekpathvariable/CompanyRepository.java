package com.lewandowski.owczarekpathvariable;

import java.util.List;

interface CompanyRepository {
    List<Company> findAll();
    Company findOne(String name);
}
