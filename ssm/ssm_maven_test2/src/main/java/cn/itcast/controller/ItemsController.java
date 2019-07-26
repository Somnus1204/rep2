package cn.itcast.controller;

import cn.itcast.domain.Items;

import cn.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
@Controller
@RequestMapping("/items")
public class ItemsController {
    @Autowired
    private ItemsService itemsService;
    //展示商品信息页面
    @RequestMapping("/showItem")
    public String showItem(int id,Model model){
        Items items = itemsService.findById(id);
        model.addAttribute("item",items);
        return "viewItem";
    }
}
