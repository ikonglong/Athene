/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.domain;

import com.fasterxml.jackson.annotation.JsonAutoDetect;

/**
 * 实现该接口就表明希望实现类中的所有字段在 序列化/反序列化 为 json/Java对象 时所有字段均可见，包括私有字段。
 * @author chenlong
 * @since 1.0
 */
@JsonAutoDetect(fieldVisibility = JsonAutoDetect.Visibility.ANY)
public interface JsonAnyFieldVisible {
}
