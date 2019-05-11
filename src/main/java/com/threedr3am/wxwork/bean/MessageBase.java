package com.threedr3am.wxwork.bean;

import com.threedr3am.wxwork.util.JsonMapper;

public abstract class MessageBase {

  public abstract void preHandle();

  public String build() {
    preHandle();
    return JsonMapper.nonNullMapper().toJson(this);
  }
}