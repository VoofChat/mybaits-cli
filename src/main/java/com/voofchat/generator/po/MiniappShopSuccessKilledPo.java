package com.voofchat.generator.po;

import java.io.Serializable;
import java.util.Date;

public class MiniappShopSuccessKilledPo extends MiniappShopSuccessKilledKeyPo implements Serializable {
    /**
     * 状态标识:-1:无效 0:成功 1:已付款 2:已发货
     */
    private Byte state;

    /**
     * 创建时间
     */
    private Date createTime;

    private static final long serialVersionUID = 1L;

    public Byte getState() {
        return state;
    }

    public void setState(Byte state) {
        this.state = state;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
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
        sb.append(", state=").append(state);
        sb.append(", createTime=").append(createTime);
        sb.append("]");
        return sb.toString();
    }
}