package cn.ph.blog.dao.db1;

import cn.ph.blog.core.universal.Mapper;
import cn.ph.blog.model.SystemLog;

import java.util.List;

public interface SystemLogMapper extends Mapper<SystemLog> {
    Integer insertByBatch(List<SystemLog> list);
}