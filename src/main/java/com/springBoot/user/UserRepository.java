package com.springBoot.user;

import org.springframework.data.repository.CrudRepository;

public interface UserRepository extends CrudRepository<User, Long>{
    public Long countById(Long id);
}
