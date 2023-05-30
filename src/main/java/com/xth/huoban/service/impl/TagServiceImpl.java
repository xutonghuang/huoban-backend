package com.xth.huoban.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.xth.huoban.mapper.TagMapper;
import com.xth.huoban.model.domain.Tag;
import com.xth.huoban.service.TagService;
import org.springframework.stereotype.Service;

/**
* @author 徐同煌
* @description 针对表【tag(标签)】的数据库操作Service实现
* @createDate 2023-05-29 16:24:57
*/
@Service
public class TagServiceImpl extends ServiceImpl<TagMapper, Tag>
    implements TagService {

}




