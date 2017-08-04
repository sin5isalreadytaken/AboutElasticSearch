package com.example.demo.test;

import com.alibaba.fastjson.JSONObject;
import com.example.demo.factory.ClientFactory;
import com.example.demo.model.BasicModel;
import org.elasticsearch.action.index.IndexResponse;
import org.elasticsearch.client.transport.TransportClient;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by wenxiangzhou214164 on 2017/8/4.
 */
public class Insert {
    private static TransportClient client = ClientFactory.getClient();

    public static void main(String[] args) {
        insertBM();
    }

    public static void insertBM() {
        BasicModel bm = new BasicModel();
        bm.setId(1);
        bm.setName("1s");
        bm.setKins(new ArrayList<Map<String, String>>(){{add(new HashMap<String, String>(){{put("2", "2s");put("3", "3s");}});add(new HashMap<String, String>(){{put("4","4s");put("5","5s");}});}});
        String bmStr = JSONObject.toJSONString(bm);
        System.out.println(bmStr);
        IndexResponse response = client.prepareIndex("bmi", "bmt", "1").setSource(bmStr).get();
        System.out.println(response.toString());
    }
}
