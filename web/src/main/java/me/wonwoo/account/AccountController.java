package me.wonwoo.account;

import me.wonwoo.entity.Account;
import me.wonwoo.repository.AccountRepository;
import me.wonwoo.service.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * Created by wonwoo on 2016. 4. 4..
 */
@RestController
public class AccountController {

  @Autowired
  private AccountRepository accountRepository;

  @Autowired
  private AccountService accountService;

  @RequestMapping("/account")
  public List<Account> account(){
    return accountRepository.findAll();
  }

  @RequestMapping(value = "/account", method = RequestMethod.POST)
  @ResponseStatus(HttpStatus.OK)
  public Account createAccount(@RequestBody Account account){
    return accountService.save(account);
  }
}
