package main.java.com.seckill.dao;

import java.util.Date;
import java.util.List;

import main.java.com.seckill.entity.Seckill;

public interface SeckillDao {
	
	/**
	 *����� 
	 * @param seckillId
	 * @return
	 */
	int reduceNum(long seckillId,Date killTime);
	
	
	/**
	 * ����seckillId��ѯseckill
	 * @param seckillId
	 * @return
	 */
	Seckill queryById(long seckillId);
	
	/**
	 * ��ҳ��ѯ
	 * @param offset
	 * @param limit
	 * @return
	 */
	List<Seckill> queryAll(int offset, int limit);
	
}
