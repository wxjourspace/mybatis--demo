package com.bluesky.service;

import com.bluesky.bean.ConsultConfigArea;
import com.bluesky.bean.ConsultRecord;
import com.bluesky.dao.CommonMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

@Service
public class CommonServiceImpl implements CommonService {
    @Autowired
    private CommonMapper commonMapper;

    public List<ConsultRecord> queryConsultRecords(Map param) {
        return commonMapper.queryConsultRecords(param);
    }

    public List<ConsultRecord> queryRecords(Map param) {
        return commonMapper.queryRecords(param);
    }

    public int saveArea(ConsultConfigArea area) {
        return commonMapper.saveArea(area);
    }

    public int updateConsultRecord(Map param) {
        return commonMapper.updateConsultRecord(param);
    }

    public int updateArea(ConsultConfigArea area) {
        return commonMapper.saveArea(area);
    }

    public int deleteArea(List areaCodes) {
        return commonMapper.deleteArea(areaCodes);
    }
}
