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

package dev.supasintatiyanupanwong.libraries.android.kits.internal;

import android.os.Looper;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

import static androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX;

/**
 * Simple static methods to be called at the start of your own methods to verify
 * correct arguments and state.
 *
 * @since 1.0.0
 */
@RestrictTo(LIBRARY_GROUP_PREFIX)
public final class Preconditions {

    private Preconditions() {}

    /**
     * Ensures that an object reference passed as a parameter to the calling method is not null.
     *
     * @param reference an object reference
     * @return the non-null reference that was validated
     * @throws NullPointerException if {@code reference} is null
     */
    public static @NonNull <T> T checkNotNull(final @Nullable T reference) {
        if (reference == null) {
            throw new NullPointerException();
        }
        return reference;
    }

    /**
     * Ensures that the current thread is the main thread of the application.
     *
     * @throws IllegalStateException if current thread is not the main thread of the application
     */
    public static void checkNotMainThread() {
        if (isMainThread()) {
            throw new IllegalStateException("Must not be called on the main application thread");
        }
    }


    private static boolean isMainThread() {
        return Looper.getMainLooper() == Looper.myLooper();
    }

}
