package com.example.apicomretrofit;

@dagger.hilt.android.AndroidEntryPoint
@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\u000f\u001a\u00020\u000eH\u0002J\u0012\u0010\u0010\u001a\u00020\u000e2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0012H\u0014R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082.\u00a2\u0006\u0002\n\u0000R\u001b\u0010\u0007\u001a\u00020\b8BX\u0082\u0084\u0002\u00a2\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\t\u0010\n\u00a8\u0006\u0013"}, d2 = {"Lcom/example/apicomretrofit/MainActivity;", "Landroidx/appcompat/app/AppCompatActivity;", "()V", "adapter", "Lcom/example/apicomretrofit/ui/adapters/CharacterAdapter;", "binding", "Lbr/com/ulbra/apicomretrofit/databinding/ActivityMainBinding;", "charactersVielModel", "Lcom/example/apicomretrofit/ui/CharactersViewModel;", "getCharactersVielModel", "()Lcom/example/apicomretrofit/ui/CharactersViewModel;", "charactersVielModel$delegate", "Lkotlin/Lazy;", "configureRecycler", "", "observer", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class MainActivity extends androidx.appcompat.app.AppCompatActivity {
    private br.com.ulbra.apicomretrofit.databinding.ActivityMainBinding binding;
    private com.example.apicomretrofit.ui.adapters.CharacterAdapter adapter;
    @org.jetbrains.annotations.NotNull
    private final kotlin.Lazy charactersVielModel$delegate = null;
    
    public MainActivity() {
        super();
    }
    
    private final com.example.apicomretrofit.ui.CharactersViewModel getCharactersVielModel() {
        return null;
    }
    
    @java.lang.Override
    protected void onCreate(@org.jetbrains.annotations.Nullable
    android.os.Bundle savedInstanceState) {
    }
    
    private final void configureRecycler() {
    }
    
    private final void observer() {
    }
}