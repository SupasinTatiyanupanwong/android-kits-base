/*
 * Copyright 2020 Supasin Tatiyanupanwong
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

package dev.supasintatiyanupanwong.libraries.android.kits.tasks.listeners;

import androidx.annotation.NonNull;

import dev.supasintatiyanupanwong.libraries.android.kits.tasks.Task;

/**
 * Interface definition for a callback to be invoked when a {@link Task} fails with an exception.
 *
 * @since 1.0.0
 */
public interface OnFailureListener {

    /**
     * Called when the {@link Task} fails with an exception.
     *
     * @param exception the exception that caused the {@link Task} to fail. Never null.
     */
    void onFailure(@NonNull Exception exception);

}
