package com.unti.rabbitmq.service.impl;

import com.unti.rabbitmq.Dao.TempDao;
import com.unti.rabbitmq.po.Temp;
import com.unti.rabbitmq.service.TempService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TempServiceImpl implements TempService {

    @Autowired
    private TempDao tempDao;

    @Override
    public void save(Temp temp) {
        tempDao.save(temp);
    }
}
