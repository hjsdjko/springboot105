package com.cl.controller;

import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.text.ParseException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Map;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Date;
import java.util.List;
import javax.servlet.http.HttpServletRequest;

import com.cl.utils.ValidatorUtils;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.mapper.Wrapper;
import com.cl.annotation.IgnoreAuth;

import com.cl.entity.ShiyanrenwuEntity;
import com.cl.entity.view.ShiyanrenwuView;

import com.cl.service.ShiyanrenwuService;
import com.cl.service.TokenService;
import com.cl.utils.PageUtils;
import com.cl.utils.R;
import com.cl.utils.MPUtil;
import com.cl.utils.CommonUtil;
import java.io.IOException;

/**
 * 实验任务
 * 后端接口
 * @author 
 * @email 
 * @date 2024-03-07 22:25:18
 */
@RestController
@RequestMapping("/shiyanrenwu")
public class ShiyanrenwuController {
    @Autowired
    private ShiyanrenwuService shiyanrenwuService;



    


    /**
     * 后端列表
     */
    @RequestMapping("/page")
    public R page(@RequestParam Map<String, Object> params,ShiyanrenwuEntity shiyanrenwu,
		HttpServletRequest request){
		String tableName = request.getSession().getAttribute("tableName").toString();
		if(tableName.equals("jiaoshi")) {
			shiyanrenwu.setJiaoshizhanghao((String)request.getSession().getAttribute("username"));
		}
		if(tableName.equals("xuesheng")) {
			shiyanrenwu.setXueshengxingming((String)request.getSession().getAttribute("username"));
		}
        EntityWrapper<ShiyanrenwuEntity> ew = new EntityWrapper<ShiyanrenwuEntity>();

		PageUtils page = shiyanrenwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanrenwu), params), params));

        return R.ok().put("data", page);
    }
    
    /**
     * 前端列表
     */
    @RequestMapping("/list")
    public R list(@RequestParam Map<String, Object> params,ShiyanrenwuEntity shiyanrenwu, 
		HttpServletRequest request){
        EntityWrapper<ShiyanrenwuEntity> ew = new EntityWrapper<ShiyanrenwuEntity>();

		PageUtils page = shiyanrenwuService.queryPage(params, MPUtil.sort(MPUtil.between(MPUtil.likeOrEq(ew, shiyanrenwu), params), params));
        return R.ok().put("data", page);
    }

	/**
     * 列表
     */
    @RequestMapping("/lists")
    public R list( ShiyanrenwuEntity shiyanrenwu){
       	EntityWrapper<ShiyanrenwuEntity> ew = new EntityWrapper<ShiyanrenwuEntity>();
      	ew.allEq(MPUtil.allEQMapPre( shiyanrenwu, "shiyanrenwu")); 
        return R.ok().put("data", shiyanrenwuService.selectListView(ew));
    }

	 /**
     * 查询
     */
    @RequestMapping("/query")
    public R query(ShiyanrenwuEntity shiyanrenwu){
        EntityWrapper< ShiyanrenwuEntity> ew = new EntityWrapper< ShiyanrenwuEntity>();
 		ew.allEq(MPUtil.allEQMapPre( shiyanrenwu, "shiyanrenwu")); 
		ShiyanrenwuView shiyanrenwuView =  shiyanrenwuService.selectView(ew);
		return R.ok("查询实验任务成功").put("data", shiyanrenwuView);
    }
	
    /**
     * 后端详情
     */
    @RequestMapping("/info/{id}")
    public R info(@PathVariable("id") Long id){
        ShiyanrenwuEntity shiyanrenwu = shiyanrenwuService.selectById(id);
		shiyanrenwu = shiyanrenwuService.selectView(new EntityWrapper<ShiyanrenwuEntity>().eq("id", id));
        return R.ok().put("data", shiyanrenwu);
    }

    /**
     * 前端详情
     */
	@IgnoreAuth
    @RequestMapping("/detail/{id}")
    public R detail(@PathVariable("id") Long id){
        ShiyanrenwuEntity shiyanrenwu = shiyanrenwuService.selectById(id);
		shiyanrenwu = shiyanrenwuService.selectView(new EntityWrapper<ShiyanrenwuEntity>().eq("id", id));
        return R.ok().put("data", shiyanrenwu);
    }
    



    /**
     * 后端保存
     */
    @RequestMapping("/save")
    public R save(@RequestBody ShiyanrenwuEntity shiyanrenwu, HttpServletRequest request){
    	shiyanrenwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiyanrenwu);
        shiyanrenwuService.insert(shiyanrenwu);
        return R.ok();
    }
    
    /**
     * 前端保存
     */
    @RequestMapping("/add")
    public R add(@RequestBody ShiyanrenwuEntity shiyanrenwu, HttpServletRequest request){
    	shiyanrenwu.setId(new Date().getTime()+new Double(Math.floor(Math.random()*1000)).longValue());
    	//ValidatorUtils.validateEntity(shiyanrenwu);
        shiyanrenwuService.insert(shiyanrenwu);
        return R.ok();
    }



    /**
     * 修改
     */
    @RequestMapping("/update")
    @Transactional
    public R update(@RequestBody ShiyanrenwuEntity shiyanrenwu, HttpServletRequest request){
        //ValidatorUtils.validateEntity(shiyanrenwu);
        shiyanrenwuService.updateById(shiyanrenwu);//全部更新
        return R.ok();
    }



    

    /**
     * 删除
     */
    @RequestMapping("/delete")
    public R delete(@RequestBody Long[] ids){
        shiyanrenwuService.deleteBatchIds(Arrays.asList(ids));
        return R.ok();
    }
    
	








}
