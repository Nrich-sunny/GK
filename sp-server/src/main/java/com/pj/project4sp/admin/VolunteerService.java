package com.pj.project4sp.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerService {

    @Autowired
    VolunteerMapper volunteerMapper;

    public List<VolunteerPO> condQuery(VolQueryCond cond) {
        if (cond.getMajor() != null)
            cond.setMajor("%" + cond.getMajor() + "%");

        if (cond.getProvince() != null)
            cond.setProvince("%" + cond.getProvince() + "%");

        return volunteerMapper.condQueryVol(cond);
    }
}
