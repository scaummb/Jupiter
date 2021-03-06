/*
 * Copyright (c) 2015 The Jupiter Project
 *
 * Licensed under the Apache License, version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at:
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package org.jupiter.example.spring.interceptor.provider;

import org.jupiter.rpc.provider.ProviderInterceptor;
import org.jupiter.rpc.tracing.TraceId;

/**
 * jupiter
 * org.jupiter.example.spring.interceptor.provider
 *
 * @author jiachun.fjc
 */
public class MyGlobalProviderInterceptor2 implements ProviderInterceptor {

    @Override
    public void beforeInvoke(TraceId traceId, Object provider, String methodName, Object[] args) {
        System.err.println("global 2 beforeInvoke#" + traceId + " " + methodName);
    }

    @Override
    public void afterInvoke(TraceId traceId, Object provider, String methodName, Object[] args, Object result, Throwable failCause) {
        System.err.println("global 2 afterInvoke#" + traceId + " " + methodName + " result=" + result);
    }
}
