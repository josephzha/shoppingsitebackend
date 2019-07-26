package com.newsoftvalley.customer;

import javax.jws.WebParam;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import com.newsoftvalley.rest.NewSoftValleyResource;
import com.newsoftvalley.rest.NewSoftValleyServlet;

public class AccountResource extends NewSoftValleyResource<Long,Account> {

  private Map<Long, Account> _records = new HashMap<>();
  private long _curId = 0;

  public Account get(Long id) {
    return _records.get(id);
  }

  public Long create(Account account) {
    long curId = _curId;
    account.setId(curId);
    _records.put(curId, account);
    _curId++;
    return curId;
  }

  public void delete(Long id) {
    _records.remove(id);
  }

  public void update(Long id, Account account) {
    account.setId(id);
    _records.put(id, account);
  }
  public List<Account> findByYuShuWai(
          @WebParam(name = "yuwen") int yuwen,
          @WebParam(name = "shuxue") int shuxue,
          @WebParam(name = "waiyu") int waiyu
  ) {
    System.out.println("yuwen: " + yuwen);
    System.out.println("shuxue: " + shuxue);
    System.out.println("waiyu: " + waiyu);
    return new ArrayList<>();
  }

  public void giveMoneyToNvShen(
          @WebParam(name = "money") int money,
          @WebParam(name = "nvshen") String nvshen
  ) {
    System.out.println("money: " + money);
    System.out.println("nvshen: " + nvshen);
  }

}
