package com.lt.testt;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public class JsonTest
{
    public static void main(String[] args)
    {
        String a =
            "{\\'success\\': \\'1\\',\\'message\\': \\'成功\\',\\'code\\': \\'200\\',\\'errorType\\': \\'\\',\\'requestId\\': \\'\\',\\'result\\':{\\'ENTITY_CARD_ID\\': \\'123321\\',\\'USER_ID\\': \\'123321\\'}}";
        Map<String, Object> map = JSONObject.parseObject(a, Map.class);
        Map<String, String> result = (Map<String, String>)map.get("result");
        System.out.println(result);
    }
}
