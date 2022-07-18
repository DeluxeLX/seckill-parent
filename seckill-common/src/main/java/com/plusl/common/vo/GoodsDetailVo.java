package com.plusl.common.vo;

import com.plusl.common.entity.User;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @program: seckill-parent
 * @description: 商品详情Vo
 * @author: PlusL
 * @create: 2022-07-08 14:59
 **/
@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class GoodsDetailVo {

    private int seckillStatus = 0;
    private int remainSeconds = 0;
    private GoodsVo goods;
    private User user;

}
