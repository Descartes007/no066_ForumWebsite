package com.service;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.service.IService;
import com.utils.PageUtils;
import com.entity.PutongguanliyuanEntity;
import java.util.List;
import java.util.Map;
import com.entity.vo.PutongguanliyuanVO;
import org.apache.ibatis.annotations.Param;
import com.entity.view.PutongguanliyuanView;


/**
 * 普通管理员
 *
 * @author 
 * @email 
 * @date 2021-04-25 17:25:08
 */
public interface PutongguanliyuanService extends IService<PutongguanliyuanEntity> {

    PageUtils queryPage(Map<String, Object> params);
    
   	List<PutongguanliyuanVO> selectListVO(Wrapper<PutongguanliyuanEntity> wrapper);
   	
   	PutongguanliyuanVO selectVO(@Param("ew") Wrapper<PutongguanliyuanEntity> wrapper);
   	
   	List<PutongguanliyuanView> selectListView(Wrapper<PutongguanliyuanEntity> wrapper);
   	
   	PutongguanliyuanView selectView(@Param("ew") Wrapper<PutongguanliyuanEntity> wrapper);
   	
   	PageUtils queryPage(Map<String, Object> params,Wrapper<PutongguanliyuanEntity> wrapper);
   	
}

