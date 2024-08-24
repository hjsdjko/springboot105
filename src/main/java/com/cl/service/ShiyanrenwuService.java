package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShiyanrenwuEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShiyanrenwuView;


/**
 * 实验任务
 *
 * @author 
 * @email 
 * @date 2024-03-07 22:25:18
 */
public interface ShiyanrenwuService extends IService<ShiyanrenwuEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanrenwuView> selectListView(Wrapper<ShiyanrenwuEntity> wrapper);
   	
   	ShiyanrenwuView selectView(@Param("ew") Wrapper<ShiyanrenwuEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanrenwuEntity> wrapper);
   	

}

