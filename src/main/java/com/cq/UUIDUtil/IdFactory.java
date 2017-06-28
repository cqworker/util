package com.cq.UUIDUtil;

import java.util.UUID;

/**
 * 
 * for 生成id的工厂类
 * 
 * @author cq
 * @created with neon3 STS
 * @date 2017年6月28日 下午4:01:34
 *
 */
public class IdFactory {
	/**
	 * 生成32位UUID
	 * 
	 * @return String
	 */
	public static String get32UUID() {
		return UUID.randomUUID().toString().replaceAll("-", "");
	}

}
