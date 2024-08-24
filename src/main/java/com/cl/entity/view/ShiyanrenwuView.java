package com.cl.entity.view;

import com.cl.entity.ShiyanrenwuEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 实验任务
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-07 22:25:18
 */
@TableName("shiyanrenwu")
public class ShiyanrenwuView  extends ShiyanrenwuEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyanrenwuView(){
	}
 
 	public ShiyanrenwuView(ShiyanrenwuEntity shiyanrenwuEntity){
 	try {
			BeanUtils.copyProperties(this, shiyanrenwuEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
