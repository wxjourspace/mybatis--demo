package com.bluesky.service;

import com.bluesky.bean.ConsultConfigArea;
import com.bluesky.bean.ConsultRecord;

import java.util.List;
import java.util.Map;

public interface CommonService {
    List<ConsultRecord> queryConsultRecords(Map param);
    List<ConsultRecord> queryRecords(Map param);
    int saveArea(ConsultConfigArea area);
    int updateConsultRecord(Map param);
    int updateArea(ConsultConfigArea area);
    int deleteArea(List areaCodes);
}
