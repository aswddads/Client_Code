package com.youdu.module.recommand;

import com.youdu.module.BaseModel;

import java.util.ArrayList;

public class RecommandModel extends BaseModel {
    /**
     * 分别对应json中的两个数据部分
     */
    public ArrayList<RecommandBodyValue> list;
    public RecommandHeadValue head;

}
