package com.unti.rabbitmq.Dao;

import com.unti.rabbitmq.po.Temp;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface TempDao {

    void save(Temp temp);
}
