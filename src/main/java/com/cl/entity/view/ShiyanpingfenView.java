package com.cl.entity.view;

import com.cl.entity.ShiyanpingfenEntity;

import com.baomidou.mybatisplus.annotations.TableName;
import org.apache.commons.beanutils.BeanUtils;
import java.lang.reflect.InvocationTargetException;
import java.math.BigDecimal;

import java.io.Serializable;
import com.cl.utils.EncryptUtil;
 

/**
 * 实验评分
 * 后端返回视图实体辅助类   
 * （通常后端关联的表或者自定义的字段需要返回使用）
 * @author 
 * @email 
 * @date 2024-03-07 22:25:18
 */
@TableName("shiyanpingfen")
public class ShiyanpingfenView  extends ShiyanpingfenEntity implements Serializable {
	private static final long serialVersionUID = 1L;

	public ShiyanpingfenView(){
	}
 
 	public ShiyanpingfenView(ShiyanpingfenEntity shiyanpingfenEntity){
 	try {
			BeanUtils.copyProperties(this, shiyanpingfenEntity);
		} catch (IllegalAccessException | InvocationTargetException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
 		
	}


}
