package main.java.com.seckill.dao;

import java.util.Date;
import java.util.List;

import main.java.com.seckill.entity.Seckill;

public interface SeckillDao {
	
	/**
	 *减库存 
	 * @param seckillId
	 * @return
	 */
	int reduceNum(long seckillId,Date killTime);
	
	
	/**
	 * 根据seckillId查询seckill
	 * @param seckillId
	 * @return
	 */
	Seckill queryById(long seckillId);
	
	/**
	 * 分页查询
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<Seckill> queryAll(int offset, int limit);
	
}
