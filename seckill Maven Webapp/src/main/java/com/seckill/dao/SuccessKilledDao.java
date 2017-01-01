package main.java.com.seckill.dao;

import main.java.com.seckill.entity.SuccessKilled;

/**
 * 秒杀插入明细
 * @author Administrator
 *
 */
public interface SuccessKilledDao {
	
	/**
	 * 插入秒杀名字
	 * @param seckillId
	 * @param userPhone
	 * @return
	 */
	int insertSuccessKilled(long seckillId, long userPhone);
	
	/**
	 * 根据seckillId查询SuccessKilled
	 * @param seckillId
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(long seckillId);
}
