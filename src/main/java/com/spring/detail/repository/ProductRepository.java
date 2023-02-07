package com.spring.detail.repository;

import com.spring.detail.entity.ProductEntity;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends PagingAndSortingRepository<ProductEntity, Integer> {
    List<ProductEntity> findByNameContaining(String searchInput);
    Page<ProductEntity> findAll(Pageable pageable);
}
