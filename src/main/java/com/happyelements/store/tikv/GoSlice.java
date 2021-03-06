package com.happyelements.store.tikv;

import com.sun.jna.Pointer;
import com.sun.jna.Structure;

import java.util.Arrays;
import java.util.List;

/**
 * <i>native declaration : libmath.h</i><br>
 * This file was autogenerated by <a href="http://jnaerator.googlecode.com/">JNAerator</a>,<br>
 * a tool written by <a href="http://ochafik.com/">Olivier Chafik</a> that <a href="http://code.google.com/p/jnaerator/wiki/CreditsAndLicense">uses a few opensource projects.</a>.<br>
 * For help, please visit <a href="http://nativelibs4java.googlecode.com/">NativeLibs4Java</a> , <a href="http://rococoa.dev.java.net/">Rococoa</a>, or <a href="http://jna.dev.java.net/">JNA</a>.
 */
public class GoSlice extends Structure {
    /**
     * C type : void*
     */
    public Pointer data;
    /**
     * C type : GoInt
     */
    public long len;
    /**
     * C type : GoInt
     */
    public long cap;

    public GoSlice() {
        super();
    }

    protected List<?> getFieldOrder() {
        return Arrays.asList("data", "len", "cap");
    }

    /**
     * @param data C type : void*<br>
     * @param len  C type : GoInt<br>
     * @param cap  C type : GoInt
     */
    public GoSlice(Pointer data, long len, long cap) {
        super();
        this.data = data;
        this.len = len;
        this.cap = cap;
    }

    public GoSlice(Pointer peer) {
        super(peer);
    }

    public static class ByReference extends GoSlice implements Structure.ByReference {

    }

    ;

    public static class ByValue extends GoSlice implements Structure.ByValue {

    }

    ;
}
