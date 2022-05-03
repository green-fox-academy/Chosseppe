package com.greenfoxaccademy.simpleweb.controllers;

import com.greenfoxaccademy.simpleweb.models.ShopItem;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

@Controller
public class ShopItemsController {

    private List<ShopItem> eshopProducts = new ArrayList<>();

    public ShopItemsController(){
        eshopProducts.add( new ShopItem("Running shoes", 1000, 5, "Nike running shoes for every day sport"));
        eshopProducts.add( new ShopItem("Printer", 3000, 2, "Some HP printer that will print the pages"));
        eshopProducts.add( new ShopItem("Coca cola", 25, 0, "0.5l tasty drink"));
        eshopProducts.add( new ShopItem("Wokin", 119, 100, "Chicken with fried rice and WOKIN sauce"));
        eshopProducts.add( new ShopItem("T-shirt", 300, 1, "Blue with a corgi on a bike"));
    }

    @RequestMapping(path = "/", method = RequestMethod.GET)
    public String showItems(Model model) /*@RequestParam(name = "itemName", required = false) String name)*/ {

        List<ShopItem> shopItemsList = eshopProducts;

        model.addAttribute("items", shopItemsList);
        return "index";
    }

    @RequestMapping(value="/btn-onlyAvailable")
    public String onlyAvailable(Model model) {

        List<ShopItem> shopItemsList = eshopProducts;

        model.addAttribute("items", shopItemsList.stream().filter(x -> x.getQuantityOfStock() > 0).collect(Collectors.toList()));
        return "index";
    }

    @RequestMapping(value="/btn-cheapFirst")
    public String cheapestFirst(Model model) {

        List<ShopItem> shopItemsList = eshopProducts;

        model.addAttribute("items", shopItemsList.stream().sorted(Comparator.comparingDouble(ShopItem::getPrice)).collect(Collectors.toList()));
        return "index";
    }

    @RequestMapping(value="/btn-ContainsNike")
    public String containsNike(Model model) {

        List<ShopItem> shopItemsList = eshopProducts;

        model.addAttribute("items", shopItemsList.stream().filter(x -> x.getDescription().contains("Nike")).collect(Collectors.toList()));
        return "index";
    }

    @RequestMapping(value="/btn-mostExpensiveAvailable")
    public String mostExpensiveAvailable(Model model) {

        List<ShopItem> shopItemsList = eshopProducts;

        model.addAttribute("items", shopItemsList.stream().filter(x -> x.getQuantityOfStock() > 0).max(Comparator.comparing(ShopItem::getPrice)).get());
        return "index";
    }

    @RequestMapping(value="/btn-averageStock")
    public String averageStock(Model average) {

        List<ShopItem> shopItemsList = eshopProducts;

        average.addAttribute("average", shopItemsList.stream().collect(Collectors.averagingInt(ShopItem::getQuantityOfStock)));
        return "average";
    }
}
