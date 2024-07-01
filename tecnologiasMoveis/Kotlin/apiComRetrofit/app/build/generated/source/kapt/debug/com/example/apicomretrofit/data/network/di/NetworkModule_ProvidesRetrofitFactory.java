// Generated by Dagger (https://dagger.dev).
package com.example.apicomretrofit.data.network.di;

import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import retrofit2.Retrofit;

@ScopeMetadata("javax.inject.Singleton")
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class NetworkModule_ProvidesRetrofitFactory implements Factory<Retrofit> {
  @Override
  public Retrofit get() {
    return providesRetrofit();
  }

  public static NetworkModule_ProvidesRetrofitFactory create() {
    return InstanceHolder.INSTANCE;
  }

  public static Retrofit providesRetrofit() {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providesRetrofit());
  }

  private static final class InstanceHolder {
    private static final NetworkModule_ProvidesRetrofitFactory INSTANCE = new NetworkModule_ProvidesRetrofitFactory();
  }
}
