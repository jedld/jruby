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

import com.oracle.truffle.api.CompilerDirectives;
import org.jruby.truffle.runtime.objectstorage.ObjectStorage;

public class UninitializedWriteObjectFieldNode extends WriteObjectFieldNode {

    public UninitializedWriteObjectFieldNode(String name, RespecializeHook hook) {
        super(name, hook);
    }

    @Override
    public void execute(ObjectStorage object, Object value) {
        CompilerDirectives.transferToInterpreter();
        writeAndRespecialize(object, value);
    }

}
