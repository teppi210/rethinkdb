// Autogenerated by metajava.py.
// Do not edit this file directly.
// The template for this file is located at:
// ../../../../../../../../templates/Exception.java
package com.rethinkdb.gen.exc;

import java.util.Optional;
import com.rethinkdb.ast.ReqlAst;
import com.rethinkdb.model.Backtrace;

public class ReqlServerCompileError extends ReqlCompileError {

    Optional<Backtrace> backtrace = Optional.empty();
    Optional<ReqlAst> term = Optional.empty();

    public ReqlServerCompileError() {
    }

    public ReqlServerCompileError(String message) {
        super(message);
    }

    public ReqlServerCompileError(String format, Object... args) {
        super(String.format(format, args));
    }

    public ReqlServerCompileError(String message, Throwable cause) {
        super(message, cause);
    }

    public ReqlServerCompileError(Throwable cause) {
        super(cause);
    }

    public ReqlServerCompileError(String msg, ReqlAst term, Backtrace bt) {
        super(msg);
        this.backtrace = Optional.ofNullable(bt);
        this.term = Optional.ofNullable(term);
    }

    public ReqlServerCompileError setBacktrace(Backtrace backtrace) {
        this.backtrace = Optional.ofNullable(backtrace);
        return this;
    }

    public Optional<Backtrace> getBacktrace() {
        return backtrace;
    }

    public ReqlServerCompileError setTerm(ReqlAst term) {
        this.term = Optional.ofNullable(term);
        return this;
    }

    public Optional<ReqlAst> getTerm() {
        return this.term;
    }
}