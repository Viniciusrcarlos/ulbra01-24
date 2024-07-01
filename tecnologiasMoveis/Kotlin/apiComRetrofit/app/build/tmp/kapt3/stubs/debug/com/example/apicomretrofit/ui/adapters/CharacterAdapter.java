package com.example.apicomretrofit.ui.adapters;

@kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\f\u0012\b\u0012\u00060\u0002R\u00020\u00000\u0001:\u0001\u0017B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u000b\u001a\u00020\fH\u0016J\u001c\u0010\r\u001a\u00020\u000e2\n\u0010\u000f\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0010\u001a\u00020\fH\u0016J\u001c\u0010\u0011\u001a\u00060\u0002R\u00020\u00002\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\fH\u0016J\u0014\u0010\u0015\u001a\u00020\u000e2\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\n0\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082.\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0082\u000e\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0018"}, d2 = {"Lcom/example/apicomretrofit/ui/adapters/CharacterAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lcom/example/apicomretrofit/ui/adapters/CharacterAdapter$ViewRolder;", "()V", "binding", "Lbr/com/ulbra/apicomretrofit/databinding/CharacterItemBinding;", "context", "Landroid/content/Context;", "listCharacters", "", "Lcom/example/apicomretrofit/data/Character;", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "setUpCharacters", "characters", "ViewRolder", "app_debug"})
public final class CharacterAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<com.example.apicomretrofit.ui.adapters.CharacterAdapter.ViewRolder> {
    private br.com.ulbra.apicomretrofit.databinding.CharacterItemBinding binding;
    private android.content.Context context;
    @org.jetbrains.annotations.NotNull
    private java.util.List<com.example.apicomretrofit.data.Character> listCharacters;
    
    public CharacterAdapter() {
        super();
    }
    
    public final void setUpCharacters(@org.jetbrains.annotations.NotNull
    java.util.List<com.example.apicomretrofit.data.Character> characters) {
    }
    
    @java.lang.Override
    @org.jetbrains.annotations.NotNull
    public com.example.apicomretrofit.ui.adapters.CharacterAdapter.ViewRolder onCreateViewHolder(@org.jetbrains.annotations.NotNull
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override
    public int getItemCount() {
        return 0;
    }
    
    @java.lang.Override
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull
    com.example.apicomretrofit.ui.adapters.CharacterAdapter.ViewRolder holder, int position) {
    }
    
    @kotlin.Metadata(mv = {1, 9, 0}, k = 1, xi = 48, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\t"}, d2 = {"Lcom/example/apicomretrofit/ui/adapters/CharacterAdapter$ViewRolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "bindingHolder", "Lbr/com/ulbra/apicomretrofit/databinding/CharacterItemBinding;", "(Lcom/example/apicomretrofit/ui/adapters/CharacterAdapter;Lbr/com/ulbra/apicomretrofit/databinding/CharacterItemBinding;)V", "bind", "", "character", "Lcom/example/apicomretrofit/data/Character;", "app_debug"})
    public final class ViewRolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        @org.jetbrains.annotations.NotNull
        private final br.com.ulbra.apicomretrofit.databinding.CharacterItemBinding bindingHolder = null;
        
        public ViewRolder(@org.jetbrains.annotations.NotNull
        br.com.ulbra.apicomretrofit.databinding.CharacterItemBinding bindingHolder) {
            super(null);
        }
        
        public final void bind(@org.jetbrains.annotations.NotNull
        com.example.apicomretrofit.data.Character character) {
        }
    }
}