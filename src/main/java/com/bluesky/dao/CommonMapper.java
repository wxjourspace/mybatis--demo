package com.bluesky.dao;

import com.bluesky.bean.ConsultConfigArea;
import com.bluesky.bean.ConsultRecord;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

@Repository
public interface CommonMapper {
    List<ConsultRecord> queryConsultRecords(Map param);
    List<ConsultRecord> queryRecords(Map param);
    int saveArea(ConsultConfigArea area);
    int updateConsultRecord(Map param);
    int updateArea(ConsultConfigArea area);
    int deleteArea(List areaCodes);
}
