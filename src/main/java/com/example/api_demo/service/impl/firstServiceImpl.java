package com.example.api_demo.service.impl;

import com.example.api_demo.service.firstService;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Map;

@Service
public class firstServiceImpl implements firstService {
    @Override
    public Map<String, Object> getFirstData() {
        Map<String, Object> firstData = new HashMap<>();

        firstData.put("test", "Kong API Gateway test");

        return firstData;
    }
}
