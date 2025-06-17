package com.sist.web.vo;
import lombok.Data;
// 자가학습 => 종합 => 개인 프로젝트 : CI/CD 추가
// 
@Data
public class FoodVO {
	 private int fno;
	 private String name,type,phone,address,theme,images,time,parking,content,price,poster;
	 private double score;
}
