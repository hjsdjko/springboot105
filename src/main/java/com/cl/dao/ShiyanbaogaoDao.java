package com.cl.dao;

import com.cl.entity.ShiyanbaogaoEntity;
import com.baomidou.mybatisplus.mapper.BaseMapper;
import java.util.List;
import java.util.Map;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.plugins.pagination.Pagination;

import org.apache.ibatis.annotations.Param;
import com.cl.entity.view.ShiyanbaogaoView;


/**
 * 实验报告
 * 
 * @author 
 * @email 
 * @date 2024-03-07 22:25:18
 */
public interface ShiyanbaogaoDao extends BaseMapper<ShiyanbaogaoEntity> {
	
	List<ShiyanbaogaoView> selectListView(@Param("ew") Wrapper<ShiyanbaogaoEntity> wrapper);

	List<ShiyanbaogaoView> selectListView(Pagination page,@Param("ew") Wrapper<ShiyanbaogaoEntity> wrapper);
	
	ShiyanbaogaoView selectView(@Param("ew") Wrapper<ShiyanbaogaoEntity> wrapper);
	

    List<Map<String, Object>> selectValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShiyanbaogaoEntity> wrapper);

    List<Map<String, Object>> selectTimeStatValue(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShiyanbaogaoEntity> wrapper);

    List<Map<String, Object>> selectGroup(@Param("params") Map<String, Object> params,@Param("ew") Wrapper<ShiyanbaogaoEntity> wrapper);



}
