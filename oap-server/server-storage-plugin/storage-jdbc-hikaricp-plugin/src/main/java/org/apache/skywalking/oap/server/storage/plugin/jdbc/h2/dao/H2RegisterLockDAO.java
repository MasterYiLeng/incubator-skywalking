/*
 * Licensed to the Apache Software Foundation (ASF) under one or more
 * contributor license agreements.  See the NOTICE file distributed with
 * this work for additional information regarding copyright ownership.
 * The ASF licenses this file to You under the Apache License, Version 2.0
 * (the "License"); you may not use this file except in compliance with
 * the License.  You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 */

package org.apache.skywalking.oap.server.storage.plugin.jdbc.h2.dao;

import org.apache.skywalking.oap.server.core.source.Scope;
import org.apache.skywalking.oap.server.core.storage.IRegisterLockDAO;

/**
 * No need to create any lock table. In SQL based database, could use `select... for update` to avoid lock table.
 *
 * @author wusheng
 */
public class H2RegisterLockDAO implements IRegisterLockDAO {
    @Override public boolean tryLock(Scope scope) {
        return false;
    }

    @Override public void releaseLock(Scope scope) {

    }
}
