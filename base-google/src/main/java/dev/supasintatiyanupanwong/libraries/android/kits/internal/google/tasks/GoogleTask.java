/*
 * Copyright 2020 Supasin Tatiyanupanwong
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
 */

package dev.supasintatiyanupanwong.libraries.android.kits.internal.google.tasks;

import android.app.Activity;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.annotation.RestrictTo;

import java.util.concurrent.Executor;

import dev.supasintatiyanupanwong.libraries.android.kits.tasks.Task;
import dev.supasintatiyanupanwong.libraries.android.kits.tasks.internal.ResultInterceptor;
import dev.supasintatiyanupanwong.libraries.android.kits.tasks.listeners.OnCanceledListener;
import dev.supasintatiyanupanwong.libraries.android.kits.tasks.listeners.OnCompleteListener;
import dev.supasintatiyanupanwong.libraries.android.kits.tasks.listeners.OnFailureListener;
import dev.supasintatiyanupanwong.libraries.android.kits.tasks.listeners.OnSuccessListener;

import static androidx.annotation.RestrictTo.Scope.LIBRARY_GROUP_PREFIX;

@RestrictTo(LIBRARY_GROUP_PREFIX)
public final class GoogleTask<RawResult, Result> implements Task<Result> {

    private final com.google.android.gms.tasks.Task<RawResult> mDelegate;
    private final ResultInterceptor<RawResult, Result> mResultInterceptor;

    private Result mResult;

    public GoogleTask(
            @NonNull com.google.android.gms.tasks.Task<RawResult> delegate,
            @NonNull ResultInterceptor<RawResult, Result> resultInterceptor) {
        mDelegate = delegate;
        mResultInterceptor = resultInterceptor;
    }

    @Override
    public boolean isComplete() {
        return mDelegate.isComplete();
    }

    @Override
    public boolean isSuccessful() {
        return mDelegate.isSuccessful();
    }

    @Override
    public boolean isCanceled() {
        return mDelegate.isCanceled();
    }

    @Override
    public @Nullable Result getResult() {
        return mResult;
    }

    @Override
    public @Nullable Exception getException() {
        return mDelegate.getException();
    }

    @Override
    public @NonNull Task<Result> addOnSuccessListener(
            final @NonNull OnSuccessListener<Result> listener) {
        mDelegate.addOnSuccessListener(
                new com.google.android.gms.tasks.OnSuccessListener<RawResult>() {
                    @Override
                    public void onSuccess(RawResult result) {
                        mResult = mResultInterceptor.intercept(result);
                        listener.onSuccess(mResult);
                    }
                });
        return this;
    }

    @Override
    public @NonNull Task<Result> addOnSuccessListener(
            @NonNull Executor executor,
            final @NonNull OnSuccessListener<Result> listener) {
        mDelegate.addOnSuccessListener(
                executor,
                new com.google.android.gms.tasks.OnSuccessListener<RawResult>() {
                    @Override
                    public void onSuccess(RawResult result) {
                        mResult = mResultInterceptor.intercept(result);
                        listener.onSuccess(mResult);
                    }
                });
        return this;
    }

    @Override
    public @NonNull Task<Result> addOnSuccessListener(
            @NonNull Activity activity,
            final @NonNull OnSuccessListener<Result> listener) {
        mDelegate.addOnSuccessListener(
                activity,
                new com.google.android.gms.tasks.OnSuccessListener<RawResult>() {
                    @Override
                    public void onSuccess(RawResult result) {
                        mResult = mResultInterceptor.intercept(result);
                        listener.onSuccess(mResult);
                    }
                });
        return this;
    }

    @Override
    public @NonNull Task<Result> addOnFailureListener(
            final @NonNull OnFailureListener listener) {
        mDelegate.addOnFailureListener(
                new com.google.android.gms.tasks.OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                        listener.onFailure(exception);
                    }
                });
        return this;
    }

    @Override
    public @NonNull Task<Result> addOnFailureListener(
            @NonNull Executor executor,
            final @NonNull OnFailureListener listener) {
        mDelegate.addOnFailureListener(
                executor,
                new com.google.android.gms.tasks.OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                        listener.onFailure(exception);
                    }
                });
        return this;
    }

    @Override
    public @NonNull Task<Result> addOnFailureListener(
            @NonNull Activity activity,
            final @NonNull OnFailureListener listener) {
        mDelegate.addOnFailureListener(
                activity,
                new com.google.android.gms.tasks.OnFailureListener() {
                    @Override
                    public void onFailure(@NonNull Exception exception) {
                        listener.onFailure(exception);
                    }
                });
        return this;
    }

    @Override
    public @NonNull Task<Result> addOnCompleteListener(
            final @NonNull OnCompleteListener<Result> listener) {
        mDelegate.addOnCompleteListener(
                new com.google.android.gms.tasks.OnCompleteListener<RawResult>() {
                    @Override
                    public void onComplete(
                            @NonNull com.google.android.gms.tasks.Task<RawResult> task) {
                        mResult = mResultInterceptor.intercept(task.getResult());
                        listener.onComplete(GoogleTask.this);
                    }
                });
        return this;
    }

    @Override
    public @NonNull Task<Result> addOnCompleteListener(
            @NonNull Executor executor,
            final @NonNull OnCompleteListener<Result> listener) {
        mDelegate.addOnCompleteListener(
                executor,
                new com.google.android.gms.tasks.OnCompleteListener<RawResult>() {
                    @Override
                    public void onComplete(
                            @NonNull com.google.android.gms.tasks.Task<RawResult> task) {
                        mResult = mResultInterceptor.intercept(task.getResult());
                        listener.onComplete(GoogleTask.this);
                    }
                });
        return this;
    }

    @Override
    public @NonNull Task<Result> addOnCompleteListener(
            @NonNull Activity activity,
            final @NonNull OnCompleteListener<Result> listener) {
        mDelegate.addOnCompleteListener(
                activity,
                new com.google.android.gms.tasks.OnCompleteListener<RawResult>() {
                    @Override
                    public void onComplete(
                            @NonNull com.google.android.gms.tasks.Task<RawResult> task) {
                        mResult = mResultInterceptor.intercept(task.getResult());
                        listener.onComplete(GoogleTask.this);
                    }
                });
        return this;
    }

    @Override
    public @NonNull Task<Result> addOnCanceledListener(
            final @NonNull OnCanceledListener listener) {
        mDelegate.addOnCanceledListener(
                new com.google.android.gms.tasks.OnCanceledListener() {
                    @Override
                    public void onCanceled() {
                        listener.onCanceled();
                    }
                });
        return this;
    }

    @Override
    public @NonNull Task<Result> addOnCanceledListener(
            @NonNull Executor executor,
            final @NonNull OnCanceledListener listener) {
        mDelegate.addOnCanceledListener(
                executor,
                new com.google.android.gms.tasks.OnCanceledListener() {
                    @Override
                    public void onCanceled() {
                        listener.onCanceled();
                    }
                });
        return this;
    }

    @Override
    public @NonNull Task<Result> addOnCanceledListener(
            @NonNull Activity activity,
            final @NonNull OnCanceledListener listener) {
        mDelegate.addOnCanceledListener(
                activity,
                new com.google.android.gms.tasks.OnCanceledListener() {
                    @Override
                    public void onCanceled() {
                        listener.onCanceled();
                    }
                });
        return this;
    }

}
