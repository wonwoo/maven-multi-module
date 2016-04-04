package me.wonwoo.repository;

import me.wonwoo.entity.Account;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * Created by wonwoo on 2016. 4. 4..
 */

public interface AccountRepository extends JpaRepository<Account, Long>{
}
