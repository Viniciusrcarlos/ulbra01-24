package com.example.apicomretrofit.ui;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\b0\u00070\u0006R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/apicomretrofit/ui/CharactersViewModel;", "Landroidx/lifecycle/ViewModel;", "charactersRepository", "Lcom/example/apicomretrofit/data/repositories/CharactersRepository;", "(Lcom/example/apicomretrofit/data/repositories/CharactersRepository;)V", "fetchCharacters", "Landroidx/lifecycle/LiveData;", "", "Lcom/example/apicomretrofit/data/Character;", "app_debug"})
@dagger.hilt.android.lifecycle.HiltViewModel
public final class CharactersViewModel extends androidx.lifecycle.ViewModel {
    @org.jetbrains.annotations.NotNull
    private final com.example.apicomretrofit.data.repositories.CharactersRepository charactersRepository = null;
    
    @javax.inject.Inject
    public CharactersViewModel(@org.jetbrains.annotations.NotNull
    com.example.apicomretrofit.data.repositories.CharactersRepository charactersRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final androidx.lifecycle.LiveData<java.util.List<com.example.apicomretrofit.data.Character>> fetchCharacters() {
        return null;
    }
}