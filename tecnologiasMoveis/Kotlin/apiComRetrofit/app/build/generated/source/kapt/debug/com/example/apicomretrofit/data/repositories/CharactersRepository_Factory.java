// Generated by Dagger (https://dagger.dev).
package com.example.apicomretrofit.data.repositories;

import com.example.apicomretrofit.data.datasources.CharactersDataSource;
import dagger.internal.DaggerGenerated;
import dagger.internal.Factory;
import dagger.internal.QualifierMetadata;
import dagger.internal.ScopeMetadata;
import javax.inject.Provider;

@ScopeMetadata
@QualifierMetadata
@DaggerGenerated
@SuppressWarnings({
    "unchecked",
    "rawtypes",
    "KotlinInternal",
    "KotlinInternalInJava"
})
public final class CharactersRepository_Factory implements Factory<CharactersRepository> {
  private final Provider<CharactersDataSource> dataSourceProvider;

  public CharactersRepository_Factory(Provider<CharactersDataSource> dataSourceProvider) {
    this.dataSourceProvider = dataSourceProvider;
  }

  @Override
  public CharactersRepository get() {
    return newInstance(dataSourceProvider.get());
  }

  public static CharactersRepository_Factory create(
      Provider<CharactersDataSource> dataSourceProvider) {
    return new CharactersRepository_Factory(dataSourceProvider);
  }

  public static CharactersRepository newInstance(CharactersDataSource dataSource) {
    return new CharactersRepository(dataSource);
  }
}