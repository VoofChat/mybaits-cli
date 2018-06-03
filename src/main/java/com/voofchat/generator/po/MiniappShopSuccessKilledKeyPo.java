package com.voofchat.generator.po;

import java.io.Serializable;

public class MiniappShopSuccessKilledKeyPo implements Serializable {
    /**
     * 秒杀商品ID
     */
    private Long seckillId;

    /**
     * 用户手机号
     */
    private Long userPhone;

    private static final long serialVersionUID = 1L;

    public Long getSeckillId() {
        return seckillId;
    }

    public void setSeckillId(Long seckillId) {
        this.seckillId = seckillId;
    }

    public Long getUserPhone() {
        return userPhone;
    }

    public void setUserPhone(Long userPhone) {
        this.userPhone = userPhone;
    }

    /**
     *
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", seckillId=").append(seckillId);
        sb.append(", userPhone=").append(userPhone);
        sb.append("]");
        return sb.toString();
    }
}