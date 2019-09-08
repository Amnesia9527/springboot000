package com.cy.controlller;

import com.cy.mapper.TGoodsMapper;
import com.cy.pojo.TGoods;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.annotation.Resource;
import java.util.List;

@Controller
public class T_GoodsController {

    @Autowired
    private TGoodsMapper tGoodsMapper;

    @RequestMapping("/getGoodsList")
    @ResponseBody
    public List<TGoods> getAllGoods() {
        return tGoodsMapper.getAllGoods();
    }
}
