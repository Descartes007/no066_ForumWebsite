package com.service.impl;

import org.springframework.stereotype.Service;
import java.util.Map;
import java.util.List;

import com.baomidou.mybatisplus.mapper.Wrapper;
import com.baomidou.mybatisplus.mapper.EntityWrapper;
import com.baomidou.mybatisplus.plugins.Page;
import com.baomidou.mybatisplus.service.impl.ServiceImpl;
import com.utils.PageUtils;
import com.utils.Query;


import com.dao.PutongguanliyuanDao;
import com.entity.PutongguanliyuanEntity;
import com.service.PutongguanliyuanService;
import com.entity.vo.PutongguanliyuanVO;
import com.entity.view.PutongguanliyuanView;

@Service("putongguanliyuanService")
public class PutongguanliyuanServiceImpl extends ServiceImpl<PutongguanliyuanDao, PutongguanliyuanEntity> implements PutongguanliyuanService {
	
	
    @Override
    public PageUtils queryPage(Map<String, Object> params) {
        Page<PutongguanliyuanEntity> page = this.selectPage(
                new Query<PutongguanliyuanEntity>(params).getPage(),
                new EntityWrapper<PutongguanliyuanEntity>()
        );
        return new PageUtils(page);
    }
    
    @Override
	public PageUtils queryPage(Map<String, Object> params, Wrapper<PutongguanliyuanEntity> wrapper) {
		  Page<PutongguanliyuanView> page =new Query<PutongguanliyuanView>(params).getPage();
	        page.setRecords(baseMapper.selectListView(page,wrapper));
	    	PageUtils pageUtil = new PageUtils(page);
	    	return pageUtil;
 	}
    
    @Override
	public List<PutongguanliyuanVO> selectListVO(Wrapper<PutongguanliyuanEntity> wrapper) {
 		return baseMapper.selectListVO(wrapper);
	}
	
	@Override
	public PutongguanliyuanVO selectVO(Wrapper<PutongguanliyuanEntity> wrapper) {
 		return baseMapper.selectVO(wrapper);
	}
	
	@Override
	public List<PutongguanliyuanView> selectListView(Wrapper<PutongguanliyuanEntity> wrapper) {
		return baseMapper.selectListView(wrapper);
	}

	@Override
	public PutongguanliyuanView selectView(Wrapper<PutongguanliyuanEntity> wrapper) {
		return baseMapper.selectView(wrapper);
	}

}
