package com.myspring.subtraction.service.impl;

import com.myspring.subtraction.service.SubIntr;
import org.springframework.stereotype.Service;

@Service
public class SubServiceImpl implements SubIntr {
    @Override
    public Integer getSubtraction(Integer a, Integer b) {
        return a-b;
    }
}
