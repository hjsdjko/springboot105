package com.cl.entity.view;

import com.cl.entity.DiscussshiyanrenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 实验任务评论表
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-07 22:25:18
 */
@TableName("discussshiyanrenwu")
public class DiscussshiyanrenwuView  extends DiscussshiyanrenwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public DiscussshiyanrenwuView(){
	}
 
 	public DiscussshiyanrenwuView(DiscussshiyanrenwuEntity discussshiyanrenwuEntity){
 	try {
			BeanUtils.copyProperties(this, discussshiyanrenwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
