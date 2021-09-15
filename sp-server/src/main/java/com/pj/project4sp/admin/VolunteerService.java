package com.pj.project4sp.admin;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class VolunteerService {

    @Autowired
    VolunteerMapper volunteerMapper;

    public List<VolunteerPO> condQuery(VolQueryCond cond) {
        String majorLike = "%" + cond.getMajor() + "%";
        cond.setMajor(majorLike);
        return volunteerMapper.condQueryVol(cond);
    }
}
