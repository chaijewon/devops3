package com.sist.web.dao;

import org.apache.ibatis.annotations.Mapper;
import com.sist.web.vo.*;
import java.util.*;
@Mapper
public interface FoodMapper {
   /*
    *    <select id="foodListData" resultType="FoodVO" parameterType="hashmap">
		    SELECT fno,name,poster,num 
		    FROM (SELECT fno,name,poster,rownum as num 
		    FROM (SELECT fno,name,poster 
		    FROM project_food ORDER BY fno ASC))
		    WHERE num BETWEEN #{start} AND #{end}
		  </select>
    */
	public List<FoodVO> foodListData(Map map);
	
	/*
	 *   <select id="foodTotalPage" resultType="int">
		    SELECT CEIL(COUNT(*)/12.0) FROM project_food
		  </select>
	 */
	public int foodTotalPage();
}
