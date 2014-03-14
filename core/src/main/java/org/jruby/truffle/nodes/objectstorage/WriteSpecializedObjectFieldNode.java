/*
 * Copyright (c) 2013 Oracle and/or its affiliates. All rights reserved. This
 * code is released under a tri EPL/GPL/LGPL license. You can use it,
 * redistribute it and/or modify it under the terms of the:
 *
 * Eclipse Public License version 1.0
 * GNU General Public License version 2
 * GNU Lesser General Public License version 2.1
 */
package org.jruby.truffle.nodes.objectstorage;

import org.jruby.truffle.runtime.objectstorage.ObjectLayout;

public abstract class WriteSpecializedObjectFieldNode extends WriteObjectFieldNode {

    protected final ObjectLayout objectLayout;

    public WriteSpecializedObjectFieldNode(String name, ObjectLayout objectLayout, RespecializeHook hook) {
        super(name, hook);
        this.objectLayout = objectLayout;
    }

}
