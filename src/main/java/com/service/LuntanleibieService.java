package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.LuntanleibieEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.LuntanleibieVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.LuntanleibieView;


/**
 * 论坛类别
 *
 * @author 
 * @email 
 * @date 2021-04-25 17:25:08
 */
public interface LuntanleibieService extends IService<LuntanleibieEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<LuntanleibieVO> selectListVO(Wrapper<LuntanleibieEntity> wrapper);
   	
   	LuntanleibieVO selectVO(@Param("ew") Wrapper<LuntanleibieEntity> wrapper);
   	
   	List<LuntanleibieView> selectListView(Wrapper<LuntanleibieEntity> wrapper);
   	
   	LuntanleibieView selectView(@Param("ew") Wrapper<LuntanleibieEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<LuntanleibieEntity> wrapper);
   	
}

