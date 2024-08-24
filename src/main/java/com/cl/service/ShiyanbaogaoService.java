package com.cl.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.cl.utils.PageUtils;
import com.cl.entity.ShiyanbaogaoEntity;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShiyanbaogaoView;


/**
 * 实验报告
 *
 * @author 
 * @email 
 * @date 2024-03-07 22:25:18
 */
public interface ShiyanbaogaoService extends IService<ShiyanbaogaoEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<ShiyanbaogaoView> selectListView(Wrapper<ShiyanbaogaoEntity> wrapper);
   	
   	ShiyanbaogaoView selectView(@Param("ew") Wrapper<ShiyanbaogaoEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<ShiyanbaogaoEntity> wrapper);
   	

    List<Map<String, Object>> selectValue(Map<String, Object> params,Wrapper<ShiyanbaogaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(Map<String, Object> params,Wrapper<ShiyanbaogaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(Map<String, Object> params,Wrapper<ShiyanbaogaoEntity> wrapper);



}

