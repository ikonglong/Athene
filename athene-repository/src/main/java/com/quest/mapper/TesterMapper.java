package com.quest.mapper;

import com.quest.model.Tester;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * Created by milo on 2014/8/24.
 */
public interface TesterMapper {

    public List<Tester> findByName(@Param("name") String name);

}
