/*
 * Copyright (C) 2014, BeautySight Inc. All rights reserved.
 */

package com.quest.athene.application.domain;

import com.quest.athene.application.shared.CommonModel;

import java.io.Serializable;

/**
 * A tag interface that represents value object.
 * @author chenlong
 * @since 1.0
 */
public abstract class ValueObject extends CommonModel implements JsonAnyFieldVisible, Serializable {
}
