package com.skrflower.backend.dao;

import com.skrflower.backend.bean.Destination;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface DestinationDao {

    Destination findById(Integer destId);

    Destination findByDestName(String destName);

    List<Destination> findByRegion(Integer regionNum);

    List<Destination> findByCategory(String categoryName);

    List<Destination> findByTag(String tagName);

    List<Destination> findByTags(List<String> tags);
}
