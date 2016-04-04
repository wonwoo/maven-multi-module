package me.wonwoo.service;

import me.wonwoo.entity.Account;
import me.wonwoo.repository.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * Created by wonwoo on 2016. 4. 4..
 */
@Service
@Transactional
public class AccountService {

  @Autowired
  private AccountRepository accountRepository;

  public Account save(Account account) {
    return accountRepository.save(account);
  }
}
