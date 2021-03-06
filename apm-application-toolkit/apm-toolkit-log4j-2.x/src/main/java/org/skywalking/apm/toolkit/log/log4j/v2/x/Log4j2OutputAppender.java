/*
 * Copyright 2017, OpenSkywalking Organization All rights reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 *
 * Project repository: https://github.com/OpenSkywalking/skywalking
 */

package org.skywalking.apm.toolkit.log.log4j.v2.x;

/**
 * Created by wusheng on 2016/12/11.
 */
public class Log4j2OutputAppender {
    /**
     * As default, append "TID: N/A" to the output message,
     * if sky-walking agent in active mode, append the real traceId in the recent Context, if existed, or empty String.
     *
     * @param toAppendTo origin output message.
     */
    public static void append(StringBuilder toAppendTo) {
        toAppendTo.append("TID: N/A");
    }
}
