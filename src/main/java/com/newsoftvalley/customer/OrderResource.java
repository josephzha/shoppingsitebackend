package com.newsoftvalley.customer;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.newsoftvalley.rest.NewSoftValleyResource;
import com.newsoftvalley.rest.NewSoftValleyServlet;

public class OrderResource extends NewSoftValleyResource<Long,Order> {
    long id = 0;
    Map<Long,Order> map = new HashMap<>();
    public Order get(Long id){
        return map.get(id);
    }
    public void update(Long id,Order order){
        order.setId(id);
        map.put(id,order);
    }
    public void delete(Long id){
        map.remove(id);
    }
    public Long create(Order order){
        long curId = id;
        order.setId(curId);
        map.put(curId, order);
        id++;
        return curId;
    }
    public List<Account> findByShuLiHua(
            @WebParam(name = "shuxue") int shuxue,
            @WebParam(name = "wuli") int wuli,
            @WebParam(name = "huaxue") int huaxue
    ) {
        System.out.println("shuxue: " + shuxue);
        System.out.println("wuli: " + wuli);
        System.out.println("huaxue: " + huaxue);
        return new ArrayList<>();
    }

    public void kissNvshen(
            @WebParam(name = "location") String location,
            @WebParam(name = "nvshen") String nvshen
    ) {
        System.out.println("location: " + location);
        System.out.println("nvshen: " + nvshen);
    }
}
