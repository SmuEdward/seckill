package main.java.com.seckill.dao;

import main.java.com.seckill.entity.SuccessKilled;

/**
 * ��ɱ������ϸ
 * @author Administrator
 *
 */
public interface SuccessKilledDao {
	
	/**
	 * ������ɱ����
	 * @param seckillId
	 * @param userPhone
	 * @return
	 */
	int insertSuccessKilled(long seckillId, long userPhone);
	
	/**
	 * ����seckillId��ѯSuccessKilled
	 * @param seckillId
	 * @return
	 */
	SuccessKilled queryByIdWithSeckill(long seckillId);
}
