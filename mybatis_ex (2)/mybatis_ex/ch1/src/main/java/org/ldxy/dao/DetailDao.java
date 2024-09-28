package org.ldxy.dao;

import org.ldxy.pojo.Detail;

import java.util.List;

public interface DetailDao {
public List<Detail> selectByPros(Detail detail);
public List<Detail> selectByPro(Detail detail);
}
