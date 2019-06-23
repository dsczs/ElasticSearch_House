package com.lcz.repository;

import com.lcz.entity.Subway;
import org.springframework.data.repository.CrudRepository;

import java.util.List;


/**
 * Created by codingchaozhang.
 */
public interface SubwayRepository extends CrudRepository<Subway, Long> {
    List<Subway> findAllByCityEnName(String cityEnName);
}
