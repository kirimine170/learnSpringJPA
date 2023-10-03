package com.kirimine170.learn.jpa;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

/**
 * CustomerRepositoryインターフェース
 * テーブルの操作内容を保証するインターフェースとして考えるのが良さそう？
 */
public interface CustomerRepository extends CrudRepository<Customer, Long>
{
    List<Customer> findByLastName(String lastName);

    Customer findById(long id);
}
