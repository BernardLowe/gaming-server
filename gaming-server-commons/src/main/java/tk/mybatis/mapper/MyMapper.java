package tk.mybatis.mapper;


import tk.mybatis.mapper.common.Mapper;
import tk.mybatis.mapper.common.MySqlMapper;

/**
 * @Author: BernardLowe
 * @Description: 特别注意， 该接口不能被扫描到， 否则会出错
 * @Date: Created in 13:58 2019/5/10
 * @Modified By: BernardLowe
 */
public interface MyMapper<T> extends Mapper<T>, MySqlMapper<T> {
}
