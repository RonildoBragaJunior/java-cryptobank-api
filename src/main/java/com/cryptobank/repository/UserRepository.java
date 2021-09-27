package com.cryptobank.repository;

import com.cryptobank.domain.CryptobankUser;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<CryptobankUser, Long> {

    CryptobankUser findUserByUsername(String username);

    CryptobankUser findUserByEmail(String email);
}
