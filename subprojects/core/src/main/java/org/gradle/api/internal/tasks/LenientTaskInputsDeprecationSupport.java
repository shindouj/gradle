/*
 * Copyright 2017 the original author or authors.
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

package org.gradle.api.internal.tasks;

import org.gradle.api.NonNullApi;
import org.gradle.api.tasks.TaskInputs;
import org.gradle.util.SingleMessageLogger;

@NonNullApi
class LenientTaskInputsDeprecationSupport extends TaskInputsDeprecationSupport {
    protected final TaskInputs taskInputs;

    LenientTaskInputsDeprecationSupport(TaskInputs taskInputs) {
        this.taskInputs = taskInputs;
    }

    @Override
    protected TaskInputs getTaskInputs(String method) {
        SingleMessageLogger.nagUserOfDiscontinuedMethod("chaining of the " + method, String.format("Use '%s' on TaskInputs directly instead.", method));
        return taskInputs;
    }
}
