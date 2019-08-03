package org.ahocorasick.trie.handler;

import org.ahocorasick.trie.Emit;

public interface EmitHandler<T> {
    boolean emit(Emit<T> emit);
}
