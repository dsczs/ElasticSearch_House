package com.lcz.repository;

import com.lcz.entity.HouseDetail;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface HouseDetailRepository extends CrudRepository<HouseDetail, Long> {
    HouseDetail findByHouseId(Long houseId);

    List<HouseDetail> findAllByHouseIdIn(List<Long> houseIds);
}
