/*
 * Copyright 1999-2012 Alibaba Group.
 *  
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *  
 *      http://www.apache.org/licenses/LICENSE-2.0
 *  
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.alibaba.cobar.config.model;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 隔离区配置定义
 *
 * @author haiqing.zhuhq 2012-4-17
 */
public final class QuarantineConfig {

    private final Map<String, Set<String>> hosts;

    public QuarantineConfig() {
        hosts = new HashMap<String, Set<String>>();
    }

    public Map<String, Set<String>> getHosts() {
        return hosts;
    }

}
