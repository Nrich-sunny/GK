package com.pj.project4sp.admin;

import org.apache.ibatis.annotations.Mapper;

import java.util.List;

@Mapper
public interface VolunteerMapper {
    /**
     * 条件查询志愿
     * @param cond 查询条件
     * @return 查询到的所有志愿
     */
    List<VolunteerPO> condQueryVol(VolQueryCond cond);
}
