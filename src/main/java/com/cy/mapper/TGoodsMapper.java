package com.cy.mapper;

import com.cy.pojo.TGoods;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface TGoodsMapper {

    @Select("select * from t_goods")
    public List<TGoods> getAllGoods();
}
