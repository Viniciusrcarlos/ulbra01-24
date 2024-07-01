// Generated by Dagger (https://dagger.dev).
package com.example.apicomretrofit.data.network.di;

import com.example.apicomretrofit.data.network.CharactersApi;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.Preconditions;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;
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
public final class NetworkModule_ProvidersCharactersServiceFactory implements Factory<CharactersApi> {
  private final Provider<Retrofit> retrofitProvider;

  public NetworkModule_ProvidersCharactersServiceFactory(Provider<Retrofit> retrofitProvider) {
    this.retrofitProvider = retrofitProvider;
  }

  @Override
  public CharactersApi get() {
    return providersCharactersService(retrofitProvider.get());
  }

  public static NetworkModule_ProvidersCharactersServiceFactory create(
      Provider<Retrofit> retrofitProvider) {
    return new NetworkModule_ProvidersCharactersServiceFactory(retrofitProvider);
  }

  public static CharactersApi providersCharactersService(Retrofit retrofit) {
    return Preconditions.checkNotNullFromProvides(NetworkModule.INSTANCE.providersCharactersService(retrofit));
  }
}
