package com.sist.web.service;

import java.util.List;
import java.util.Map;

import com.sist.web.vo.FoodVO;

public interface FoodService {
	public List<FoodVO> foodListData(Map map);
	public int foodTotalPage();
}
