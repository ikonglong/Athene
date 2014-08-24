package com.quest.mapper;

import com.quest.model.Tester;
import org.junit.Assert;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class TesterMapperTest extends BaseTest {

    @Autowired
    private TesterMapper testerMapper;

    @Test
    public void testFindByName() throws Exception {
        List<Tester> testers = testerMapper.findByName("scott");
        Assert.assertNotNull(testers);
        Assert.assertEquals(1, testers.size());
        Assert.assertEquals("scott", testers.get(0).getName());
        System.out.println(testers.get(0).getName());
    }

}