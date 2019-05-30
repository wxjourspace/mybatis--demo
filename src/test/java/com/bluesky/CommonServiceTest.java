package com.bluesky;

import com.bluesky.bean.ConsultConfigArea;
import com.bluesky.service.CommonService;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.HashMap;
import java.util.Map;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = "classpath*:applicationContext.xml")
public class CommonServiceTest {

    @Autowired
    private CommonService commonService;

    @Test
    public void queryConsultRecords() {
        Map<String, Object> params = new HashMap<String, Object>();
        params.put("psptId", "1");
        System.out.println(commonService.queryConsultRecords(params));
    }
    @Test
    public void saveAreaTest() {
        ConsultConfigArea area = new ConsultConfigArea();
        area.setAreaName("昆明");
        area.setAreaCode("KM");
        area.setState(1);
        int sa = commonService.saveArea(area);
        System.out.println("saveAreaTest-->" + sa);
        System.out.println("area--->" + area);
    }
}
